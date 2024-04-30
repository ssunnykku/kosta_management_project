<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" />
<title>login</title>
</head>
<body>
	<div class="login-wrapper">
		<h2>관리자 로그인</h2>
		<form action="controller?cmd=loginAction" method="post"
			id="login-form"
		>
			<div>
				<h4>Manager ID</h4>
				<input type="text" id="manager_id" name="manager_id" />
			</div>
			<div>
				<h4>Password</h4>
				<input type="password" id="password" name="password" />
			</div>
			<button type="submit">Login</button>
		</form>
	</div>
</body>