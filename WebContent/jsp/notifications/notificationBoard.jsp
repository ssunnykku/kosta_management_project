<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<link rel="stylesheet" href="css/notifications.css" />
<link rel="stylesheet" href="css/button.css" />
<link rel="stylesheet" href="css/format.css" />
<link rel="stylesheet" href="css/modal.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body id="notification-body" >
	<jsp:include page="../common/header.jsp" />
	<section id="title-wrapper">
		<h2 id="title">공지사항</h2>
	</section>
	<section id="notification-section">
		<article class="notification-contents">
			<div id="notification-btn-wrapper">
				<button id="notification-enroll-btn" class="btn-setting">등록</button>
				<button id="notification-delete-btn" class="btn-setting">삭제</button>
			</div>
			<div id="notification-table">
				<div id="notification-table-row" class="table-first-row">
					<div class="notificationBoard-checkbox">
						<input type="checkbox" name="" />
					</div>
					<div class="notificationBoard-no">
						<span>NO</span>
					</div>
					<div class="notificationBoard-title">
						<span>제목</span>
					</div>
					<div class="notificationBoard-enroll-date">
						<span>등록일</span>
					</div>
					<div class="notificationBoard-writer">
						<span>작성자</span>
					</div>
				</div>
			</div>
		</article>
		<article class="page-information">
			<div class="pagenation">
				<div class="page-number">
					<img src="assets/double_arrow_left.svg" alt="double_arrow_left" />
				</div>
				<div class="page-number">
					<img src="assets/arrow_left.svg" alt="array_left" />
				</div>
				<div class="page-number">
					<a href="#">1</a>
				</div>
				<div class="page-number">
					<a href="">2</a>
				</div>
				<div class="page-number">
					<a href="">3</a>
				</div>
				<div class="page-number">
					<a href="">4</a>
				</div>
				<div class="page-number">
					<a href="">5</a>
				</div>
				<div class="page-number">
					<img src="assets/arrow_right.svg" alt="arrow_right" />
				</div>
				<div class="page-number">
					<img src="assets/double_arrow_right.svg" alt="double_arrow_right" />
				</div>
			</div>
		</article>
		<article class="page-information">
			<div class="cnt-pages">
				<span>총 72건 (1 to 5)</span>
			</div>
		</article>
	</section>
	<footer></footer>
</body>
	<jsp:include page="../common/modals/removeModal.jsp" />
	<div class="modal-background" style="display: none"></div>
		<script src="scripts/notifications/notificationBoard.js">
	</script>
</html>
