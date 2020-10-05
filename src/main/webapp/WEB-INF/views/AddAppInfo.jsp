<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App Information</title>
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
				<li><a href="welcome.jsp"><span
						class="glyphicon glyphicon-user"></span>Home</a></li>
			</ul>
		</div>
	</nav>
	<form action="addappinfo.do" method="post">
		<div class="container">
			<h3>
				<mark>App Details</mark>
			</h3>
			<table class="table table-hover">
				<tbody class="form-inline">
					<tr>
						<td>Project Name:</td>
						<td><input id="pn" type="text" name="pName"
							placeholder="enter the project name"></td>
					</tr>
					<tr>
						<td>Team Manager:</td>
						<td><input id="tm" type="text" name="tManager"
							placeholder="Enter the Manager name"></td>
					</tr>
					<tr>
						<td>Team Contact Email:</td>
						<td><input type="text" name="tEmail" class="form-control"
							id="eadd" placeholder="Enter Team Contact Email ID"><br>
					</tr>
					<tr>
						<td><label>De-Comissined :</label> <select name="dComissined"
							class="form-control">
								<option>--select--</option>
								<option>Yes</option>
								<option>No</option>
						</select></td>
					</tr>
					<tr>
						<td>Developed Date:</td>
						<td><input type="text" name="dDate" class="form-control"
							id="eadd" placeholder="Enter Developeds Date"><br>
					</tr>
					<tr>
						<td>Version:</td>
						<td><input type="text" name="version" class="form-control"
							id="eadd" placeholder="Enter Version"><br>
					</tr>
					<tr>
						<td>Last Released:</td>
						<td><input type="text" name="lReleased" class="form-control"
							id="eadd" placeholder="Enter Last released date"><br>
					</tr>
					<tr>
						<td>Next Released:</td>
						<td><input type="text" name="nReleased" class="form-control"
							id="eadd" placeholder="Enter Next released date"><br>
					</tr>
						<a href="AddEnv.jsp">Add ENV</a>
				</tbody>
			</table>
		</div>
		<div class="text-center">
			<button type="submit">Add</button>
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
</html>