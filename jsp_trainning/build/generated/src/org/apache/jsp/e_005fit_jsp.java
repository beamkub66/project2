package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class e_005fit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/manage/connectIT.jsp");
    _jspx_dependants.add("/menu_teach.jsp");
    _jspx_dependants.add("/footer.jsp");
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

      out.write('\n');
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
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/teacher","root","12345678"); 

      out.write(" \n");
      out.write("\n");
 
  //  out.print("Connect Sucessfully"); 

      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>   \n");
      out.write("    <head>  \n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("\n");
      out.write("        <title> Edit Regist </title> \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("        <title>Menu</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div> \n");
      out.write("            <img src=\"img/Header2.png\" style=\"width: 100%\" >\n");
      out.write("            <!--Menu-->\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"Profile.jsp\">หน้าหลัก</a></li>\n");
      out.write("                <li><a href=\"manage/logout.jsp\">ออกจากระบบ</a></li>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>  \n");
      out.write("\n");
      out.write("    ");
        String sql = "select * from profes_it where id_teach=" + request.getParameter("id_teach");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
    
      out.write(" \n");
      out.write("\n");
      out.write("    <body>    \n");
      out.write("\n");
      out.write("        <div class=\"content\"  >\n");
      out.write("            <center><h1><font color=\"#00FF00\">แก้ไขข้อมูล</font></h1></center>\n");
      out.write("            <form action=\"manage/update.jsp\" method=\"post\" autocomplete=\"off\">        \n");
      out.write("                <div class=\"group-input container\" >           \n");
      out.write("                    <div style=\"width: 90%;\">    \n");
      out.write("                        รหัส :<br> \n");
      out.write("                        <input type=\"text\" name=\"id_teach\" value=\"");
      out.print(rs.getString("id_teach"));
      out.write("\"><br>    \n");
      out.write("                        ชื่อ-นามสกุล :<br>        \n");
      out.write("                        <input type=\"text\" name=\"fname\" value=\"");
      out.print(rs.getString("fname"));
      out.write("\"><br>\n");
      out.write("                        Username :<br>        \n");
      out.write("                        <input type=\"text\" name=\"username\" value=\"");
      out.print(rs.getString("username"));
      out.write("\"><br>\n");
      out.write("                        Password :<br>        \n");
      out.write("                        <input type=\"text\" name=\"password\" value=\"");
      out.print(rs.getString("password"));
      out.write("\"><br>\n");
      out.write("                        ตำแหน่ง :<br>            \n");
      out.write("                        <input type=\"text\" name=\"position\" value=\"");
      out.print(rs.getString("position"));
      out.write("\"><br>\n");
      out.write("                         ตำแหน่ง :<br>            \n");
      out.write("                        <input type=\"text\" name=\"contact\" value=\"");
      out.print(rs.getString("contact"));
      out.write("\"><br> \n");
      out.write("                        <div align=\"center\"> \n");
      out.write("                            <button class=\"btn btn-blue\" type=\"submit\">บันทึก</button>      \n");
      out.write("                            <button class=\"btn btn-red\" type=\"show_data.jsp\">ยกเลิก</button>     \n");
      out.write("                        </div>\n");
      out.write("                    </div>         \n");
      out.write("                </div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>  \n");
      out.write("        </div> \n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </body>  \n");
      out.write("    ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/header.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <span> ระบบฐานข้อมูลอาจารย์ คณะเทคโนโลยีสารสนเทศ  </span>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
