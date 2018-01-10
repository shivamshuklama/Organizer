<%-- 
    Document   : Success1
    Created on : 8 Jan, 2018, 10:26:26 PM
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
        <h1>hey</h1>
        <s:property value="email"></s:property>
        <h3> let's take a tour to the website</h3>
        <h3>Add some tasks</h3>
        <table><tr><td>
                    <form action="submittodotask">
                    <s:hidden value="email"/>
                <s:textarea name="To_Do" label="To Do"/>
                <s:submit value="submit"></s:submit></form></td>
                <td><form action="submitdoingtask"> <s:hidden value="email"/><s:textarea name="doing" label="Doing"/><s:submit value="submit"></s:submit></form></td>
                <td><form action="submitdonetask"> <s:hidden value="email"/><s:textarea name="done" label="Done"/><s:submit value="submit"></s:submit></form></td>
    </body>
</html>
