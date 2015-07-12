package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

import com.clusterpoint.api.CPSConnection;
import com.clusterpoint.api.request.CPSSearchRequest;
import com.clusterpoint.api.response.CPSSearchResponse;
import com.clusterpoint.api.response.listwords.CPSListWordsContent.List;

/**
 * Servlet implementation class Retrieve
 */
@WebServlet("/Retrieve")
public class Retrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Retrieve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try
		{
		  CPSConnection conn = new CPSConnection("tcps://cloud-us-0.clusterpoint.com:9008", "DB", "Uname", "password", "Acc_id", "document", "//document/id"); 

		  
		  CPSSearchRequest search_req = new CPSSearchRequest("*", 0, 10);
		//set aggregation query
		search_req.setParam("aggregate","id,link group by link");
		CPSSearchResponse search_resp = (CPSSearchResponse) conn.sendRequest(search_req);
		//iterator
		for(Entry<String, java.util.List<HashMap<String, String>>> entry : search_resp.getAggregates().entrySet())
		{			
			System.out.println("Aggregate: " + entry.getKey());
			for (HashMap<String, String> row : entry.getValue())
			  {
			     System.out.println(row.get("id") + " link:" + row.get("link"));
			  }

		}	
		System.out.println("Result aggregated: "+search_resp.getHits());
		System.out.println("Seconds: "+search_resp.getSeconds());
		conn.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
