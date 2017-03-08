package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <hAead>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("                <li><a href=\"frm_login.jsp\">เข้าสู่ระบบAdmin</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <title>Index</title>\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("        <div class=\"content\">\n");
      out.write("            <center>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> \n");
      out.write("                            <a href=\"IT.jsp\"><img src=\"img/IT.jpg\" width=350\" height=\"150\"></a>\n");
      out.write("                            <a href=\"GIT.jsp\"><img src=\"img/GIT.JPG\" width=350\" height=\"150\"></a>\n");
      out.write("                            <a href=\"MTA.jsp\"><img src=\"img/MTA.JPG\" width=350\" height=\"150\"><br></a>\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <table class=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"CTC.jsp\"><img src=\"img/CTC.JPG\" width=350\" height=\"150\"></a>\n");
      out.write("                            <a href=\"TM.jsp\"><img src=\"img/TM.jpg\" width=350\" height=\"150\"></a>\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                   \n");
      out.write("                   </tr>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("     ");
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
