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
            <a href="/task1/app/department/all"> All departments</a>
        </div>
        <div>
            <a href="/task1/app/department/add"> Add department</a>
        </div>
    </body>
</html>
