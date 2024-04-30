<%@page import="com.google.gson.Gson"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String  notification = (String) request.getAttribute("data");
out.print(notification);
%>
    