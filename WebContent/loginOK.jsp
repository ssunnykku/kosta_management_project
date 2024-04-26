<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	if(session.getAttribute("loginId") == null) {
		%>
		<script>
			alert('회원 전용 페이지 로그인 필수');
			location.href="controller?cmd=loginUI";
		</script>
		<%
	}
%>

    <h1>회원 전용 페이지</h1>