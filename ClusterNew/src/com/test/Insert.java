package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clusterpoint.api.CPSConnection;
import com.clusterpoint.api.request.CPSInsertRequest;
import com.clusterpoint.api.response.CPSModifyResponse;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
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

		  // Inserting test documents.
		  List<String> docs = new ArrayList<String>();
		  for(int i=300;i<301;i++){
		  docs.add("<document><id>image"+i+"</id><link>genfash.eu-gb.mybluemix.net/Images/"+i+".jpeg</link></document>");
		  }
		  //Create Insert request
		  CPSInsertRequest insert_req = new CPSInsertRequest();
		  //Add documents to request
		  insert_req.setStringDocuments(docs);
		  //Send request
		  CPSModifyResponse insert_resp = (CPSModifyResponse) conn.sendRequest(insert_req);
		  //Print out inserted document ids
		  System.out.println("Inserted ids: " + Arrays.toString(insert_resp.getModifiedIds()));
		 
		  //Close connection
		  conn.close();
		} catch (Exception e)  {
		  e.printStackTrace();
		  System.out.println(e.getMessage());
		} 
		
		response.sendRedirect("Success.jsp");
	}

}
