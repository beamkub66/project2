package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frm_005fregist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
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
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/header.css\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/footer.css\"> \n");
      out.write("        <!--header--> \n");
      out.write("        <title>แก้ไข้อมูล</title>   \n");
      out.write("\n");
      out.write("        <!--header--> \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
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
      out.write("            <img src=\"img/Header2.png\" style=\"width: 100%\">\n");
      out.write("            <!--Menu-->\n");
      out.write("            <ul>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("               \n");
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
      out.write("\n");
      out.write("        <div class=\"content\"> \n");
      out.write("            <h1 align=\"center\"><font color=\"#0000FF\"></font></h1> \n");
      out.write("            <form action=\"manage/insert.jsp\" method=\"post\" autocomplete=\"off\">\n");
      out.write("                <div class=\"group-input container\" >                 \n");
      out.write("                    <div style=\"width: 90%;\">\n");
      out.write("                        ชื่อ - นามสกุล :<br>\n");
      out.write("                        <input type=\"text\" name=\"fname\" placeholder=\"ชื่อ\"><br>\n");
      out.write("                        รหัสอาจารย์ :<br>\n");
      out.write("                        <input type=\"text\" name=\"username\" placeholder=\"ชื่อเข้าสู่ระบบ\"><br>\n");
      out.write("                        รหัสผ่าน :<br>\n");
      out.write("                        <input type=\"text\" name=\"password\" placeholder=\"รหัสผ่าน\"><br>            \n");
      out.write("                        ตำแหน่ง :<br>\n");
      out.write("                        <input type=\"text\" name=\"position\" placeholder=\"ตำแหน่ง\"><br>  \n");
      out.write("                        ติดต่อ :<br>\n");
      out.write("                        <input type=\"text\" name=\"contact\" placeholder=\"ติดต่อ\"><br> \n");
      out.write("                        </textarea><br>\n");
      out.write("                        <div align=\"center\"> \n");
      out.write("\n");
      out.write("                            <button class=\"btn btn-blue\" type=\"submit\">บันทึก</button>                  \n");
      out.write("                            <button class=\"btn btn-red\" type=\"reset\">ยกเลิก</button>                \n");
      out.write("                        </div>\n");
      out.write("                    </div>         \n");
      out.write("                </div>     \n");
      out.write("            </form> </div> \n");
      out.write("    </body>\n");
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
      out.write(" \n");
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
