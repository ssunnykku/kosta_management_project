<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<script src="http://code.jquery.com/jquery-latest.js"></script>

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/login.css"
/>
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
				<div id="id-check" align="center">~안내창~</div>
			</div>
			<div>
				<h4>Password</h4>
				<input type="password" id="password" name="password" />
			</div>
			<button type="submit">Login</button>
		</form>
	</div>

	<script>
	$('#manager_id').on("change", function(){
		console.log($(this).val());
		$.ajax({
			url : "controller?cmd=idCheckAction",
			data : {manager_id : $(this).val()},
			success : function(responseText){
				console.log(responseText);
				console.log(responseText == 'N');
				console.log(responseText.length);
				if (responseText.charAt(responseText.length-1) == "N") {
					// document.querySelector('#id-check').innerText("존재하는 아이디입니다.");
					$('#id-check').text("존재하는 아이디입니다.");
				}else{
					//document.querySelector('#id-check').innerText("존재하지 않는 아이디입니다.");
					$('#id-check').text("존재하지 않는 아이디입니다.");
				}
			}
		});
	});
	</script>
</body>