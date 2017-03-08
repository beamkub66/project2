package org.apache.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/manage/../manage/connection.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>   \n");
      out.write("    <head> \n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
 
request.setCharacterEncoding("UTF-8");           
response.setCharacterEncoding("UTF-8"); 

      out.write(" \n");
      out.write("\n");
      
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/traning_db","root","12345678"); 

      out.write(" \n");
      out.write("\n");
 
    out.print("Connect Sucessfully"); 

      out.write(' ');
      out.write("\n");
      out.write("        <title>เพิ่มผู้ดูแลระบบ</title>   \n");
      out.write("    </head>    \n");
      out.write("    <body>   \n");
      out.write("        ");

            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
        
      out.write("  \n");
      out.write("\n");
      out.write("        ");

            try {
               
                Statement st = con.createStatement(); 
                String username = request.getParameter("username");
                String password = request.getParameter("pass");
                String sex = request.getParameter("sex");
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String email = request.getParameter("email");
                String tel = request.getParameter("tel");
                String address = request.getParameter("address");
                String sql = "INSERT INTO customer(username,password,sex,fname,lname,email,tel,address)";

                if (st.executeUpdate(sql) != -1) {
                    out.print("บันทึกข้อมูลเรียบร้อย");
                     response.sendRedirect("../frm_login.jsp"); 
                } else {
                    out.print("บันทึกข้อมูลไม่สำเร็จ");
                    response.sendRedirect("frm_login.jsp");
                }
            } catch (Exception ex) {
                out.print(ex);
            }
        
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
