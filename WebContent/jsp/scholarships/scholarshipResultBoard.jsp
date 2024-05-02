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
      <h2 id="title">정산 결과 조회</h2>
    </section>
    <section id="scholoarshipResult-contents">
      <article>
        <div class="scholarshipResult-search-form-wrapper">
          <!-- form???? -->
          <input type="date" />
          <select
            name="scholarshipResult-courseId-filter"
            class="scholarshipResult-courseId-filter"
          >
            <option value="none">기수</option>
            <option value="227">227</option>
            <option value="191">191</option>
          </select>
          <input placeholder="수강생을 입력하세요" class="search-input" />
          <button type="button" class="filter-search-btn">검색</button>
        </div>
      </article>
      <article>
        <div class="scholarshipResultBoard-table">
          <div
            class="scholarshipResultBoard-row"
            id="scholarshipResultBoard-title-row"
          >
            <div class="scholarshipResultBoard-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="scholarshipResultBoard-courseId">
              <span>기수</span>
            </div>
            <div class="scholarshipResultBoard-birth">
              <span>생년월일</span>
            </div>
            <div class="scholarshipResultBoard-name">
              <span>이름</span>
            </div>
            <div class="scholarshipResultBoard-bank"><span>은행</span></div>
            <div class="scholarshipResultBoard-account">
              <span>계좌번호</span>
            </div>
            <div class="scholarshipResultBoard-total-amount">
              <span>금액(원)</span>
            </div>
            <div class="scholarshipResultBoard-settlement-date">
              <span>정산일</span>
            </div>
          </div>
          <div class="scholarshipResultBoard-row">
            <div class="scholarshipResultBoard-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="scholarshipResultBoard-courseId">
              <span>277</span>
            </div>
            <div class="scholarshipResultBoard-birth">
              <span>930628</span>
            </div>
            <div class="scholarshipResultBoard-name">
              <span>김선희</span>
            </div>
            <div class="scholarshipResultBoard-bank"><span>은행</span></div>
            <div class="scholarshipResultBoard-account">
              <span>123987673829</span>
            </div>
            <div class="scholarshipResultBoard-total-amount">
              <span>1,000,000</span>
            </div>
            <div class="scholarshipResultBoard-settlement-date">
              <span>2024.04.17</span>
            </div>
          </div>
          <div class="scholarshipResultBoard-row">
            <div class="scholarshipResultBoard-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="scholarshipResultBoard-courseId"><span>기수</span></div>
            <div class="scholarshipResultBoard-birth">
              <span>생년월일</span>
            </div>
            <div class="scholarshipResultBoard-name">
              <span>이름</span>
            </div>
            <div class="scholarshipResultBoard-bank"><span>은행</span></div>
            <div class="scholarshipResultBoard-account">
              <span>계좌번호</span>
            </div>
            <div class="scholarshipResultBoard-total-amount">
              <span>금액(원)</span>
            </div>
            <div class="scholarshipResultBoard-settlement-date">
              <span>정산일</span>
            </div>
          </div>
        </div>
      </article>
    </section>
    <section id="content-section">
      <article class="page-information">
        <div class="cnt-pages">
          <span>총 2건</span>
        </div>
      </article>
    </section>
    <footer></footer>
  </body>
</html>
