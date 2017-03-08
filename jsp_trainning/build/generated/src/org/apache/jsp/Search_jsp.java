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

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/manage/connection.jsp");
    _jspx_dependants.add("/menu.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
 
request.setCharacterEncoding("UTF-8");           
response.setCharacterEncoding("UTF-8"); 

      out.write(" \n");
      out.write("\n");
      
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/admin","root","12345678"); 

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
      out.write("            <img src=\"img/header.png\" style=\"width: 100%\">\n");
      out.write("            <!--Menu-->\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.jsp\">หน้าแรก</a></li>\n");
      out.write("                <li><a href=\"Search.jsp\">ค้นหาข้อมูล</a></li>\n");
      out.write("                <li><a href=\"frm_login.jsp\">เข้าสู่ระบบ</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
      out.write(" \n");
      out.write("        <div class=\"content\"> \n");
      out.write("            <center><h1><font color=\"#00FF00\">ค้นหาข้อมูลอาจารย์</font></h1></center>\n");
      out.write("                    ");
                String username = "";
                        if (request.getParameter("txtname") != null) {
                            username = request.getParameter("txtname");
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("            <form action=\"\" method=\"post\" autocomplete=\"off\">     \n");
      out.write("                <div class=\"group-input container\" >                \n");
      out.write("                    <div style=\"width: 100%;\">                 \n");
      out.write("                        ค้นหาชื่อ:<br> <div align=\"center\">      \n");
      out.write("\n");
      out.write("                            <input name=\"txtname\" type=\"text\" id=\"username\" placeholder=\"กรุณากรอกชื่อ\" value=\"");
      out.print(username);
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
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/teacher", "root", "12345678");

                    s = connection.createStatement();
                    

                    String sql = "SELECT * FROM profes_it WHERE fname like'%" + username + "%'" + "ORDER BY id_teach";
                    System.out.println(sql);

                    

                    ResultSet rec = s.executeQuery(sql);
                

            
      out.write("\n");
      out.write("           \n");
      out.write("            <div class=\"content container\">\n");
      out.write("                <table border=\"1\" align=\"center\" width=\"1000px\" class=\"table ta\">  \n");
      out.write("                    <tr bgcolor=\"#33FF33\" align=\"center\" >        \n");
      out.write("\n");
      out.write("                        <td width = \"200\"> ชื่อ-นามสกุล </td> \n");
      out.write("                        <td width = \"150\">อีเมล์</td>  \n");
      out.write("                        <td width = \"150\">สังกัด</td>\n");
      out.write("                        <td width = \"100\">ตำแหน่ง</td>     \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");
while ((rec != null) && (rec.next())) {
      out.write("\n");
      out.write("                \n");
      out.write("                    <tr align=\"center\">    \n");
      out.write("\n");
      out.write("                        <td>");
      out.print(rec.getString("fname"));
      out.write("</td> \n");
      out.write("                        <td>");
      out.print(rec.getString("contact"));
      out.write("</td> \n");
      out.write("                        <td>");
      out.print(rec.getString("fa"));
      out.write("</td> \n");
      out.write("                        <td>");
      out.print(rec.getString("position"));
      out.write("</td> \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                </table></div>\n");
      out.write("                     \n");
      out.write("\n");
      out.write("            ");

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
      out.write("             ");

                Connection connectiongit = null;
                Statement g = null;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/teacher", "root", "12345678");

                    g = connection.createStatement();
                    

                    String sqls = "SELECT * FROM profes_git WHERE fname like'%" + username + "%'" + "ORDER BY id_teach";
                    System.out.println(sqls);

                    

                    ResultSet rec1 = g.executeQuery(sqls);
                

            
      out.write("\n");
      out.write("            \n");
      out.write("             <div class=\"content container\">\n");
      out.write("                <table border=\"1\" align=\"center\" width=\"1000px\" class=\"table ta\">  \n");
      out.write("                    <tr bgcolor=\"#33FF33\" align=\"center\" >        \n");
      out.write("\n");
      out.write("                        <td width = \"200\"> ชื่อ-นามสกุล </td> \n");
      out.write("                        <td width = \"150\">อีเมล์</td>  \n");
      out.write("                        <td width = \"150\">สังกัด</td>\n");
      out.write("                        <td width = \"100\">ตำแหน่ง</td>     \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");
while ((rec1 != null) && (rec1.next())) {
      out.write("\n");
      out.write("                \n");
      out.write("                    <tr align=\"center\">    \n");
      out.write("\n");
      out.write("                        <td>");
      out.print(rec1.getString("fname"));
      out.write("</td> \n");
      out.write("                        <td>");
      out.print(rec1.getString("contact"));
      out.write("</td> \n");
      out.write("                        <td>");
      out.print(rec1.getString("fa"));
      out.write("</td> \n");
      out.write("                        <td>");
      out.print(rec1.getString("position"));
      out.write("</td> \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                </table></div>\n");
      out.write("                     \n");
      out.write("\n");
      out.write("            ");

                } catch (Exception e) {
                    out.println(e.getMessage());
                    e.printStackTrace();
                }
                try {
                    if (g != null) {
                        g.close();
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
