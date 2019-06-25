<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1>Board Write</h1>
	<br>
	<form action="./boardWrite" method="post">
		<div class="form-group">
		  <label for="title">Title:</label>
 		 <input class="form-control" type="text" id="title" name="title">
		</div>
		<div class="form-group">
		  <label for="writer">Writer:</label>
 		 <input class="form-control" type="text" id="writer" name="writer">
		</div>
		<div class="form-group">
		  <label for="num">Num:</label>
 		 <input class="form-control" type="text" id="num" name="num">
		</div>
		<div class="form-group">
		  <label for="contents">Contents:</label>
 		 <textarea class="form-control" rows="5" id="contents" name="contents"></textarea>
		</div>
		<p>
			<input type="checkbox" name="check" value="v1">
			<input type="checkbox" name="check" value="v2">
			<input type="checkbox" name="check" value="v3">
			<input type="checkbox" name="check" value="v4">
		</p>
		<div>
			<button class="btn btn-primary">Write</button>
		</div>
	</form>
</div>

</body>
</html>