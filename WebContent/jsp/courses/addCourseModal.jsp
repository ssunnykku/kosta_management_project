<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>과정 등록</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/courses.css"
/>
</head>
<body>
	<div id="course-wrapper">
		<div>
			<form action="controller?cmd=addCourseAction" method="post">
				<h1>과정 등록</h1>
				<div class="course-form-row">
					<h4>과정 구분</h4>
					<select name="course_type" id="course_type">
						<option>과정 구분을 선택하세요.</option>
						<option value="채용 예정자 무료">채용 예정자 무료</option>
						<option value="중소기업 재직자 무료">중소기업 재직자 무료</option>
					</select>
				</div>
				<div class="course-form-row">
					<h4>기수</h4>
					<input id="course_id" name="course_id"/>
				</div>
				<div class="course-form-row">
					<h4>주제명</h4>
					<input id="subject" name="subject"/>
				</div>
				<div class="course-form-row">
					<h4>과정명</h4>
					<input id="course_name" name="course_name"/>
				</div>
				<div class="course-form-row">
					<h4>시작일</h4>
					<input type="date" id="course_start_date" name="course_start_date"/>
				</div>
				<div class="course-form-row">
					<h4>종료일</h4>
					<input type="date" id="course_end_date" name="course_end_date"/>
				</div>
				<div class="course-form-row">
					<h4>총 교육 시간</h4>
					<input id="total_training_hours" name="total_training_hours"/>
				</div>
				<div class="course-form-row">
					<h4>총 개월 수</h4>
					<input id="number_of_months" name="number_of_months"/>
				</div>
				<div class="course-form-row">
					<h4>교육 시간(일)</h4>
					<input id="training_hours_of_day" name="training_hours_of_day"/>
				</div>
				<div class="course-form-row">
					<h4>강의장</h4>
					<select name="academy_location" id="academy_location">
						<option>강의장을 선택하세요.</option>
						<option value="가산">가산</option>
						<option value="성남">성남</option>
					</select>
				</div>
				<div id="btn-wrapper">
					<button type="submit" id="enroll-btn" class="btn-setting">등록</button>
					<button id="edit-btn" class="btn-setting">취소</button>
				</div>
			</form>
		</div>
	</div>
	<%-- <script src="${pageContext.request.contextPath}/scripts/courses/addcourse.js"></script> --%>
</body>
</html>