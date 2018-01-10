<%-- 
    Document   : success
    Created on : 8 Jan, 2018, 1:02:51 PM
    Author     : Shivam_Shukla <shivam_shukla at find_a_job.in>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <P>hello</P>
        <s:property value="firstname" />
        <s:form action="login">
            <s:textfield name="email" label="email"/>
        
         <s:textfield name="password" label="password"/>
         <s:submit name="submit" value="submit"/>
        </s:form>
    </body>
</html>
