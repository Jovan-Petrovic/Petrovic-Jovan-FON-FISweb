<%-- 
    Document   : add
    Created on : Apr 28, 2020, 1:44:33 PM
    Author     : KORISNIK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add department</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>

        <div class="container">
            <div>
                <h1>This is page add.jsp for department!</h1>
            </div>
            <form action="/task1/app/department/save" method="POST">
                ${message}
                <table>
                    <tbody>
                        <tr>
                            <td>Shortname:</td>
                            <td><input type="text" name="shortname" value="" /></td>
                        </tr>
                        <tr>
                            <td>Name:</td>
                            <td><input type="text" name="name" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Save"/></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>

            </form>
        </div>



        <%@include file="../template/footer.jsp" %>

        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.0.0/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
