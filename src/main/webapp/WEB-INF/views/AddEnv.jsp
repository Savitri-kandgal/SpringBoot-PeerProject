<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Environment</title>
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
				<li><a href="AddAppInfo.jsp"><span
						class="glyphicon glyphicon-user"></span>Add App Info</a></li>
			</ul>
		</div>
	</nav>
	<form action="addappinfo.do" method="post">
		<div class="container">
			<h3>
				<mark>ENV Details</mark>
			</h3>
			<table class="table table-hover">
				<tbody class="form-inline">
					<tr>
						<td>ENVIRONMENT:</td>
						<td><input id="env" type="text" name="env"
							placeholder="enter the ENV"></td>
					</tr>
					<tr>
						<td>URL:</td>
						<td><input id="url" type="text" name="url"
							placeholder="Enter the URL"></td>
					</tr>
					<tr>
						<td><label>Accessible:</label> <select name="accessible"
							class="form-control">
								<option>--select--</option>
								<option>Yes</option>
								<option>No</option>
						</select></td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="text-center">
			<button type="submit">Save</button>
		</div>
		<div class="footer">
			<p>
				<a href="ContactInfo.jsp"><h4>
						<u>Contact Details</u>
					</h4></a>
			</p>
		</div>
	</form>
</body>
</body>
</html>