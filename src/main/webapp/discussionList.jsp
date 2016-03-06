<%-- 
    Document   : discussionList
    Created on : Mar 6, 2016, 12:51:17 PM
    Author     : griffiths
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post List</title>
</head>
<body>
    <h1>Thank you for posting ${username}! </h1>

       <div>
              Posts:<br /><br />

              <c:forEach var="post" items="${post}">
                  <strong>${post.title}</strong> <br> ${post.post} <br> ${post.username} : ${post.date} <br>
              </c:forEach>

       </div>

    <a href="newPost.jsp">Click here to add another post</a>
    <a href="logout">Click here to log out</a>

</body>