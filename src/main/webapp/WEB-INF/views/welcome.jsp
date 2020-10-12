<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	height: 50px;
	padding-top: 1em;
	background-color: black;
	color: white;
	text-align: center;
}
</style>

</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<p class="navbar-text" style="color: white; font-size: 20px;">X-Workz</p>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="AddAppInfo1.jsp"><span
class="glyphicon glyphicon-user"></span>Add App Info</a></li>
			</ul>
		</div>
	</nav>
	<form action="onclick" method="post">
		<div class="container">
			<h3>
				<mark>Message Details</mark>
			</h3>
			<table class="table table-hover">
				<tbody class="form-inline">
					<tr>
						<td>From:</td>
						<td><input id="from" type="text" name="fName"
							placeholder="enter the FROM name"></td>
					</tr>
					<tr>
						<td>To:</td>
						<td><input id="to" type="text" name="tName" placeholder="Enter the TO name"></td>
					</tr>
					<tr>
						<td>Message:</td>
						<td><textarea rows="4" cols="70" id="msg" name="message"
								placeholder="Enter the Message"></textarea></td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="text-center">
			<button type="submit">Send</button>
		</div>
	<div class="footer">
 <p> <a href="ContactInfo.jsp"><u><h4>Contact Details</h4></u></a></p>
 </div>
	</form>
</body>

</html>