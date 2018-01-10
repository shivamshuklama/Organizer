<%-- 
    Document   : index
    Created on : 8 Jan, 2018, 12:44:42 PM
    Author     : Shivam_Shukla <shivam_shukla at find_a_job.in>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
       <style>
  body {
  padding-top: 80px;
  text-align: center;
  font-family: monaco, monospace;
  background: url(http://media.giphy.com/media/Jrd9E2kuPuOYM/giphy.gif) 50%;
  background-size: cover;
}
h1, h2 {
  display: inline-block;
  background: #fff;
}
h1 {
  font-size: 30px
}
h2 {
  font-size: 20px;
}
span {
  background: #fd0;
}
</style>
<script>
    



$(document).ready(function(){
    $("#show").click(function(){
        $("#ab").show();
    });
});
</script>
    <img src="index.jpg" id="abc">
    </head>
    <body>
        







        <button id="show">sign up please</button>
        <div id="ab" style="display: none">   <s:form action="submit">
            <s:textfield name="name" label="name"/>
            <s:textfield name="email" label="email"/>
            <s:textfield name="password" label="password"/>            
            <s:submit value="submit"/>
        </s:form>
     </div>
    </body>
</html>
