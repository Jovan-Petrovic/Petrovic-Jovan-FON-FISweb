<%-- 
    Document   : menu
    Created on : Apr 28, 2020, 1:41:14 PM
    Author     : KORISNIK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Login as:${sessionScope.loginUser.firstname} ${sessionScope.loginUser.lastname}, <a href="#">Logout</a>
        <div>
            <a href="/njt/app/department/all"> All users</a>
        </div>
        <div>
            <a href="/njt/app/department/add"> Add user</a>
        </div>
    </body>
</html>
