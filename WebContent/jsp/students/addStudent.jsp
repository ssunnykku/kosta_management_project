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
    <link rel="stylesheet" href="css/students.css" />
  </head>
  <body id="content-wrapper">
    	<jsp:include page="../common/header.jsp" />
    <section id="title-wrapper">
      <h2 id="title">수강생 등록</h2>
    </section>
    <section id="content-section">
      <article>
        <div id="addStudent-wrapper">
          <div class="student-item">
            <h4>이름 *</h4>
            <input type="text" id="user_name" />
          </div>
          <div class="student-item">
            <h4>HRD-Net ID *</h4>
            <input type="text" id="hrd_net_id" />
          </div>
          <div class="student-items">
            <div class="student-items-item">
              <h4>생년월일 *</h4>
              <input type="text" id="birth" />
            </div>
            <div class="student-items-item">
              <h4>성별 *</h4>
              <div class="gender">
                <div>
                  <input type="radio" id="select" name="gender" />
                  <label for="select">남성</label>
                </div>
                <div>
                  <input type="radio" id="select2" name="gender" />
                  <label for="select2">여성</label>
                </div>
              </div>
            </div>
          </div>
          <div class="student-items">
            <div class="student-items-item">
              <h4>기수 *</h4>
              <form action="">
                <select name="course_number" id="course_number">
                  <option>기수를 선택하세요.</option>
                  <option value="275">275기</option>
                  <option value="276">276기</option>
                  <option value="277">277기</option>
                  <option value="278">278기</option>
                </select>
              </form>
            </div>
            <div class="student-items-item">
              <h4>지역 *</h4>
              <input type="text" id="province" />
            </div>
          </div>
          <div class="student-items-bank">
            <div class="student-items-item">
              <h4>은행</h4>
              <input type="text" id="bank" />
            </div>
            <div class="student-items-item">
              <h4>계좌번호</h4>
              <input type="text" id="account" />
            </div>
          </div>
          <div class="student-item">
            <h4>전화번호 *</h4>
            <input type="text" id="phone_number" />
          </div>
          <div class="student-item">
            <h4>이메일 *</h4>
            <input type="text" id="email" />
          </div>
          <button id="enroll-btn" class="btn-setting">등록</button>
        </div>
      </article>
    </section>
    <footer></footer>
  </body>
</html>
