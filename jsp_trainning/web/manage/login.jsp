
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@include file="connectIT.jsp" %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <%    
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Statement st = con.createStatement();
            
            ResultSet rs;

            rs = st.executeQuery("select * from profes_it where username='"
                    + username + "' and password='"
                    + password + "'");
            
            if (rs.next()) {
                session.setAttribute("username", username);
                out.println("welcome <b>" + username + "</b>");
                out.println("<a href='logout.jsp'>Log out</a>");
                response.sendRedirect("../frm_show_data.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('รหัสผ่านคุณไม่ถูกต้อง')");
                out.println("location='../frm_login.jsp';");
                out.println("</script>");
            }
         
            Statement git = con.createStatement();
            
            ResultSet g;

            g = st.executeQuery("select * from profes_git where username='"
                    + username + "' and password='"
                    + password + "'");
            
            if (g.next()) {
                session.setAttribute("username", username);
                out.println("welcome <b>" + username + "</b>");
                out.println("<a href='logout.jsp'>Log out</a>");
                response.sendRedirect("../frm_show_data.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('รหัสผ่านคุณไม่ถูกต้อง')");
                out.println("location='../frm_login.jsp';");
                out.println("</script>");
            }
            Statement ctc = con.createStatement();
            
            ResultSet c;

            c = ctc.executeQuery("select * from profes_ctc where username='"
                    + username + "' and password='"
                    + password + "'");
            
            if (c.next()) {
                session.setAttribute("username", username);
                out.println("welcome <b>" + username + "</b>");
                out.println("<a href='logout.jsp'>Log out</a>");
                response.sendRedirect("../frm_show_data.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('รหัสผ่านคุณไม่ถูกต้อง')");
                out.println("location='../frm_login.jsp';");
                out.println("</script>");
            }
            Statement tm = con.createStatement();
            
            ResultSet t;

            t = tm.executeQuery("select * from profes_tm where username='"
                    + username + "' and password='"
                    + password + "'");
            
            if (t.next()) {
                session.setAttribute("username", username);
                out.println("welcome <b>" + username + "</b>");
                out.println("<a href='logout.jsp'>Log out</a>");
                response.sendRedirect("../frm_show_data.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('รหัสผ่านคุณไม่ถูกต้อง')");
                out.println("location='../frm_login.jsp';");
                out.println("</script>");
            }
            Statement mta = con.createStatement();
            
            ResultSet m;

            m = mta.executeQuery("select * from profes_mta where username='"
                    + username + "' and password='"
                    + password + "'");
            
            if (m.next()) {
                session.setAttribute("username", username);
                out.println("welcome <b>" + username + "</b>");
                out.println("<a href='logout.jsp'>Log out</a>");
                response.sendRedirect("../frm_show_data.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('รหัสผ่านคุณไม่ถูกต้อง')");
                out.println("location='../frm_login.jsp';");
                out.println("</script>");
            }
        %>
        
    </body>
</html>                         