<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>course</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/format.css"
/>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/courses.css"
/>
</head>
<body id="content-wrapper">
	<div id="header">
		<%@ include file="../header.jsp"%>
	</div>
	<section id="title-wrapper">
	<h2 id="title">과정 관리</h2>
	</section>
	<section id="content-section"> <article
		id="courseBoard-btns-container"
	>
	<div id="courseBoard-btn-wrapper">
		<button id="enroll-btn" class="btn-setting">등록</button>
		<button id="delete-btn" class="btn-setting">삭제</button>
	</div>
	<div class="search-form-wrapper">
		<!-- form???? -->
		<select name="courseId-filter" class="data-filter course-id">
			<option value="none">기수</option>
			<option value="227">227</option>
			<option value="191">191</option>
		</select> <select name="location-filter" class="data-filter location">
			<option value="none">강의장</option>
			<option value="227">가산</option>
			<option value="191">성남</option>
		</select>
		<button type="button" class="filter-search-btn">검색</button>
	</div>
	</article> <article>
	<div id="courseBoard-table">
		<div class="courseBoard-row" id="courseBoard-title-row">
			<div id="courseBoard-no">
				<input type="checkbox" name="" />
			</div>
			<div id="courseBoard-classification">
				<span>과정구분</span>
			</div>
			<div id="courseBoard-course-id">
				<span>기수</span>
			</div>
			<div id="courseBoard-subject">
				<span>주제명</span>
			</div>
			<div id="courseBoard-course-name">
				<span>과정명</span>
			</div>
			<div id="courseBoard-duration">
				<span>기간</span>
			</div>
			<div id="courseBoard-count-mounth">
				<span>총 개월 수</span>
			</div>
			<div id="courseBoard-total-hours">
				<span>총 교육시간<span>
			</div>
			<div id="courseBoard-total-days">
				<span>교육시간(일)</span>
			</div>
			<div id="courseBoard-location">
				<span>강의장</span>
			</div>
			<div id="courseBoard-edit">
				<span> 수정하기 </span>
			</div>
		</div>
		<c:forEach items="${courseVOs}" var="courseVOs">
			<div class="courseBoard-row">
				<div id="courseBoard-no">
					<input type="checkbox" class="checkbox" name="checkbox "
						id="${courseVOs.courseId}"
					/>
				</div>
				<div id="courseBoard-classification">
					<span>${courseVOs.courseType}</span>
				</div>
				<div id="courseBoard-course-id">
					<span>${courseVOs.courseId}</span>
				</div>
				<div id="courseBoard-subject">
					<span>${courseVOs.subject}</span>
				</div>
				<div id="courseBoard-course-name">
					<span>${courseVOs.courseName}</span>
				</div>
				<div id="courseBoard-duration">
					<span>${courseVOs.courseStartDate} ~
						${courseVOs.courseEndDate}</span>
				</div>
				<div id="courseBoard-count-mounth">
					<span>${courseVOs.numberOfMonths}</span>
				</div>
				<div id="courseBoard-total-hours">
					<span>${courseVOs.totalTrainingHours}<span>
				</div>
				<div id="courseBoard-total-days">
					<span>${courseVOs.trainingHoursOfDay}</span>
				</div>
				<div id="courseBoard-location">
					<span>${courseVOs.academyLocation}</span>
				</div>
				<div id="courseBoard-edit">
					<button id="edit-btn" class="btn-setting"
						data-id="${courseVOs.courseId}"
					>수정</button>
				</div>
			</div>
		</c:forEach>
	</div>
	</article> <article class="page-information">
	<div class="cnt-pages">
		<span>총 14건</span>
	</div>
	</article> </section>
	<footer></footer>
	<script
		src="${pageContext.request.contextPath}/scripts/courses/courseBoard.js"
	></script>
</body>
</html>