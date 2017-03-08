<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
        <%@include file="menu_teach.jsp" %>
        <%
            Object strid_teach = session.getAttribute("sid_teach");
            if (strid_teach == null) // Check Login
            {
                response.sendRedirect("frm_login_tm.jsp");
            }

            Connection connect = null;
            Statement s = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");

                connect = DriverManager.getConnection("jdbc:mysql://localhost/teacher", "root", "12345678");

                s = connect.createStatement();

                String sql = "SELECT * FROM profes_tm WHERE id_teach = '" + strid_teach.toString() + "' ";

                ResultSet rs = s.executeQuery(sql);
                if (rs.next()) {
        %>
        <div class="content"  >
            <br>
            <table border="1" align="center" width="800px" height="500px" method="post" autocomplete="off">
                <tbody>
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
                    <tr> <td align="center">
                            <a class="btn btn-blue" onclick="return
                                confirm('คุณต้องการแก้ไขข้อมูลนี้ใช่ไหม')
                               " href="e_tm.jsp?id_teach=<%=rs.getString("id_teach")%>">แก้ไข</a></tr>
                </tbody>
            </table>
            <br>	</div>
            <%} %>
            <%
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    out.println(e.getMessage());
                    e.printStackTrace();
                }

                try {
                    if (s != null) {
                        s.close();
                        connect.close();
                    }
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    out.println(e.getMessage());
                    e.printStackTrace();
                }
            %>

    </body>
    <%@include file="footer.jsp" %>
</html>