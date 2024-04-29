<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${managerId == null}">
	<script>
		alert('회원 전용 페이지는 로그인 필수');
		location.href = "controller?cmd=loginUI";
	</script>
</c:if>

<c:if test="${managerId != null}">
	${managerId}님 환영합니다.
</c:if>

${sessionScope.managerId}
뭐임???