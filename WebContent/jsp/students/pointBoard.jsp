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
      <h2 id="title">포인트 관리</h2>
    </section>
    <section id="point-section">
      <article class="search-form-wrapper">
        <form action="#" class="seacrch-form">
          <div id="filter-button-wrapper">
            <select name="courseId-filter" class="courseId-filter">
              <option value="none">기수</option>
              <option value="227">277기</option>
              <option value="191">191기</option>
            </select>
            <input
              placeholder="수강생 이름을 입력하세요"
              class="search-input"
            />
            <button type="button" class="filter-search-btn">검색</button>
          </div>
        </form>
        <div id="button-wrapper">
          <button id="point-search-btn" class="btn-setting">조회</button>
          <button id="enroll-btn" class="btn-setting">포인트 등록</button>
        </div>
      </article>
      <article id="point-table-wrapper">
        <div id="point-table">
          <form>
            <div class="point-table-row" id="point-title-row">
              <div id="point-radio-btn">
                <input type="radio" value="hrdNetId" />
              </div>
              <div id="point-table-courseId">
                <span>기수</span>
              </div>
              <div id="point-table-birth">
                <span>생년월일</span>
              </div>
              <div id="point-table-name">
                <span>이름</span>
              </div>
              <div id="point-table-total-point">
                <span>총 적립 포인트</span>
              </div>
            </div>
          </form>
          <form>
            <div class="point-table-row">
              <div id="point-radio-btn">
                <input type="radio" value="hrdNetId" />
              </div>
              <div id="point-table-courseId">
                <span>277</span>
              </div>
              <div id="point-table-birth">
                <span>980630</span>
              </div>
              <div id="point-table-name">
                <span>차미강</span>
              </div>
              <div id="point-table-total-point">
                <span>50</span>
              </div>
            </div>
          </form>
        </div>
      </article>
      <article class="page-information">
        <div class="point-cnt-pages">
          <span>총 13건</span>
        </div>
      </article>
    </section>
    <footer></footer>
  </body>
</html>
