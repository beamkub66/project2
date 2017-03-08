package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public final class search_005fad_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/manage/connectIT.jsp");
    _jspx_dependants.add("/menu_admin.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ค้นหาข้อมูล</title>\n");
      out.write("    </head>\n");
      out.write("    <body>       \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu Admin</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/header.css\">\n");
      out.write("      \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div> \n");
      out.write("            <img src=\"img/header.png\" style=\"width: 100%\">\n");
      out.write("            <!--Menu-->\n");
      out.write("            <ul>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <li><a href=\"search_ad.jsp\">ค้นหาข้อมูล</a></li>\n");
      out.write("                <li><a href=\"show_data.jsp\">Information Technology</a></li>\n");
      out.write("                <li><a href=\"show_git.jsp\">Geographical Information Technology</a></li>\n");
      out.write("                <li><a href=\"show_mta.jsp\">Multimedia Technology Animation</a></li>\n");
      out.write("                <li><a href=\"show_ctc.jsp\">Computer and Communication Technology</a></li>\n");
      out.write("                <li><a href=\"show_tm.jsp\">Technology Management</a></li>\n");
      out.write("                <li><a href=\"manage/logout.jsp\">ออกจากระบบ</a></li>\n");
      out.write("                \n");
      out.write("             \n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("  \n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("        <div class=\"content\"> \n");
      out.write("            <center><h1><font color=\"#00FF00\">ค้นหาข้อมูลอาจารย์</font></h1></center>\n");
      out.write("                    ");
                String fname = "";
                        if (request.getParameter("txtname") != null) {
                            fname = request.getParameter("txtname");
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("            <form action=\"\" method=\"post\" autocomplete=\"off\">     \n");
      out.write("                <div class=\"group-input container\" >                \n");
      out.write("                    <div style=\"width: 100%;\">                 \n");
      out.write("                        ค้นหาชื่อ:<br> <div align=\"center\">      \n");
      out.write("\n");
      out.write("                            <input name=\"txtname\" type=\"text\" id=\"fname\" placeholder=\"กรุณากรอกชื่อ\" value=\"");
      out.print(fname);
      out.write("\">\n");
      out.write("                            <input class=\"btn btn-blue\" type=\"submit\" value=\"ค้นหา\"> \n");
      out.write("                            <button class=\"btn btn-green\" type=\"reset\"> ยกเลิก </button>  </div>        \n");
      out.write("                    </div>             \n");
      out.write("                </div>            \n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            ");

                Connection connection = null;
                Statement s = null;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/it_db", "root", "12345678");

                    s = connection.createStatement();

                    String sql = "SELECT * FROM profes_it WHERE fname like'%" + fname + "%'" + "ORDER BY id_teach";
                    System.out.println(sql);

                    ResultSet rec = s.executeQuery(sql);
            
      out.write("\n");
      out.write("            <div class=\"content container\">\n");
      out.write("                <table border=\"1\" align=\"center\" width=\"600px\" class=\"table ta\">  \n");
      out.write("                    <tr bgcolor=\"#33FF33\" align=\"center\">        \n");
      out.write("\n");
      out.write("                        <td width = \"50\"> ชื่อ - สกุล </td>     \n");
      out.write("                        <td width = \"50\">ตำแหน่ง</td>                              \n");
      out.write("                        <td width = \"20\">ติดต่อ</td>     \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
while ((rec != null) && (rec.next())) {
      out.write("\n");
      out.write("                    <tr align=\"center\">    \n");
      out.write("\n");
      out.write("                        <td>");
      out.print(rec.getString("fname"));
      out.write("</td>       \n");
      out.write("                        <td>");
      out.print(rec.getString("position"));
      out.write("</td>         \n");
      out.write("                        <td>");
      out.print(rec.getString("contact"));
      out.write("</td>               \n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                </table></div>\n");
      out.write("                ");

                    } catch (Exception e) {
                        out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    try {
                        if (s != null) {
                            s.close();
                            connection.close();
                        }
                    } catch (SQLException e) {
                        out.println(e.getMessage());
                        e.printStackTrace();
                    }
                
      out.write("\n");
      out.write("        </div>   \n");
      out.write("    </body>    \n");
      out.write("    <!--footer-->  \n");
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
      out.write("            <span> ฐานข้อมูลอาจารย์ คณะเทคโนโลยีสารสนเทศ  </span>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</html>\n");
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
