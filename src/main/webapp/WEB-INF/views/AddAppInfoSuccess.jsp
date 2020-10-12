<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<H3 style="color:red;">App Information Has successfully saved in DataBase</H3>
 
 <h4 style="color:blue;">Project Name: ${appDTO.getpName()}</h4>
 <h4 style="color:blue;">Project Manager: ${appDTO.gettManager()}</h4>
 <h4 style="color:blue;">Email address: ${appDTO.gettEmail()}</h4>
 <h4 style="color:blue;">Developed date: ${appDTO.getdDate()}</h4>
 <h4 style="color:blue;">Version: ${appDTO.getVersion()}</h4>
 <h4 style="color:blue;">Last Released date: ${appDTO.getlReleased()}</h4>
 <h4 style="color:blue;">Environment: ${envDTO.getEnv()}</h4>
<h4 style="color:blue;">URL: ${envDTO.getUrl()}</h4>

</body>
</html>