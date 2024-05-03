<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/format.css"
/>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/students.css"
/>
</head>

<body id="content-wrapper">
	<div id="header">
		<%@ include file="../header.jsp"%>
	</div>
	<section id="title-wrapper">
	<h2 id="title">수강생 정보</h2>
	</section>
	<section id="student-section"> <article
		class="student-filter-btn-wrapper"
	>
	<div class="search-form-wrapper">
		<!-- form???? -->
		<select name="courseId-filter" class="courseId-filter">
			<option value="none">기수</option>
			<option value="227">227</option>
			<option value="191">191</option>
		</select> <input placeholder="수강생을 입력하세요" class="search-input" />
		<button type="button" class="filter-search-btn">검색</button>
	</div>
	<div class="student-btn-wrapper">
		<button type="button" id="enroll-btn" class="student-btn-setting">
			등록</button>
		<button type="button" id="edit-btn" class="student-btn-setting">
			수정</button>
	</div>
	</article> <article>
	<div class="board-table">
		<div class="board-row" id="board-title-row">
			<div class="student-checkbox">
				<input type="checkbox" name="" />
			</div>
			<div class="student-hrdNetId">
				<span>HRD-Net ID</span>
			</div>
			<div class="student-courseId">
				<span>기수</span>
			</div>
			<div class="student-name">
				<span>이름</span>
			</div>
			<div class="student-birth">
				<span>생년월일</span>
			</div>
			<div class="student-location">
				<span>지역</span>
			</div>
			<div class="student-bank">
				<span>은행</span>
			</div>
			<div class="student-account">
				<span>계좌번호</span>
			</div>
			<div class="student-phonenumber">
				<span>전화번호</span>
			</div>
			<div class="student-email">
				<span>이메일</span>
			</div>
			<div class="student-completion-status">
				<span>수료 여부</span>
			</div>
		</div>

		<c:forEach items="${studentVOs}" var="studentVO">
			<div class="board-row">
				<div class="student-checkbox">
					<input type="checkbox" name="" />
				</div>
				<div class="student-hrdNetId">
					<span>${studentVO.hrdNetId}</span>
				</div>
				<div class="student-courseId">
					<span>${studentVO.courseId}</span>
				</div>
				<div class="student-name">
					<span>${studentVO.name}</span>
				</div>
				<div class="student-birth">
					<span> <fmt:parseDate var="birth" value="${studentVO.birth}"
							pattern="yyyy-MM-dd"
						/> <fmt:formatDate value="${birth}" pattern="yyMMdd" />
					</span>
				</div>
				<div class="student-location">
					<span>${studentVO.province}</span>
				</div>
				<div class="student-bank">
					<span>${studentVO.bank}</span>
				</div>
				<div class="student-account">
					<span>${studentVO.account}</span>
				</div>
				<div class="student-phonenumber">
					<span>${studentVO.phoneNumber}</span>
				</div>
				<div class="student-email">
					<span>${studentVO.email}</span>
				</div>
				<div class="student-completion-status">
					<span>${studentVO.completionStatus}</span>
				</div>
			</div>
		</c:forEach>

	</div>
	</article> <article>
	<div class="student-cnt-pages">
		<span>총 13건</span>
	</div>
	</article> </section>
	<footer></footer>
	<script
		src="${pageContext.request.contextPath}/scripts/students/studentBoard.js"
	></script>
</body>
</html>