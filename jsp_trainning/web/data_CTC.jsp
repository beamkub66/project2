<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="manage/connectIT.jsp" %>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>   
    <head>  

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 

        <title> Edit Regist </title> 
    <div> 
        <img src="img/header.png" style="width: 100%">
        <!--Menu-->
        <ul>
            <li><a href="IT.jsp">ย้อนกลับ</a></li>

        </ul>
    </div>


</head>  

<%        String sql = "select * from profes_ctc where id_teach=" + request.getParameter("id_teach");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    if (rs.next()) {
%> 

<body>    

    <div class="content"  >

        <table border="1" align="center" width="800px" height="500px"  action="manage/update.jsp" method="post" autocomplete="off">        
            <tr>   
                <td  align="center"> รหัส : 
                    <%=rs.getString("id_teach")%><br>  </td></tr>  
            <tr><td  align="center">ชื่อ-นามสกุล :        
                    <%=rs.getString("fname")%><br></td></tr>
            <tr> <td  align="center">ตำแหน่ง :            
                    <%=rs.getString("position")%><br></td></tr> 
            <tr><td  align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ประวัติการศึกษา :        
                    <%=rs.getString("education")%><br></td></tr> 
            <tr> <td  align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ประวัติการทำงาน :        
                    <%=rs.getString("career_h")%><br></td></tr> 
            <tr> <td  align="center">ติดต่อ :           
                    <%=rs.getString("contact")%><br> </td></tr> 
            


            </tr>  


        </table>  
    </div> 
    <%
        }
    %>

</body>  
<%@include file="footer.jsp" %>
</html>

