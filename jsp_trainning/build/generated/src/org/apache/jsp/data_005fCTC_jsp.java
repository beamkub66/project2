package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class data_005fCTC_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div> \n");
      out.write("        <img src=\"img/header.png\" style=\"width: 100%\">\n");
      out.write("        <!--Menu-->\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"IT.jsp\">ย้อนกลับ</a></li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>  \n");
      out.write("\n");
        String sql = "select * from profes_ctc where id_teach=" + request.getParameter("id_teach");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    if (rs.next()) {

      out.write(" \n");
      out.write("\n");
      out.write("<body>    \n");
      out.write("\n");
      out.write("    <div class=\"content\"  >\n");
      out.write("\n");
      out.write("        <table border=\"1\" align=\"center\" width=\"800px\" height=\"500px\"  action=\"manage/update.jsp\" method=\"post\" autocomplete=\"off\">        \n");
      out.write("            <tr>   \n");
      out.write("                <td  align=\"center\"> รหัส : \n");
      out.write("                    ");
      out.print(rs.getString("id_teach"));
      out.write("<br>  </td></tr>  \n");
      out.write("            <tr><td  align=\"center\">ชื่อ-นามสกุล :        \n");
      out.write("                    ");
      out.print(rs.getString("fname"));
      out.write("<br></td></tr>\n");
      out.write("            <tr> <td  align=\"center\">ตำแหน่ง :            \n");
      out.write("                    ");
      out.print(rs.getString("position"));
      out.write("<br></td></tr> \n");
      out.write("            <tr><td  align=\"left\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ประวัติการศึกษา :        \n");
      out.write("                    ");
      out.print(rs.getString("education"));
      out.write("<br></td></tr> \n");
      out.write("            <tr> <td  align=\"left\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ประวัติการทำงาน :        \n");
      out.write("                    ");
      out.print(rs.getString("career_h"));
      out.write("<br></td></tr> \n");
      out.write("            <tr> <td  align=\"center\">ติดต่อ :           \n");
      out.write("                    ");
      out.print(rs.getString("contact"));
      out.write("<br> </td></tr> \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>  \n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>  \n");
      out.write("    </div> \n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("\n");
      out.write("</body>  \n");
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
