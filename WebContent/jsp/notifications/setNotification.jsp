<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/format.css"
/>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/notifications.css"
/>
</head>
<body id="content-wrapper">
	<div id="header">
		<%@ include file="../header.jsp"%>
	</div>
	<section id="title-wrapper">
		<h2 id="title">공지사항</h2>
	</section>
	<section id="setNotifications-section">
		<article class="setNotification-contents">
			<form
				method="post"
			>
				<div class="setNotification-set-wrapper">
					<div class="setNotification-title-wrapper">
						<h3>제목</h3>
						<div class="setNotification-title-input-wrapper">
							<input name="title" value="${notificationVO.title}">
						</div>
					</div>
				</div>
				<div class="setNotification-input-wrapper">
					<input name="description" value="${notificationVO.description}" />
				</div>
				<div id="setNotification-btn-wrapper">
					<button type="submit" id="enroll-btn"
						class="setNotification-btn-setting"
						formaction="controller?cmd=setNotification&notificationId=${notificationVO.notificationId}"
					>수정</button>
					<button id="delete-btn" class="setNotification-btn-setting">
						취소</button>
				</div>
			</form>
		</article>
	</section>
	<footer></footer>
	<script
		src="${pageContext.request.contextPath}/scripts/notifications/notificationBoard.js"
	></script>
</body>
</html>