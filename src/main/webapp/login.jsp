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
        <title>Login</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div>
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
                        <input class="btn btn-outline-success" type="submit" id="Login" value="Log in"/>
                    </form>
                </div>
            </div>
        </div>
              
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.0.0/jquery.min.js"> </script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/js/bootstrap.min.js"> </script>
    </body>
</html>
