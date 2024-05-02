<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="vo.customVo.NotificationVO"%>
	 	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<link rel="stylesheet" href="css/format.css" />
<link rel="stylesheet" href="css/notifications.css" />
</head>
<body id="content-wrapper">
	<jsp:include page="../common/header.jsp" />
	<section id="title-wrapper">
		<h2 id="title">공지사항</h2>
	</section>
	<section id="setNotifications-section">
		<article class="setNotification-contents">
			<form action="controller?cmd=setNotificationAction&notificationId=${data.notificationId }"  method="post" >
				<div class="setNotification-set-wrapper">
					<div class="setNotification-title-wrapper">
						<h3>제목</h3>
						<div class="setNotification-title-input-wrapper">
							<input name="title"  value ="${data.title}" />
						</div>
					</div>
				</div>
				<div class="setNotification-input-wrapper">
					<textarea name="description" rows="20" cols="50" >${data.description }</textarea>
				</div>
				<div id="setNotification-btn-wrapper">
					<button  type=submit  id="setNotification-enroll-btn"  class="setNotification-btn-setting">
						등록</button>
					<button id="setNotification-concel-btn" class="setNotification-btn-setting">
						취소</button>
				</div>
			</form>
		</article>
	</section>
	<footer></footer>
	<script src="scripts/notifications/notificationBoard.js"></script>
</body>
</html>
