<%-- 
    Document   : login
    Created on : Apr 28, 2020, 12:47:24 AM
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
        <h1>This is login.jsp page!</h1>
        ${message}
        <form action="/task1/app/login" method="post">
            Email:
            <div>
                <input type="text" id="email" name="email"/>
            </div>
            <p/>
            Password:
            <div>
                <input type="password" id="password" name="password"/>
            </div>
            <p/>
            <input type="submit" id="Login" value="Log in"/>
        </form>
    </body>
</html>
