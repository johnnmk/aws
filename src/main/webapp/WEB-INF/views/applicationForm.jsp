<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Application Form</h1>
        <form:form name="appFrm" commandName="user" action="${pageContext.servletContext.contextPath}/createcontact" method="post">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name"/><td>
                </tr>
                  <tr>
                
            
                    <td>Email:</td>
                    <td><form:input path="email"/><td>
                </tr>
                <tr>
                    <td>Profession: </td>
                    <td>
                        <form:select path="profession">
                            <form:option value="student">School</form:option>
                            <form:option value="doctor">Hospital</form:option>               
                        </form:select>
                    <td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>

        </form:form>
    </body>
</html>
