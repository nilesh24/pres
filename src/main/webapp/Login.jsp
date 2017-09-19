<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Index</h1>
	<form action="/pres/serv/forms/addUser" method="post">
		Name : <input type="text" name="name"><br />
		 Age : <input type="text" name="age"><br /> 
			City : <input type="text"
			name="city"><br /> 
			Email : <input type="email" name="email"><br />
			Password : <input type="password" name="password"><br />
			Reconfirm Password : <input type="password" name="reConfirm"><br />
			<input type="input" name="enabled" value="true"><br />
			<input type="submit" value=" Hello " />
	</form>

	<form action="/pres/serv/forms/getUser" method="get">
		User name : <input type="text" name="name"><br />
		 <input type="submit" value="Search" />
	</form>

</body>