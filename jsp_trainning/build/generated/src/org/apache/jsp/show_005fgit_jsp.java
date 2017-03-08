package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class show_005fgit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
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
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/professor","root","12345678"); 

      out.write(" \n");
      out.write("\n");
 
  //  out.print("Connect Sucessfully"); 

      out.write(' ');
      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html>  \n");
      out.write("    <head>   \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">    \n");
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
      out.write("                <li><a href=\"frm_regist.jsp\">เพิ่มข้อมูลอาจารย์</a></li>\n");
      out.write("                <li><a href=\"search_ad.jsp\">ค้นหาข้อมูล</a></li>\n");
      out.write("                <li><a href=\"show_data.jsp\">IT</a></li>\n");
      out.write("                <li><a href=\"show_git.jsp\">GIT</a></li>\n");
      out.write("                <li><a href=\"show_mta.jsp\">MTA</a></li>\n");
      out.write("                <li><a href=\"show_ctc.jsp\">CTC</a></li>\n");
      out.write("                <li><a href=\"show_tm.jsp\">TM</a></li>\n");
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
      out.write("\n");
      out.write("         <title>Show Data</title> \n");
      out.write("        <style>   \n");
      out.write("            body{    \n");
      out.write("                background-color:#eee;     \n");
      out.write("            }       \n");
      out.write("            /*table--------------------*/     \n");
      out.write("            table {     \n");
      out.write("                border-collapse: collapse;        \n");
      out.write("            }          \n");
      out.write("            table, td, th {       \n");
      out.write("                border: 1px solid black;   \n");
      out.write("            }      \n");
      out.write("        </style> \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body> \n");
      out.write("        <div class=\"content container\">    \n");
      out.write("            <h1 align=\"center\"><font color=\"#0000FF \">คณาจารย์ สาขาเทคโนโลยีสารสนเทศภูมิศาสตร์</font></h1>    \n");
      out.write("            <table border=\"1\" align=\"center\" width=\"1230px\" class=\"table ta\">   \n");
      out.write("                <tr bgcolor=\"#33FF33\" align=\"center\">        \n");
      out.write("                    <td width=\"50\"> ลำดับ </td>            \n");
      out.write("                    <td width = \"160\"> ชื่อ-นามสกุล</td>\n");
      out.write("                    <td width = \"30\">รหัสอาจารย์</td>\n");
      out.write("                    <td width = \"30\">รหัสผ่าน</td>\n");
      out.write("                    <td width = \"30\">ตำแหน่ง</td>\n");
      out.write("                    <td width = \"30\">ติดต่อ</td>\n");
      out.write("                    <td width = \"50\">จัดการ</td>     \n");
      out.write("                </tr>     \n");
      out.write("\n");
      out.write("                ");
                    String sql = "select * from profes_git";
                    Statement stmt = con.createStatement();
                    ResultSet rs = con.createStatement().executeQuery(sql);
                    while (rs.next()) {
                
      out.write("  \n");
      out.write("\n");
      out.write("                <tr align=\"left\">     \n");
      out.write("                    <td align=\"center\">");
      out.print(rs.getString("id_teach"));
      out.write(" </td> \n");
      out.write("                    <td align=\"center\">");
      out.print(rs.getString("fname"));
      out.write("</td>\n");
      out.write("                    <td align=\"center\">");
      out.print(rs.getString("username"));
      out.write("</td>  \n");
      out.write("                    <td align=\"center\">");
      out.print(rs.getString("password"));
      out.write("</td>  \n");
      out.write("                    <td align=\"center\">");
      out.print(rs.getString("position"));
      out.write("</td>\n");
      out.write("                    <td align=\"center\">");
      out.print(rs.getString("contact"));
      out.write("</td>\n");
      out.write("                    <td align=\"center\">\n");
      out.write("                        <a class=\"btn btn-blue\" onclick=\"return \n");
      out.write("                            confirm('คุณต้องการแก้ไขข้อมูลนี้ใช่ไหม') \n");
      out.write("                           \" href=\"edit_regist.jsp?id_teach=");
      out.print(rs.getString("id_teach"));
      out.write("\">แก้ไข</a>\n");
      out.write("                         <a class=\"btn btn-red\" onclick=\"return confirm('คุณต้องการลบใช่ไหม')\" \n");
      out.write("                           href=\"manage/delete.jsp?=id_teach=");
      out.print(rs.getString("id_teach"));
      out.write("\">ลบ</a>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tr>      \n");
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("           \n");
      out.write("            </table>           \n");
      out.write("        </div>   \n");
      out.write("    </body>   \n");
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
      out.write(" \n");
      out.write("</html>    ");
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
