
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@include file="connectIT.jsp" %> 
<!DOCTYPE html> 
<html>   
    <head>   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
        <title>DELETE</title>   
    </head> 
    <body>   
        <%            String sql = "DELETE FROM profes_ctc WHERE id_teach=" + request.getParameter("id_teach");
            Class.forName("com.mysql.jdbc.Driver");
            Statement st = con.createStatement();
            if (st.executeUpdate(sql) != -1) {

                response.sendRedirect("../show_data.jsp");
                out.print("ลบข้อมูลเรียบร้อยแล้ว");
            }
        %>    
    </body> 
</html> 