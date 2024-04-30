
<%@page import="com.google.gson.Gson"%>
<%@page import="vo.NotificationVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String  list = (String) request.getAttribute("data");
out.print(list);
%>
