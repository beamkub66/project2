
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<% 
request.setCharacterEncoding("UTF-8");           
response.setCharacterEncoding("UTF-8"); 
%> 

<%      
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/admin","root","12345678"); 
%> 

<% 
  //  out.print("Connect Sucessfully"); 
%> 