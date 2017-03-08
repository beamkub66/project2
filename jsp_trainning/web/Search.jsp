<%-- 
    Document   : Search
    Created on : Feb 28, 2017, 3:40:23 PM
    Author     : benkub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@include file="manage/connection.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ค้นหาข้อมูล</title>
    </head>
    <body>       
        <%@include file="menu.jsp" %> 
        <div class="content"> 
            <center><h1><font color="#00FF00">ค้นหาข้อมูลอาจารย์</font></h1></center>
                    <%                String username = "";
                        if (request.getParameter("txtname") != null) {
                            username = request.getParameter("txtname");
                        }
                    %>

            <form action="" method="post" autocomplete="off">     
                <div class="group-input container" >                
                    <div style="width: 100%;">                 
                        ค้นหาชื่อ:<br> <div align="center">      

                            <input name="txtname" type="text" id="username" placeholder="กรุณากรอกชื่อ" value="<%=username%>">
                            <input class="btn btn-blue" type="submit" value="ค้นหา"> 
                            <button class="btn btn-green" type="reset"> ยกเลิก </button>  </div>        
                    </div>             
                </div>            

            </form>
            <%
                Connection connection = null;
                Statement s = null;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/teacher", "root", "12345678");

                    s = connection.createStatement();

                    String sql = "SELECT * FROM profes_it WHERE fname like'%" + username + "%'" + "ORDER BY id_teach";
                    System.out.println(sql);

                    ResultSet rec = s.executeQuery(sql);

                    Connection connectiongit = null;
                    Statement g = null;
                    g = connection.createStatement();

                    String sqls = "SELECT * FROM profes_git WHERE fname like'%" + username + "%'" + "ORDER BY id_teach";
                    System.out.println(sqls);

                    ResultSet rec1 = g.executeQuery(sqls);
                    
                    Connection connectionctc = null;
                    Statement c = null;
                    c = connection.createStatement();

                    String sqls1 = "SELECT * FROM profes_ctc WHERE fname like'%" + username + "%'" + "ORDER BY id_teach";
                    System.out.println(sqls);

                    ResultSet rec2 = c.executeQuery(sqls1);
                    
                    Connection connectionmta = null;
                    Statement m = null;
                    m = connection.createStatement();

                    String sqls2 = "SELECT * FROM profes_mta WHERE fname like'%" + username + "%'" + "ORDER BY id_teach";
                    System.out.println(sqls);

                    ResultSet rec3 = m.executeQuery(sqls2);
                    
                    Connection connectiontm = null;
                    Statement t = null;
                    t = connection.createStatement();

                    String sqls3 = "SELECT * FROM profes_tm WHERE fname like'%" + username + "%'" + "ORDER BY id_teach";
                    System.out.println(sqls);

                    ResultSet rec4 = t.executeQuery(sqls3);

            %>

            <div class="content container">
                <table border="1" align="center" width="1330px" class="table ta">  
                    <tr bgcolor="#33FF33" align="center" >        

                        <td width = "250"> ชื่อ-นามสกุล </td> 
                        <td width = "100">อีเมล์</td>  
                        <td width = "220">สังกัด</td>
                        <td width = "150">ตำแหน่ง</td>     


                    </tr>
                    <%while ((rec != null) && (rec.next())) {%>

                    <tr align="left">    

                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rec.getString("fname")%></td> 
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rec.getString("contact")%></td> 
                        <td>&nbsp;&nbsp;&nbsp;<%=rec.getString("fa")%></td> 
                        <td><%=rec.getString("position")%></td> 

                    </tr>
                    <%}%>
                    <%while ((rec1 != null) && (rec1.next())) {%>

                    <tr align="left">     

                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rec1.getString("fname")%></td> 
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rec1.getString("contact")%></td> 
                        <td>&nbsp;&nbsp;&nbsp;<%=rec1.getString("fa")%></td> 
                        <td><%=rec1.getString("position")%></td> 

                    </tr>
                    <%}%>
                    
                    <%while ((rec2 != null) && (rec2.next())) {%>

                    <tr align="left">     

                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rec2.getString("fname")%></td> 
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rec2.getString("contact")%></td> 
                        <td>&nbsp;&nbsp;&nbsp;<%=rec2.getString("fa")%></td> 
                        <td><%=rec2.getString("position")%></td> 

                    </tr>
                    <%}%>
                    
                    <%while ((rec3 != null) && (rec3.next())) {%>

                   <tr align="left">     

                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rec3.getString("fname")%></td> 
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rec3.getString("contact")%></td> 
                        <td>&nbsp;&nbsp;&nbsp;<%=rec3.getString("fa")%></td> 
                        <td><%=rec3.getString("position")%></td> 

                    </tr>
                    <%}%>
                    
                    <%while ((rec4 != null) && (rec4.next())) {%>

                    <tr align="left">      

                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rec4.getString("fname")%></td> 
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rec4.getString("contact")%></td> 
                        <td>&nbsp;&nbsp;&nbsp;<%=rec4.getString("fa")%></td> 
                        <td><%=rec4.getString("position")%></td> 

                    </tr>
                    <%}%>

                </table></div>


            <%
                } catch (Exception e) {
                    out.println(e.getMessage());
                    e.printStackTrace();
                }
                try {
                    if (s != null) {
                        s.close();
                        connection.close();
                    }

                } catch (SQLException e) {
                    out.println(e.getMessage());
                    e.printStackTrace();
                }

            %>
        </div>
    </body>    
    <!--footer-->  
    <%@include file="footer.jsp" %>
</html>
