<%@page import="java.sql.*"%> 
<%@include file="manage/connectIT.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html>  
    <head>   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
          <div> 
            <img src="img/Header2.png" style="width: 100%">
            <!--Menu-->
            <ul>
                <li><a href="index.jsp">ย้อนกลับ</a></li>

            </ul>
        </div>
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
            <h1 align="center"><font color="#0000FF ">คณาจารย์ สาขาเทคโนโลยีสารสนเทศภูมิศาสตร์</font></h1>    
            <table border="1" align="center" width="800px" class="table ta">   
                <tr bgcolor="#33FF33" align="center">        
                               
                    <td width = "50"> ชื่อ - นามสกุล </td>     
                    <td width = "50">ตำแหน่ง</td>
                    <td width = "10">รายละเอียด</td>
                       
                </tr>     

                <%                    String sql = "select * from profes_git";
                    Statement stmt = con.createStatement();
                    ResultSet rs = con.createStatement().executeQuery(sql);
                    while (rs.next()) {
                %>  

                <tr align="center">     
                     
                    <td><%=rs.getString("fname")%></td>   
                    <td><%=rs.getString("position")%></td>
                     <td><a class="btn btn-blue" onclick="return 
                            confirm('') 
                           " href="data_MTA.jsp?id_teach=<%=rs.getString("id_teach")%>">ข้อมูล</a>
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