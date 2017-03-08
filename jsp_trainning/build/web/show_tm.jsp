<%@page import="java.sql.*"%> 
<%@include file="manage/connectIT.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html>  
    <head>   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
        <%@include file="menu_admin.jsp" %>
         <title>Show Data</title> 
        <style>   
            body{    
                background-color:#eee;     
            }       
            /*table--------------------*/     
            table {     
                border-collapse: collapse;        
            }          
            table, td, th {       
                border: 1px solid black;   
            }      
        </style> 
    </head>

    <body> 
        <div class="content container">    
            <h1 align="center"><font color="#0000FF ">คณาจารย์ สาขาการจัดการเทคโนโลยี</font></h1>    
            <table border="1" align="center" width="1230px" class="table ta">   
                <tr bgcolor="#33FF33" align="center">        
                    <td width="50"> ลำดับ </td>            
                    <td width = "160"> ชื่อ-นามสกุล</td>
                    <td width = "30">รหัสอาจารย์</td>
                    <td width = "30">รหัสผ่าน</td>
                    <td width = "30">ตำแหน่ง</td>
                    <td width = "30">ติดต่อ</td>
                    <td width = "50">จัดการ</td>     
                </tr>     

                <%                    String sql = "select * from profes_tm";
                    Statement stmt1 = con.createStatement();
                    ResultSet rs1 = con.createStatement().executeQuery(sql);
                    while (rs1.next()) {
                %>  

                <tr align="left">     
                    <td align="center"><%=rs1.getString("id_teach")%> </td> 
                    <td align="center"><%=rs1.getString("fname")%></td>
                    <td align="center"><%=rs1.getString("username")%></td>  
                    <td align="center"><%=rs1.getString("password")%></td>  
                    <td align="center"><%=rs1.getString("position")%></td>
                    <td align="center"><%=rs1.getString("contact")%></td>
                    <td align="center">
                        <a class="btn btn-blue" onclick="return 
                            confirm('คุณต้องการแก้ไขข้อมูลนี้ใช่ไหม') 
                           " href="edit_tm.jsp?id_teach=<%=rs1.getString("id_teach")%>">แก้ไข</a>
                         <a class="btn btn-red" onclick="return confirm('คุณต้องการลบใช่ไหม')" 
                           href="manage/delete_tm.jsp?id_teach=<%=rs1.getString("id_teach")%>">ลบ</a>
                    </td>


                </tr>      

                <%
                    }
                %>           
            </table>           
        </div>   
    </body>   
    <%@include file="footer.jsp" %> 
</html>    