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
    <link rel="stylesheet" href="css/notifications.css" />
  </head>
  <body id="content-wrapper">
  	<jsp:include page="../common/header.jsp" />
    <section id="title-wrapper">
      <h2 id="title">공지사항</h2>
    </section>
    <section id="notificationPost-section">
      <article class="notificationPost-contents">
        <div id="notification-row" class="underline">
          <div class="notificationPost-no">
            <span>NO.</span><span>${data.notificationId}</span>
          </div>
          <div class="notificationPost-title">
            <span>${data.title}</span>
          </div>
          <div class="notificationPost-enroll-date">
            <span>${data.notificationDate}</span>
          </div>
        </div>
        <div id="notification-contents">
          <div class="writer">
            <span>작성자</span>
            <span>: ${data.name}</span>
          </div>
          <div class="notificationPost-content">
            <pre> ${data.description}</pre>
          </div>
        </div>
        <div id="notificationPost-btn-wrapper">
          <button id="notification-post-edit-btn" class="btn-setting" >수정</button>
          <button id="notification-post-delete-btn" class="btn-setting">삭제</button>
        </div>
      </article>
    </section>
    <footer></footer>
<script src="scripts/notifications/notificationBoard.js"></script>
  </body>
</html>

