<%@page import="javax.swing.filechooser.FileFilter"%>
<%@page import="java.awt.image.renderable.ParameterBlock"%>
<%@page import="javax.media.jai.InterpolationNearest"%>
<%@page import="javax.media.jai.JAI"%>
<%@page import="javax.media.jai.iterator.RandomIterFactory"%>
<%@page import="javax.media.jai.iterator.RandomIter"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.awt.image.RenderedImage"%>
<%@page import="java.awt.Color"%>
<%@page import="java.io.File"%>
<%@page import="java.io.IOException"%>
<jsp:useBean id="kb" class="Similar"/>
<jsp:useBean id="qb" class="FilterJPG"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Demo</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-theme.min.css">
<link rel="stylesheet" href="css/mystyle.css">
<link href='http://fonts.googleapis.com/css?family=Bree+Serif&effect=3d' rel='stylesheet' type='text/css'>
<script src="js/bootstrap.min.js"></script>

<%
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


%>
</head>
<body>

	<header class="container text-center">
	<h1 class="primary-color font-effect-3d">Bootstrap Demo</h1>
	</header>

	<div class="container">
		<div class="row">
			<%
				for (int i = 1; i < 19; i++) {
		 	%>
			<div class="col-lg-3 col-md-4 box">
				<div class="row text-center">
					<img alt="image<%=i%>"
						src="http://genfash.eu-gb.mybluemix.net/Images/<%=i%>.jpeg">
				</div>
				<div class="row footbox bg-success">
					<div class="col-lg-6 ">
						<h5>Corelational Difference</h5>
					</div>
					<div class="col-lg-6">
						<h5>Rs 500</h5>
					</div>
				</div>
			</div>
			<%
				}
			%>
		</div>
	</div>
</body>
</html>