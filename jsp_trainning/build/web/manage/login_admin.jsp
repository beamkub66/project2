
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@include file="connection.jsp" %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <%    
            String useradmin = request.getParameter("useradmin");
            String passadmin = request.getParameter("passadmin");
            Statement st = con.createStatement();
            
            ResultSet rs;

            rs = st.executeQuery("select * from admin where useradmin='"
                    + useradmin + "' and passadmin='"
                    + passadmin + "'");
            if (rs.next()) {
                session.setAttribute("useradmin", useradmin);
                out.println("welcome <b>" + useradmin + "</b>");
                out.println("<a href='logout.jsp'>Log out</a>");
                response.sendRedirect("../show_data.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('รหัสผ่านคุณไม่ถูกต้อง')");
                out.println("location='../frm_login.jsp';");
                out.println("</script>");
            }
        %>
    </body>
</html>                         