<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/css/notifications.css"
    />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/css/button.css"
    />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/css/format.css"
    />
   
  </head>
  <body id="notification-body">
    <div id="header">
      <div id="nav-wrapper">
        <div id="top-logo">
          <img src="${pageContext.request.contextPath}/assets/kosta-logo.png" alt="" />
        </div>
        <ul id="nav-ul">
          <li id="nav-notification" class="nav-li">
            <a href="controller?cmd=notificationBoardUI">공지사항</a>
          </li>
          <li id="nav-course" class="nav-li">
            <a href="controller?cmd=courseBoardUI">과정 관리</a>
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
            <form action="controller?cmd=logoutAction" method="post">
              <button id="logout-btn" type="submit">로그아웃</button>
            </form>
          </div>
          <div class="btn-wrapper" id="setting-btn-wrapper">
            <button id="setting-btn" type="button"></button>
          </div>
        </div>
      </div>
    </div>

    <section id="title-wrapper">
      <h2 id="title">공지사항</h2>
    </section>
    <section id="notification-section">
      <article class="notification-contents">
        <div id="notification-btn-wrapper">
          <form action=""></form>
          <button id="notification-enroll-btn" class="btn-setting">등록</button>
          <button id="notification-delete-btn" class="btn-setting">삭제</button>
        </div>

        <div id="notification-table">
          <div id="notification-table-row" class="table-first-row">
            <div class="notificationBoard-checkbox">
              <input type="checkbox" name="" class="notificationBoard-check" />
            </div>
            <div class="notificationBoard-no">
              <span>NO</span>
            </div>
            <div class="notificationBoard-title">
              <span>제목</span>
            </div>
            <div class="notificationBoard-enroll-date">
              <span>등록일</span>
            </div>
            <div class="notificationBoard-writer">
              <span>작성자</span>
            </div>
          </div>

          <c:forEach var="notificationVO" items="${notificationVOs}">
            <div id="notification-table-row">
              <div class="notificationBoard-checkbox">
                <input
                  type="checkbox"
                  name=""
                  class="notificationBoard-check"
                  value="80"
                />
              </div>
              <div class="notificationBoard-no">
                <span>${notificationVO.notificationId}</span>
              </div>
              <div
                class="notificationBoard-title"
                data-id="${notificationVO.notificationId}"
              >
                <!-- 데이터 속성 : data-(원하는 이름) -> 각 class에 data-id라는 이름으로 값이 저장됨 -->
                <span id="notificationBoard-title">${notificationVO.title}</span>
              </div>
              <div class="notificationBoard-enroll-date">
                <span>${notificationVO.notificationDate}</span>
              </div>
              <div class="notificationBoard-writer">
                <span>${notificationVO.name}</span>
              </div>
            </div>
          </c:forEach>
        </div>
      </article>
      <article class="page-information">
        <div class="pagenation">
          <div class="page-number">
            <img
              src="${pageContext.request.contextPath}/assets/double_arrow_left.svg"
              alt="double_arrow_left"
            />
          </div>
          <div class="page-number">
            <img src="${pageContext.request.contextPath}/assets/arrow_left.svg" alt="array_left" />
          </div>
          <div class="page-number">
            <a href="#">1</a>
          </div>
          <div class="page-number">
            <a href="">2</a>
          </div>
          <div class="page-number">
            <a href="">3</a>
          </div>
          <div class="page-number">
            <a href="">4</a>
          </div>
          <div class="page-number">
            <a href="">5</a>
          </div>
          <div class="page-number">
            <img src="${pageContext.request.contextPath}/assets/arrow_right.svg" alt="arrow_right" />
          </div>
          <div class="page-number">
            <img src="${pageContext.request.contextPath}/assets/double_arrow_right.svg" alt="double_arrow_right"/>
          </div>
        </div>
      </article>
      <article class="page-information">
        <div class="cnt-pages">
          <span>총 72건 (1 to 5)</span>
        </div>
      </article>
    </section>

    <footer></footer>
     <script src="${pageContext.request.contextPath}/scripts/notifications/notificationBoard.js"></script>
  </body>
</html>
