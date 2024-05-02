<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>과정 등록</title>
    <link rel="stylesheet" href="css/courses.css" />
  </head>
  <body>
    <div id="course-wrapper">
      <div>
        <h1>과정 등록</h1>
        <form method="post" class="course-form-row">
          <h4>과정 구분</h4>
          <select name="course_type" id="course_type">
            <option>과정 구분을 선택하세요.</option>
            <option value="job_seeker">채용 예정자 무료</option>
            <option value="SMEs">중소기업 재직자 무료</option>
          </select>
        </form>
        <form method="post" class="course-form-row">
          <h4>기수</h4>
          <input type="text" id="course_number" />
        </form>
        <form method="post" class="course-form-row">
          <h4>주제명</h4>
          <input type="text" id="subject" />
        </form>
        <form method="post" class="course-form-row">
          <h4>과정명</h4>
          <input type="text" id="course_name" />
        </form>
        <form method="post" class="course-form-row">
          <h4>시작일</h4>
          <input type="date" id="course_start_date" />
        </form>
        <form method="post" class="course-form-row">
          <h4>종료일</h4>
          <input type="date" id="course_end_date" />
        </form>
        <form method="post" class="course-form-row">
          <h4>총 교육 시간</h4>
          <input type="text" id="total_training_hours" />
        </form>
        <form method="post" class="course-form-row">
          <h4>총 개월 수</h4>
          <input type="text" id="number_of_months" />
        </form>
        <form method="post" class="course-form-row">
          <h4>교육 시간(일)</h4>
          <input type="text" id="training_hours_of_day" />
        </form>
        <form method="post" class="course-form-row">
          <h4>강의장</h4>
          <select name="academy_location" id="academy_location">
            <option>강의장을 선택하세요.</option>
            <option value="gasan">가산</option>
            <option value="seongnam">성남</option>
          </select>
        </form>
        <div id="btn-wrapper">
          <button id="enroll-btn" class="btn-setting">등록</button>
          <button id="edit-btn" class="btn-setting">취소</button>
        </div>
      </div>
    </div>
  </body>
</html>
