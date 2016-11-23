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
        <h1>Application Form Data</h1>

        <h3>Access ModelAttribute data</h3>

        <form:form name="appFrm" commandName="contact" action="${pageContext.servletContext.contextPath}/createcontact" method="post">
            Name: ${contact.name}<br/>
            Email: ${contact.email}<br/>
            Profession: ${contact.profession}<br/>
        </form:form>
   

    </body>
</html>
