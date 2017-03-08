<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="manage/connectIT.jsp" %>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>   
    <head>  

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 

        <title> Edit Regist </title> 
        <%@include file="menu_teach.jsp" %>


    </head>  

    <%        String sql = "select * from profes_it where id_teach=" + request.getParameter("id_teach");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
    %> 

    <body>    

        <div class="content"  >
            <center><h1><font color="#00FF00">แก้ไขข้อมูล</font></h1></center>
            <form action="manage/up_e_it.jsp" method="post" autocomplete="off">        
                <div class="group-input container" >           
                    <div style="width: 90%;">    
                        รหัส :<br> 
                        <input type="text" name="id_teach" value="<%=rs.getString("id_teach")%>"><br>    
                        ชื่อ-นามสกุล :<br>        
                        <input type="text" name="fname" value="<%=rs.getString("fname")%>"><br>
                        Username :<br>        
                        <input type="text" name="username" value="<%=rs.getString("username")%>"><br>
                        Password :<br>        
                        <input type="text" name="password" value="<%=rs.getString("password")%>"><br>
                        ตำแหน่ง :<br>            
                        <input type="text" name="position" value="<%=rs.getString("position")%>"><br>
                         ตำแหน่ง :<br>            
                        <input type="text" name="contact" value="<%=rs.getString("contact")%>"><br> 
                        <div align="center"> 
                            <button class="btn btn-blue" type="submit">บันทึก</button>      
                           <button  class="btn btn-red" type="Profile.jsp">ยกเลิก</button>         
                        </div>
                    </div>         
                </div>   


            </form>  
        </div> 
        <%
            }
        %>

    </body>  
    <%@include file="footer.jsp" %>
</html>

