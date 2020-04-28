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
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>
        
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
        
        <%@include file="../template/footer.jsp" %>
    </body>
</html>
