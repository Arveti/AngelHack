package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.filechooser.FileFilter;
import java.awt.image.renderable.ParameterBlock;
import javax.media.jai.InterpolationNearest;
import javax.media.jai.JAI;
import javax.media.jai.iterator.RandomIterFactory;
import javax.media.jai.iterator.RandomIter;
import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

public final class Mainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      Similar kb = null;
      synchronized (_jspx_page_context) {
        kb = (Similar) _jspx_page_context.getAttribute("kb", PageContext.PAGE_SCOPE);
        if (kb == null){
          kb = new Similar();
          _jspx_page_context.setAttribute("kb", kb, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      FilterJPG qb = null;
      synchronized (_jspx_page_context) {
        qb = (FilterJPG) _jspx_page_context.getAttribute("qb", PageContext.PAGE_SCOPE);
        if (qb == null){
          qb = new FilterJPG();
          _jspx_page_context.setAttribute("qb", qb, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Bootstrap Demo</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/mystyle.css\">\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Bree+Serif&effect=3d' rel='stylesheet' type='text/css'>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");

    File name=new File("C:/Users/Wonder/Documents/NetBeansProjects/Genfash/Images/10.jpeg");
Similar sim = new Similar();
try{
  String[] parameters = sim.Similar(name);
  for(String x : parameters){
   System.out.print(x);
}
}
catch(Exception e)
{
System.out.print(e.getMessage());
}



      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<header class=\"container text-center\">\r\n");
      out.write("\t<h1 class=\"primary-color font-effect-3d\">Bootstrap Demo</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t");

				for (int i = 1; i < 19; i++) {
		 	
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg-3 col-md-4 box\">\r\n");
      out.write("\t\t\t\t<div class=\"row text-center\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"image");
      out.print(i);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"http://genfash.eu-gb.mybluemix.net/Images/");
      out.print(i);
      out.write(".jpeg\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row footbox bg-success\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6 \">\r\n");
      out.write("\t\t\t\t\t\t<h5>Corelational Difference</h5>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t\t<h5>Rs 500</h5>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
