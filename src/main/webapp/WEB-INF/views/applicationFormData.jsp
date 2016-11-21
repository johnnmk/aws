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
        <!--Note: ModelAttribute bean object can be accessed only inside the  form:form  with the commandName field mapped to it-->

        <form:form name="appFrm" commandName="user" action="${pageContext.servletContext.contextPath}/createcontact" method="post">
            Name: ${user.name}<br/>
            Email: ${user.email}<br/>
            Profession: ${user.profession}<br/>
        </form:form>
        <!-- Here user is the reference (defined in commandName) of the User class -->



        <h3>Alternate way of access using $ {param} attribute. $ {param} is similar to request.getParamter()</h3>
        Name: ${param.name}<br/>
        Email: ${param.email}<br/>
  	 	Profession: : ${param.profession}<br/>

    </body>
</html>
