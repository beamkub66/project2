package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class show_005fIT2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/manage/connectIT.jsp");
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
      out.write("        \n");
      out.write("        <title>วีระพน ภานุรักษ์</title> \n");
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
      out.write("        <div> \n");
      out.write("            <img src=\"img/header.png\" style=\"width: 100%\">\n");
      out.write("            <!--Menu-->\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"IT.jsp\">ย้อนกลับ</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content container\">    \n");
      out.write("            <h1 align=\"center\"><font color=\"#0000FF \"></font></h1>   \n");
      out.write("            <table align=\"center\" width=\"1000px\"> \n");
      out.write("                <h1><center>ข้อมูลส่วนตัว</center></h1>\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                ");
                    String sql = "select * from profes_it where id_teach";
                    Statement stmt = con.createStatement();
                    ResultSet rs = con.createStatement().executeQuery(sql);
                    if (rs.next()) {
                
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr align=\"left\" bgcolor=\"#FFCCCC\">        \n");
      out.write("\n");
      out.write("                    <td width = \"200\">ชื่อ-นามสกุล:</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"left\" bgcolor=\"#FFFF99\"><td width=\"200\" height=\"70\" >- ");
      out.print(rs.getString("fname"));
      out.write("</td></tr>      \n");
      out.write("                <tr align=\"left\" bgcolor=\"#FFCCCC\">        \n");
      out.write("\n");
      out.write("                    <td width = \"200\">ประวัติการศึกษา:</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"left\" bgcolor=\"#FFFF99\"><td width=\"200\" height=\"100\">- ");
      out.print(rs.getString("education"));
      out.write("</td></tr>\n");
      out.write("                <tr align=\"left\" bgcolor=\"#FFCCCC\">        \n");
      out.write("\n");
      out.write("                    <td width = \"200\">ประวัติการทำงาน:</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"left\" bgcolor=\"#FFFF99\"><td width=\"200\" height=\"70\" >- ");
      out.print(rs.getString("career_h"));
      out.write("</td></tr> \n");
      out.write("                <tr align=\"left\" bgcolor=\"#FFCCCC\">        \n");
      out.write("\n");
      out.write("                    <td width = \"200\">ผลงานวิจัย:</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"left\" bgcolor=\"#FFFF99\"><td width=\"200\" height=\"70\" >- ");
      out.print(rs.getString("portfolio"));
      out.write("</td></tr>\n");
      out.write("                <tr align=\"left\" bgcolor=\"#FFCCCC\">      \n");
      out.write("\n");
      out.write("                    <td width = \"200\">ติดต่อ:</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"left\" bgcolor=\"#FFFF99\"><td width=\"200\" height=\"70\" >- ");
      out.print(rs.getString("contact"));
      out.write("</td></tr>  \n");
      out.write("\n");
      out.write("\n");
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
