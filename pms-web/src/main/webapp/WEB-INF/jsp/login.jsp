<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello Krati</h1>
<form:form method="POST" action="servelogin.do" modelAttribute="User" >
<table>
	<tr>
        <td>
            <label>
                  <p>User Name</p>            
            	  <form:input path="email" placeholder="Please enter your email" id="email" />
           </label>
       	</td>
    </tr>
    <tr>
        <td>
            <label>
                  <p>PassWord</p>          
           		 <form:input path="password" placeholder="Please enter your Password" id="password" />
           	</label>
       	</td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Submit" /></td>
    </tr>
</table>

</form:form>

</body>
</html>