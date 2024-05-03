<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>출결 등록</title>
    <link rel="stylesheet" href="css/students.css" />
  </head>
  <body>
    <div id="addAttendance-wrapper">
      <div id="addAttendance-main">
        <div id="student-info">
          <h1 class="info-title underline">수강생 정보</h1>
          <div class="student-info-detail">
            <div>
              <h4>과정명</h4>
              <h4>Java 기반 클라우드 개발자 양성 과정</h4>
            </div>
            <div>
              <h4>기수</h4>
              <h4>277기</h4>
            </div>
            <div>
              <h4>기간</h4>
              <h4>2024.02.27 ~ 2024.07.31</h4>
            </div>
            <div>
              <h4>이름</h4>
              <h4>김선희</h4>
            </div>
          </div>
        </div>
        <div id="attendance-info">
          <h1 class="info-title underline">출결 등록</h1>
          <h2 class="attendance-date">2024.04.29</h2>
          <div class="attendance-info-detail">
            <div class="attendance-underline">
              <h4>출석</h4>
              <input
                type="radio"
                id="attendance-checkbox"
                name="attendance-checkbox"
                value="0"
              />
            </div>
            <div class="attendance-underline">
              <h4>지각</h4>
              <input
                type="radio"
                id="attendance-checkbox"
                name="attendance-checkbox"
                value="1"
              />
            </div>
            <div class="attendance-underline">
              <h4>조퇴</h4>
              <input
                type="radio"
                id="attendance-checkbox"
                name="attendance-checkbox"
                value="2"
              />
            </div>
            <div class="attendance-underline">
              <h4>외출</h4>
              <input
                type="radio"
                id="attendance-checkbox"
                name="attendance-checkbox"
                value="3"
              />
            </div>
            <div class="attendance-underline">
              <h4>결석</h4>
              <input
                type="radio"
                id="attendance-checkbox"
                name="attendance-checkbox"
                value="4"
              />
            </div>
          </div>
        </div>
      </div>
      <div id="attendance-btn-wrapper">
        <button id="enroll-btn" class="attendance-btn-setting">등록</button>
        <button id="edit-btn" class="attendance-btn-setting">취소</button>
      </div>
    </div>
  </body>
</html>
