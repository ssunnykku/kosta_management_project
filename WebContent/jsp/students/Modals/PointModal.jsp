<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>포인트</title>
    <link rel="stylesheet" href="css/scholarships.css" />
  </head>
  <body>
    <div id="point-wrapper">
      <div id="main-wrapper">
        <div class="student-info">
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
        <div class="total-point-info">
          <h1 class="info-title underline">포인트 적립 내역</h1>
          <div class="total-point-info-detail">
            <div class="underline">
              <h4>적립일</h4>
              <h4>항목</h4>
              <h4>포인트(점)</h4>
            </div>
            <div>
              <h5>24.02.10</h5>
              <h5>시험치기 응시</h5>
              <h5>10</h5>
            </div>
            <div>
              <h5>24.04.01</h5>
              <h5>국가 자격증 취득</h5>
              <h5>10</h5>
            </div>
          </div>
          <div class="total-point line">
            <h3>총 적립 포인트</h3>
            <h3>20</h3>
          </div>
        </div>
      </div>
      <button id="point-enroll-btn" class="point-btn-setting">확인</button>
    </div>
  </body>
</html>
