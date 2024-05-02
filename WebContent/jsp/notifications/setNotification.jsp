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
		<div id="nav-wrapper">
			<div id="top-logo">
				<img src="assets/kosta-logo.png" alt="" />
			</div>
			<ul id="nav-ul">
				<li id="nav-notification" class="nav-li"><a
					href="#notifications">공지사항</a></li>
				<li id="nav-course" class="nav-li"><a href="#courses">과정 관리</a>
				</li>
				<li id="nav-certification" class="nav-li"><a
					href="#certifications">수료증 관리</a></li>
				<li id="nav-scholarship" class="nav-li"><a href="#scholarships">장학금
						관리</a></li>
				<li id="nav-benefit" class="nav-li"><a href="#benefits">훈련수당
						관리</a></li>
				<li id="nav-student" class="nav-li"><a href="#students">수강생
						관리</a></li>
			</ul>
			<div id="header-btns">
				<div class="btn-wrapper">
					<button id="logout-btn" type="button">로그아웃</button>
				</div>
				<div class="btn-wrapper" id="setting-btn-wrapper">
					<button id="setting-btn" type="button"></button>
				</div>
			</div>
		</div>
	</div>
	<section id="title-wrapper">
		<h2 id="title">공지사항</h2>
	</section>
	<section id="setNotifications-section">
		<article class="setNotification-contents">
			<form action="controller?cmd=setNotificationAction"  method="put" >
				<div class="setNotification-set-wrapper">
					<div class="setNotification-title-wrapper">
						<h3>제목</h3>
						<div class="setNotification-title-input-wrapper">
							<input name="title"  value ="${data.title}" />
						</div>
					</div>
				</div>
				<div class="setNotification-input-wrapper">
					<input name="description"  value ="${data.description}"/>
				</div>
				<div id="setNotification-btn-wrapper">
					<button  type="submit"  id="enroll-btn" class="setNotification-btn-setting">
						등록</button>
					<button id="delete-btn" class="setNotification-btn-setting">
						취소</button>
				</div>
			</form>
		</article>
	</section>
	<footer></footer>
	<script src="scripts/notifications/notificationBoard.js"></script>
</body>
</html>
