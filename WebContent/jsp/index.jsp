<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login welcome</title>
</head>
<body>
	<div>
		<form action="../staff/login" method="post">
			act:<input type="text" id="act" name="jobId" /><br />
			pwd:<input type="password" id="pwd" name="staffPwd" /><br />
			<input type="submit" name="submit" value="login" />
			<input type="reset" name="reset" value="reset" />
		</form>
	</div>
</body>
</html>