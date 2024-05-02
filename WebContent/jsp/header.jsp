<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<div id="nav-wrapper">
	<div id="top-logo">
		<img src="${pageContext.request.contextPath}/assets/kosta-logo.png"
			alt=""
		/>
	</div>
	<ul id="nav-ul">
		<li id="nav-notification" class="nav-li"><a
			href="controller?cmd=notificationBoardUI"
		>공지사항</a></li>
		<li id="nav-course" class="nav-li"><a
			href="controller?cmd=courseBoardUI"
		>과정 관리</a></li>
		<li id="nav-certification" class="nav-li"><a
			href="controller?cmd=certificationBoardUI"
		>수료증 관리</a></li>
		<li id="nav-scholarship" class="nav-li"><a
			href="controller?cmd=scholarshipsBoardUI"
		>장학금 관리</a></li>
		<li id="nav-benefit" class="nav-li"><a
			href="controller?cmd=benefitsBoardUI"
		>지원금 관리</a></li>
		<li id="nav-student" class="nav-li"><a
			href="controller?cmd=studentBoardUI"
		>수강생 관리</a></li>
	</ul>
	<div id="header-btns">
		<div class="btn-wrapper">
			<form action="controller?cmd=logoutAction" method="post">
				<button id="logout-btn" type="submit">로그아웃</button>
			</form>
		</div>
		<div class="btn-wrapper" id="setting-btn-wrapper">
			<button id="setting-btn" type="button"></button>
		</div>
	</div>
</div>