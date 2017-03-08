<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@include file="manage/connectIT.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ค้นหาข้อมูล</title>
    </head>
    <body>       
        <%@include file="menu_admin.jsp" %> 
        <div class="content"> 
            <center><h1><font color="#00FF00">ค้นหาข้อมูลอาจารย์</font></h1></center>
                    <%                String fname = "";
                        if (request.getParameter("txtname") != null) {
                            fname = request.getParameter("txtname");
                        }
                    %>

            <form action="" method="post" autocomplete="off">     
                <div class="group-input container" >                
                    <div style="width: 100%;">                 
                        ค้นหาชื่อ:<br> <div align="center">      

                            <input name="txtname" type="text" id="fname" placeholder="กรุณากรอกชื่อ" value="<%=fname%>">
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
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/professor", "root", "12345678");

                    s = connection.createStatement();

                    String sql = "SELECT * FROM profes_it WHERE fname like'%" + fname + "%'" + "ORDER BY id_teach";
                    System.out.println(sql);

                    ResultSet rec = s.executeQuery(sql);
            %>
            <div class="content container">
                <table border="1" align="center" width="1000px" class="table ta">  
                    <tr bgcolor="#33FF33" align="center">        

                        <td width = "250"> ชื่อ - สกุล </td>     
                        <td width = "250">ตำแหน่ง</td>                              
                        <td width = "220">ติดต่อ</td>     
                        

                    </tr>
                    <%while ((rec != null) && (rec.next())) {%>
                    <tr align="center">    

                        <td><%=rec.getString("fname")%></td>       
                        <td><%=rec.getString("position")%></td>         
                        <td><%=rec.getString("contact")%></td>               
                        


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
