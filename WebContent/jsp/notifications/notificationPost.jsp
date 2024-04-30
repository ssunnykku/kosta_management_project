<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/format.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/notifications.css" />
</head>

 <body id="content-wrapper">
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
            <a href="#benefits">훈련수당 관리</a>
          </li>
          <li id="nav-student" class="nav-li">
            <a href="#students">수강생 관리</a>
          </li>
        </ul>
        <div id="header-btns">
          <div class="btn-wrapper">
            <form action="controller?cmd=logoutAction" method="post">
              <button id="logout-btn" type="submit">로그아웃</button>
            </form>          </div>
          <div class="btn-wrapper" id="setting-btn-wrapper">
            <button id="setting-btn" type="button"></button>
          </div>
        </div>
      </div>
    </div>
    <section id="title-wrapper">
      <h2 id="title">공지사항</h2>
    </section>
    <section id="notificationPost-section">
      <article class="notificationPost-contents">
      
        <div id="notification-row" class="underline">
          <div class="notificationPost-no">
            <span>${notificationVO.notificationId}</span>
          </div>
          <div class="notificationPost-title">
             <span>${notificationVO.title}</span>
          </div>
          <div class="notificationPost-enroll-date">
             <span>${notificationVO.notificationDate}</span>
          </div>
        </div>
        <div id="notification-contents">
          <div class="writer">
            <span>작성자</span>
            <span>${notificationVO.name}</span>
          </div>
          <div class="notificationPost-content">
           <!--  <span>
              1. 통장사본 제출 요청 <br />
              매월 훈련수당 입금을 위한 #통장사본 제출을 요청드리오니,<br />
              sjlee@kosta.or.kr로 기수_이름 기재해서 3/27(수)까지 보내주시면
              되겠습니다.(ex. 277기_홍길동 통장사본 제출)<br /><br />
              2. 당부말씀 <br />
              출결은 저희 사무국에서 관리해드리는게 아닌 여러분께서 직접
              관리하는 부분입니다. 입퇴실 체크 신경써서 해주시기 바랍니다.<br />
              그리고, 안내드렸듯이 결석, 지각, 조퇴 등을 해야 할 경우 사전에
              말씀해주시면 감사하겠습니다. <br />
              사전에 말씀하지 않으셔서 발생하는 출결문제는 도와드릴 수 없는 부분
              참고해주세요.
            </span> -->
            <span>${notificationVO.description}</span>
          </div>
        </div>
        <div id="notificationPost-btn-wrapper">
          <button id="enroll-btn" class="btn-setting edit-btn"
          data-id="${notificationVO.notificationId}">수정</button>
          <button id="edit-btn" class="btn-setting delete-btn" 
          data-id="${notificationVO.notificationId}">삭제</button>
        </div>
      
      </article>
    </section>
    <footer></footer>
    <script src="${pageContext.request.contextPath}/scripts/notifications/setNotification.js"></script>
  </body>
</html>