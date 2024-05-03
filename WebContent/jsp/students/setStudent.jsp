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
      <h2 id="title">수강생 정보 수정</h2>
    </section>
    <section id="content-section">
      <article>
        <div id="addStudent-wrapper">
          <div class="student-item">
            <h4>이름 *</h4>
            <input type="text" id="user_name" value="김선희" />
          </div>
          <div class="student-item">
            <h4>HRD-Net ID *</h4>
            <p id="hrd_net_id">sunsun33</p>
          </div>
          <div class="student-items">
            <div class="student-items-item">
              <h4>생년월일 *</h4>
              <input type="text" id="birth" value="980630" />
            </div>
            <div class="student-items-item">
              <h4>성별 *</h4>
              <div class="gender">
                <div>
                  <input type="radio" id="select" name="gender" />
                  <label for="select">남성</label>
                </div>
                <div>
                  <input
                    type="radio"
                    id="select2"
                    name="gender"
                    checked="checked"
                  />
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
                  <option value="277" selected>277기</option>
                  <option value="278">278기</option>
                </select>
              </form>
            </div>
            <div class="student-items-item">
              <h4>지역 *</h4>
              <input type="text" id="province" value="서울" />
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
            <input type="text" id="phone_number" value="010-8888-5555" />
          </div>
          <div class="student-item">
            <h4>이메일 *</h4>
            <input type="text" id="email" value="sunsun33@gmail.com" />
          </div>
          <button id="edit-btn" class="btn-setting">수정</button>
        </div>
      </article>
    </section>
    <footer></footer>
  </body>
</html>
