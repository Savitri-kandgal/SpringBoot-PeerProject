<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="onclick" method="post">
		<div>
			From: <input id="from" type="text" name="fName" placeholder="from">
		</div>
		<br>
		<div>
			To: <input id="to" type="text" name="tName" placeholder="to">
		</div>
		<br>
		<div>
			Message:
			<textarea rows="4" cols="70" id="msg" name="message"
				placeholder="message"></textarea>
		</div>

		<button type="submit">Send</button>
	</form>
</body>
</html>