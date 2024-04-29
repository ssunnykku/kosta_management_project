<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="css/format.css" />
    <link rel="stylesheet" href="css/benefits.css" />
  </head>
  <body id="content-wrapper">
    <div id="header">
      <div id="nav-wrapper">
        <div id="top-logo">
          <img src="../../assets/kosta-logo.png" alt="" />
        </div>
        <ul id="nav-ul">
          <li id="nav-notification" class="nav-li">
            <a href="#notifications">공지사항</a>
          </li>
          <li id="nav-course" class="nav-li">
            <a href="#courses">과정 관리</a>
          </li>
          <li id="nav-certification" class="nav-li">
            <a href="#certifications">수료증 관리</a>
          </li>
          <li id="nav-scholarship" class="nav-li">
            <a href="#scholarships">장학금 관리</a>
          </li>
          <li id="nav-benefit" class="nav-li">
            <a href="#benefits">지원금 관리</a>
          </li>
          <li id="nav-student" class="nav-li">
            <a href="#students">수강생 관리</a>
          </li>
        </ul>
        <div id="header-btns">
          <div class="btn-wrapper">
            <button id="logout-btn" type="button">로그아웃</button>
          </div>
          <div class="btn-wrapper" id="setting-btn-wrapper">
            <button id="setting-btn" type="button"></button>
          </div>
        </div>
      </div>
    </div>
    <section id="title-wrapper">
      <h2 id="title">지원금 정산</h2>
    </section>
    <section>
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
          <button
            type="button"
            id="get-settlement-list-btn"
            class="btn-setting"
          >
            정산대상목록
          </button>
          <button type="button" id="settlement-btn" class="btn-setting">
            정산
          </button>
        </div>
      </article>
      <article>
        <div class="board-table">
          <div class="board-row" id="board-title-row">
            <div class="benefitSettlement-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="benefitSettlement-courseId">
              <span>기수</span>
            </div>
            <div class="benefitSettlement-birth">
              <span>생년월일</span>
            </div>
            <div class="benefitSettlement-name">
              <span>이름</span>
            </div>
            <div class="benefitSettlement-bank">
              <span>은행</span>
            </div>
            <div class="benefitSettlement-account">
              <span>계좌번호</span>
            </div>
            <div class="benefitSettlement-settlement-duration">
              <span>정산기간</span>
            </div>
            <div class="benefitSettlement-training-aid">
              <span>훈련수당(원)</span>
            </div>
            <div class="benefitSettlement-meal-aid-amount">
              <span>식비(원)</span>
            </div>
            <div class="benefitSettlement-settlement_aid_amount">
              <span>정착지원금(원)</span>
            </div>
            <div class="benefitSettlement-total-amount">
              <span>합계(원)</span>
            </div>
          </div>
          <div class="board-row">
            <div class="benefitSettlement-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="benefitSettlement-courseId">
              <span>기수</span>
            </div>
            <div class="benefitSettlement-birth">
              <span>생년월일</span>
            </div>
            <div class="benefitSettlement-name">
              <span>이름</span>
            </div>
            <div class="benefitSettlement-bank">
              <span>은행</span>
            </div>
            <div class="benefitSettlement-account">
              <span>계좌번호</span>
            </div>
            <div class="benefitSettlement-settlement-duration">
              <span>정산기간</span>
            </div>
            <div class="benefitSettlement-training-aid">
              <span>훈련수당(원)</span>
            </div>
            <div class="benefitSettlement-meal-aid-amount">
              <span>식비(원)</span>
            </div>
            <div class="benefitSettlement-settlement_aid_amount">
              <span>정착지원금(원)</span>
            </div>
            <div class="benefitSettlement-total-amount">
              <span>합계(원)</span>
            </div>
          </div>
          <div class="board-row">
            <div class="benefitSettlement-checkbox">
              <input type="checkbox" name="" />
            </div>
            <div class="benefitSettlement-courseId">
              <span>277</span>
            </div>
            <div class="benefitSettlement-birth">
              <span>930628</span>
            </div>
            <div class="benefitSettlement-name">
              <span>김선희</span>
            </div>
            <div class="benefitSettlement-bank">
              <span>신한</span>
            </div>
            <div class="benefitSettlement-account">
              <span>939594968392</span>
            </div>
            <div class="benefitSettlement-settlement-duration">
              <span>2024.03.01 ~ 2024.03.31</span>
            </div>
            <div class="benefitSettlement-training-aid">
              <span>200,000</span>
            </div>
            <div class="benefitSettlement-meal-aid-amount">
              <span>95,000</span>
            </div>
            <div class="benefitSettlement-settlement_aid_amount">
              <span>200,000</span>
            </div>
            <div class="benefitSettlement-total-amount">
              <span>495,000</span>
            </div>
          </div>
        </div>
      </article>
    </section>
    <section>
      <article class="page-information">
        <div class="benefit-cnt-pages">
          <span>총 2건</span>
        </div>
      </article>
    </section>
    <footer></footer>
    <script src="scripts/benefits/benefitBoard.js"></script>
  </body>
</html>
