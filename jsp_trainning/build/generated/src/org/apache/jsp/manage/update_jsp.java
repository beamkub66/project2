package org.apache.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/manage/connectIT.jsp");
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

      out.write(" \n");
      out.write(" \n");
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
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/professor","root","12345678"); 

      out.write(" \n");
      out.write("\n");
 
  //  out.print("Connect Sucessfully"); 

      out.write(' ');
      out.write(" \n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html>   \n");
      out.write("    <head>  \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">   \n");
      out.write("        <title>Update</title>   \n");
      out.write("    </head>   \n");
      out.write("    <body> \n");
      out.write("\n");
      out.write("        ");
            
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
        
      out.write(" \n");
      out.write("        \n");
      out.write("        ");
          
            try {
                Statement st = con.createStatement();
                String id_teach = request.getParameter("id_teach");
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String fname = request.getParameter("fname");
                String position = request.getParameter("position");
                String sql = "UPDATE profes_it "
                        + "SET id_teach = '" + id_teach + "' "
                        + ", username = '" + username + "' "
                        + ", password = '" + password + "' "                    
                        + ", fname = '" + fname + "' "
                        + ", lname = '" + position + "' "
                        + " WHERE id_teach = '" + id_teach + "' ";
                if (st.executeUpdate(sql) != -1) {
                    out.print("แก้ไขข้อมูลเรียบร้อย");
                    response.sendRedirect("../show_data.jsp");
                } else {
                    out.print("แก้ไขข้อมูลไม่สำเร็จ");
                    response.sendRedirect("../show_data.jsp");
                }
            } catch (Exception ex) {
                out.print(ex);
            }
        
      out.write("   \n");
      out.write("    </body> \n");
      out.write("\n");
      out.write("</html> ");
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
