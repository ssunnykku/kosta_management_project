<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="css/format.css" />
    <link rel="stylesheet" href="css/certifications.css" />
  </head>
  <body id="content-wrapper">
    	<jsp:include page="../common/header.jsp" />
    <section id="title-wrapper">
      <h2 id="title">수료 대상 관리</h2>
    </section>
    <section class="certification-contents">
      <article class="search-btn-wrapper">
        <div class="search-form-wrapper">
          <!-- form???? -->
          <select name="courseId-filter" class="courseId-filter">
            <option value="none">기수</option>
            <option value="227">227</option>
            <option value="191">191</option>
          </select>
          <input placeholder="수강생을 입력하세요" class="search-input" />
          <button type="button" class="filter-search-btn">검색</button>
        </div>
        <div class="btn-wrapper">
          <button type="button" id="get-list-btn" class="btn-setting">
            대상 리스트 출력
          </button>
          <button type="button" id="certifiation-btn" class="btn-setting">
            수료증 출력
          </button>
        </div>
      </article>
      <article>
        <div id="board-table">
          <div class="board-row" id="board-title-row">
            <div class="certification-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="certification-hrdNetId">
              <span>HRD-Net ID</span>
            </div>
            <div class="certification-courseId">
              <span>기수</span>
            </div>
            <div class="certification-name">
              <span>이름</span>
            </div>
            <div class="certification-birth">
              <span>생년월일</span>
            </div>
            <div class="certification-duration">
              <span>과정기간(일)</span>
            </div>
            <div class="certification-rate">
              <span>수료율(%)</span>
            </div>
            <div class="certification-status">
              <span>수료 여부</span>
            </div>
          </div>
          <div class="board-row">
            <div class="certification-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="certification-hrdNetId">
              <span>nfijebf88</span>
            </div>
            <div class="certification-courseId">
              <span>95</span>
            </div>
            <div class="certification-name">
              <span>김붕붕</span>
            </div>
            <div class="certification-birth">
              <span>970601</span>
            </div>
            <div class="certification-duration">
              <span>100</span>
            </div>
            <div class="certification-rate">
              <span>100%</span>
            </div>
            <div class="certification-status">
              <span>수료완료</span>
            </div>
          </div>
        </div>
      </article>
    </section>
    <section id="content-section">
      <article class="page-information">
        <div class="cnt-pages">
          <span>총 11건</span>
        </div>
      </article>
    </section>
    <footer></footer>
  </body>
</html>
