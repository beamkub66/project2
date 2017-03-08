<%@page import="java.sql.*"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@include file="connectIT.jsp" %> 
<!DOCTYPE html> 
<html>   
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
        <title>Update</title>   
    </head>   
    <body> 

        <%            
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
        %> 
        
        <%          
            try {
                Statement st = con.createStatement();
                String id_teach = request.getParameter("id_teach");
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String fname = request.getParameter("fname");
                String education = request.getParameter("education");
                String career_h = request.getParameter("career_h");
                String position = request.getParameter("position");
                String contact = request.getParameter("contact");
                String sql = "UPDATE profes_mta "
                        + "SET id_teach = '" + id_teach + "' "
                        + ", username = '" + username + "' "
                        + ", password = '" + password + "' "                    
                        + ", fname = '" + fname + "' "
                        + ", education = '" + education + "' "
                        + ", career_h = '" + career_h + "' "
                        + ", position = '" + position + "' "
                        + ", contact = '" + contact + "' "
                        + " WHERE id_teach = '" + id_teach + "' ";
                if (st.executeUpdate(sql) != -1) {
                    out.print("แก้ไขข้อมูลเรียบร้อย");
                    response.sendRedirect("../Profilemta.jsp");
                } else {
                    out.print("แก้ไขข้อมูลไม่สำเร็จ");
                    response.sendRedirect("../Profilemta.jsp");
                }
            } catch (Exception ex) {
                out.print(ex);
            }
        %>   
    </body> 

</html> 