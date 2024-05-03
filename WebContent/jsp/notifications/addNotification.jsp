<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
		<div id="nav-wrapper">
				<jsp:include page="../common/header.jsp" />
	</div>
	<section id="title-wrapper">
		<h2 id="title">공지사항</h2>
	</section>
	<section id="setNotifications-section">
		<article class="setNotification-contents">
			<form action="controller?cmd=addNotificationAction"  method="post" >
				<div class="setNotification-set-wrapper">
					<div class="setNotification-title-wrapper">
						<h3>제목</h3>
						<div class="setNotification-title-input-wrapper">
							<input name="title"  />
						</div>
					</div>
				</div>
				<div class="setNotification-input-wrapper">
					<textarea name="description"  rows="20" cols="50"></textarea>
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
	<script src="scripts/notifications/addNotification.js"></script>
</body>
</html>

