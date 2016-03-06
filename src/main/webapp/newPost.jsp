<%-- 
    Document   : newPost
    Created on : Mar 6, 2016, 1:20:25 PM
    Author     : griffiths
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body>
        <h1>Welcome, ${username}! Please enter a new post:</h1>
        
        <form method="POST" action="CreatePost">
            Title: <input type="text" name="txtTitle" /><br />
            Post: <input type="text" name="txtPost" /><br />
            Username: <input type="text" name="txtUsername" /><br />
            Date: <input type="text" name="txtDate" /><br />
            <br />
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
