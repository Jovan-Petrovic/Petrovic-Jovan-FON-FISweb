<%-- 
    Document   : all
    Created on : Apr 28, 2020, 1:46:31 PM
    Author     : KORISNIK
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All departments</title>
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>

    <div class="pt-5" id="table-departments">
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Shortname</th>
                    <th>Name</th>
                    <th>Delete</th>
                    <th>Edit</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="department" items="${applicationScope.departments}">
                    <tr>
                        <td>${department.id}</td>
                        <td>${department.shortname}</td>
                        <td>${department.name}</td>                       
                        <td><a class="btn btn-danger" href="/task1/app/department/delete?departmentId=${department.id}">Delete</a></td>
                        <td>
                            <form action="/task1/app/department/edit" method="post">
                                <input type="hidden" name="department_id" value="${department.id}">
                                <input type="submit" class="btn btn-primary border-primary mb-3" value="Edit"></input>
                            </form>
                        </td>>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
        
        <%@include file="../template/footer.jsp" %>
    </body>
</html>
