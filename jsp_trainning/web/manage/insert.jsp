

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>   
    <head> 

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="connectIT.jsp" %>
        <title>Insert</title>   
    </head>    
    <body>   
        <%
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
        %>  

        <%
            try {
               
                Statement st = con.createStatement(); 
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String fname = request.getParameter("fname");
                String position = request.getParameter("positon");
                String contact = request.getParameter("contact");
                String sql = "INSERT INTO profes_it(username,password,fname,position,contact)"
                +"value('"+username+"','"
                        +password+"','"
                        +fname+"','"
                        +position+"','"
                        +contact+"','";
                
                if (st.executeUpdate(sql) != -1) {
                    out.print("บันทึกข้อมูลเรียบร้อย");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('แก้ไขข้อมูลเรียบร้อยแล้ว');");
                   response.sendRedirect("../show_data.jsp");
                     
                } else {
                    out.print("บันทึกข้อมูลไม่สำเร็จ");
                    response.sendRedirect("../frm_regist.jsp");
                }
            } catch (Exception ex) {
                out.print(ex);
            }
        %>   
    </body>
</html>