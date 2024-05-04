<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="css/format.css" />
    <link rel="stylesheet" href="css/scholarships.css" />
  </head>
  <body id="content-wrapper">
    	<jsp:include page="../common/header.jsp" />
    <section id="title-wrapper">
      <h2 id="title">장학금 정산</h2>
    </section>
    <section id="scholarship-contents">
      <article class="scholarship-search-form-wrapper">
          <!-- form???? -->
          <select
            name="scholarship-courseId-filter"
            class="scholarship-courseId-filter"
          >
            <option value="none">기수</option>
            <option value="227">227</option>
            <option value="191">191</option>
          </select>
          <input placeholder="수강생을 입력하세요" class="search-input" />
          <button type="button" class="board-filter-search-btn">검색</button>
      </article>
      <article>
        <div id="scholarshipBoard-table">
          <div class="scholarshipBoard-row" id="scholarshipBoard-title-row">
            <div class="scholarshipBoard-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="scholarshipBoard-corseId">
              <span>기수</span>
            </div>
            <div class="scholarshipBoard-course-name">
              <span>과정명</span>
            </div>
            <div class="scholarshipBoard-birth">
              <span>생년월일</span>
            </div>
            <div class="scholarshipBoard-name">
              <span>이름</span>
            </div>
            <div class="scholarshipBoard-bank">
              <span>은행</span>
            </div>
            <div class="scholarshipBoard-phonenumber">
              <span>계좌번호</span>
            </div>
            <div class="scholarshipBoard-point">
              <span>포인트</span>
            </div>
            <div class="scholarshipBoard-total-amount">
              <span>금액(원)</span>
            </div>
          </div>
        </div>
        <div id="scholarshipBoard-table">
          <div class="scholarshipBoard-row">
            <div class="scholarshipBoard-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="scholarshipBoard-corseId">
              <span>기수</span>
            </div>
            <div class="scholarshipBoard-course-name">
              <span>과정명</span>
            </div>
            <div class="scholarshipBoard-birth">
              <span>생년월일</span>
            </div>
            <div class="scholarshipBoard-name">
              <span>이름</span>
            </div>
            <div class="scholarshipBoard-bank">
              <span>은행</span>
            </div>
            <div class="scholarshipBoard-phonenumber">
              <span>계좌번호</span>
            </div>
            <div class="scholarshipBoard-point">
              <span>포인트</span>
            </div>
            <div class="scholarshipBoard-total-amount">
              <span>금액(원)</span>
            </div>
          </div>
        </div>
        <div id="scholarshipBoard-table">
          <div class="scholarshipBoard-row">
            <div class="scholarshipBoard-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="scholarshipBoard-corseId">
              <span>기수</span>
            </div>
            <div class="scholarshipBoard-course-name">
              <span>과정명</span>
            </div>
            <div class="scholarshipBoard-birth">
              <span>생년월일</span>
            </div>
            <div class="scholarshipBoard-name">
              <span>이름</span>
            </div>
            <div class="scholarshipBoard-bank">
              <span>은행</span>
            </div>
            <div class="scholarshipBoard-phonenumber">
              <span>계좌번호</span>
            </div>
            <div class="scholarshipBoard-point">
              <span>포인트</span>
            </div>
            <div class="scholarshipBoard-total-amount">
              <span>금액(원)</span>
            </div>
          </div>
        </div>
      </article>
      <article class="page-information">
        <div class="student-cnt-pages">
          <span>총 2건</span>
        </div>
      </article>
    </section>
    <footer></footer>
  </body>
</html>
