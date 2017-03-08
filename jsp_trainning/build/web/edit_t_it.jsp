<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="manage/connectIT.jsp" %>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>   
    <head>  

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 

        <title> Edit Regist </title> 
        <%@include file="menu_admin.jsp" %>


    </head>  

    <%        String sql = "select * from profes_it where id_teach=" + request.getParameter("id_teach");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
    %> 

    <body>    

        <div class="content"  >
            <br>
            <form action="manage/update.jsp" method="post" autocomplete="off"> 
            <table border="1" align="center" width="800px" height="500px" method="post" autocomplete="off">
                <tbody>
                    <tr>
                        <td  align="center"> รหัส :<br>            
                            <input type="text" name="id_teach" value=" <%=rs.getString("id_teach")%>"><br></td></tr>
                     <tr><td  align="center"> ชื่อ-นามสกุล :<br>            
                            <input type="text" name="fname" value=" <%=rs.getString("fname")%>"><br></td></tr>
                      <tr><td  align="center">  ตำแหน่ง :<br>            
                              <input type="text" name="position" value=" <%=rs.getString("position")%>"><br></td></tr>

                         <tr><td  align="center"> ติดต่อ :<br>            
                            <input type="text" name="contact" value=" <%=rs.getString("contact")%>"><br></td></tr>
                             
                    		
                    <tr><td>
                <div align="center"> 
                    <button class="btn btn-blue" type="submit">บันทึก</button>      
                    <button class="btn btn-red" type="show_data.jsp">ยกเลิก</button>     
                </div></td></tr>
                </tbody>
            </table></form>
            <br>	</div> 
            <%
                }
            %>

    </body>  
    <%@include file="footer.jsp" %>
</html>

