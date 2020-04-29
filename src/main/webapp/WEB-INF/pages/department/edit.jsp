<%-- 
    Document   : edit
    Created on : Apr 29, 2020, 7:15:18 PM
    Author     : KORISNIK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit department</title>
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>
        
                <c:if test="${not empty message}">
                    <div>
                        ${message}
                    </div>
                </c:if>
                <form action="/task1/app/department/update" method="post">
                    <div class="form-group">
                        <label for="id">ID:</label>
                        <input type="text" class="form-control border-primary mb-3" name="id" value="${requestScope.department.id}" readonly="readonly">
                    </div>
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="text" class="form-control border-primary mb-3" name="name" value="${requestScope.department.name}">
                    </div>
                    <div class="form-group">
                        <label for="shortname">Shortname:</label>
                        <input type="text" class="form-control border-primary mb-3" name="shortname" value="${requestScope.department.shortname}">
                    </div>
                    <input type="submit" class="btn btn-primary border-primary mb-3" value="Update department"></input>
                </form>
                    
        <%@include file="../template/footer.jsp" %>
    </body>
</html>
