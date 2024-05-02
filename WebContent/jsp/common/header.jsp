<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" href="css/header.css" />
<div id="header">
	<section id="nav-wrapper">
		<div id="top-logo">
			<img src="assets/kosta-logo.png" alt="kosta-edu-logo" />
		</div>
		<ul id="nav-ul">
			<li id="nav-notification" class="nav-li"><a
				href="controller?cmd=notificationBoardUI">공지사항</a></li>
			<li id="nav-course" class="nav-li"><a
				href="controller?cmd=courseBoardUI">과정 관리</a></li>
			<li id="nav-certification" class="nav-li"><a
				href="#certifications">수료증 관리</a></li>
			<li id="nav-scholarship" class="nav-li"><a
				href="controller?cmd=scholarshipBoardUI">장학금 관리</a></li>
			<li id="nav-benefit" class="nav-li"><a
				href="controller?cmd=benefitBoardUI">지원금 관리</a></li>
			<li id="nav-student" class="nav-li"><a href="#students">수강생
					관리</a></li>
		</ul>
		<div id="header-btns">
			<form action="controller?cmd=logoutAction" method="post"
				class="btn-wrapper">
				<button id="logout-btn" type="submit">로그아웃</button>
			</form>
			<div class="btn-wrapper" id="setting-btn-wrapper">
				<button id="setting-btn" type="button"></button>
			</div>
	</section>
	  	<jsp:include page="./dropdown.jsp" />
</div>
