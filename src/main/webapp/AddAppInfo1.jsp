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
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
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

	<!-- <form action="/sendModel" method="post" id="sendModelData"></form> -->
	<form action="/onSaveAppInfo" method="post" id="saveAppInfo">
		<div class="container">
			<h3>
				<mark>App Details</mark>
			</h3>
			<table class="table table-hover">
				<tbody class="form-inline">
					<tr>
						<td>Project Name:</td>
						<td><input id="pn" type="text" name="pName"
							class="form-control" placeholder="enter the project name"
							form="saveAppInfo"></td>
					</tr>
					<tr>
						<td>Team Manager:</td>
						<td><input id="tm" type="text" name="tManager"
							class="form-control" placeholder="Enter the Manager name"
							form="saveAppInfo"></td>
					</tr>
					<tr>
						<td>Team Contact Email:</td>
						<td><input type="text" name="tEmail" class="form-control"
							id="eadd" placeholder="Enter Team Contact Email ID"
							form="saveAppInfo"><br>
					</tr>
					<tr>
						<td><label>De-Comissined :</label> <select name="dComissined"
							class="form-control" form="saveAppInfo">
								<option>--select--</option>
								<option>Yes</option>
								<option>No</option>
						</select></td>
					</tr>


					<tr>
						<td>Developed Date:</td>
						<td><input type="date" name="dDate" class="form-control"
							id="eadd" placeholder="Enter Developeds Date" form="saveAppInfo"><br>
					</tr>
					<tr>
						<td>Version:</td>
						<td><input type="text" name="version" class="form-control"
							id="eadd" placeholder="Enter Version" form="saveAppInfo"><br>
					</tr>
					<tr>
						<td>Last Released:</td>
						<td><input type="date" name="lReleased" class="form-control"
							id="eadd" placeholder="Enter Last released date"
							form="saveAppInfo"><br>
					</tr>
					<tr>
						<td>Next Released:</td>
						<td><input type="date" name="nReleased" class="form-control"
							id="eadd" placeholder="Enter Next released date"
							form="saveAppInfo">
					</tr>

					<div>
						<button type="button" class="btn btn-info" data-toggle="modal"
							data-target="#myModal">Add Environment</button>

						<div id="showEnvironment"></div>

						<div class="modal fade" id="myModal">
							<div class="modal-dialog modal-sm">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title">Environment Details:</h5>
										<button type="button" class="close" data-dismiss="modal">&times;</button>
									</div>
									<div class="modal-body">
										<div class="form-group">
											<label for="environment">----Select Environment---</label> <select
												class="form-control" id="environment" name="env"
												form="sendModelData">
												<option>Development</option>
												<option>UAT</option>
												<option>SIT</option>
												<option>Production</option>
												<option>Others</option>
											</select>
										</div>

										<div class="form-group">
											<label for="url">URL:</label> <input type="text"
												form="sendModelData" class="form-control" id="url"
												placeholder="Enter url" name="url">
										</div>


										<div class="form-group">
											<label>Accessible: </label> <label class="radio-inline"
												form="sendModelData"> <input type="radio"
												name="isAccessible" value="true" checked="checked">
												Yes
											</label> <label class="radio-inline"> <input type="radio"
												name="isAccessible" value="false"> No
											</label>
										</div>

										<div>
											<button type="button" class="btn btn-success btn-block"
												onclick="addEnvironment()" id="sendModelData"
												form="sendModelData">save</button>
										</div>


									</div>

									<div class="modal-footer">
										<button type="button" class="btn btn-danger"
											data-dismiss="modal" id="closeModal">close</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</tbody>
			</table>
		</div>
		<div class="text-center" class="btn btn-success">
			<button type="submit" class="btn btn-success">Add</button>
		</div>
		<div class="footer">
			<p>
				<a href="ContactInfo.jsp"><h4>
						<u>Contact Details</u>
					</h4></a>
			</p>
		</div>
	</form>



	<script>
		var detailsOfEnv = [];
		function addEnvironment() {
			var env = document.getElementById("environment");
			var result = env.options[env.selectedIndex].text;
			var url = document.getElementById("url").value;
			console.log(result);
			console.log(url);

			var isAccessibleData = document.getElementsByName("isAccessible");
			console.log(isAccessibleData);
			console.log("isAccessibleData:>>> ", isAccessibleData[0].checked);
			var environmentDetails = {
				'environment' : result,
				'url' : url,
				'accessible' : isAccessibleData[0].checked
			};
			console.log(environmentDetails);
			detailsOfEnv.push(environmentDetails);
			displayTable();
		}

		// #start sending modal data to controller
		var postData = {
			env : document.getElementById("environment"),
			url : document.getElementById("url").value,
			isAccessible : document.getElementsByName("isAccessible")
		};
		console.log("Object is : " + postData);

		function displayTable() {
			var environmentData = " "
			environmentData = "<table border='1' class='table table-striped'><tr> <th>Environment</th> <th>URL</th> <th>IsAccessible</th> </tr>";
			for (var i = 0; i < detailsOfEnv.length; i++) {
				environmentData = environmentData
						+ "<tr> <td><input type='hidden' name='environmentList["+i+"].environment' value='"+detailsOfEnv[i].environment+"' /> "
						+ detailsOfEnv[i].environment
						+ "</td>	<td><input  type='hidden' name='environmentList["+i+"].url' value='"+detailsOfEnv[i].url+"' />"
						+ detailsOfEnv[i].url
						+ "</td> <td><input  type='hidden' name='environmentList["+i+"].isAccessible' value='"+detailsOfEnv[i].accessible+"' /> "
						+ detailsOfEnv[i].accessible + "</td> </tr>";
			}
			environmentData = environmentData + "</table>";
			console.log(environmentData);
			document.getElementById("showEnvironment").innerHTML = environmentData
			document.getElementById("closeModal").click();
		}
	</script>
</body>
</html>