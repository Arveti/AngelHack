<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cluster Test</title>
</head>
<body>
<h1>Cluster Test</h1><br>

<form action="Insert">
 <input type="submit" value="Insert">
</form>

<form action="Retrieve">
 <input type="submit" value="Retrieve">
 </form>
 <<br>
 <form enctype="multipart/form-data" method="post" action="UploadImg">
 <input type="file" name="img">
 <input type="submit" value="upload">
 </form>
</body>
</html>