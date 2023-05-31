<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<form action="/contactForm" method="POST">
		
		<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="name" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter name"
					name="name">
			</div>
			
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email"
					name="email"> 
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Password"
					name="email">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Check</label> <input
					type="check" class="form-control" name="check">
			</div>
			
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>
</body>
</html>