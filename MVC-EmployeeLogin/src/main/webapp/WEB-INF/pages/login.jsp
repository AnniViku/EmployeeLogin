<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h1 style="color:red;text-align:center">Login Page</h1>

<form:form method="post" commandName="empCmd">
ID :       <form:input path="id"/> <br>
userName:  <form:input path="userName"/> <br>
       <input type="submit" value="login" />
</form:form>
