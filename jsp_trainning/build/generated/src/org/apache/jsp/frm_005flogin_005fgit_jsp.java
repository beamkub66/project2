package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class frm_005flogin_005fgit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html>    \n");
      out.write("    <head>      \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">   \n");
      out.write("        <title>Frm Login</title>     \n");
      out.write("  \n");
      out.write("    </head>   \n");
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
      out.write("            <img src=\"img/Header2.png\" style=\"width: 100%\" >\n");
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
      out.write("        \t");

	if(request.getParameter("Action") != null)	
	{

		Connection connect = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connect =  DriverManager.getConnection("jdbc:mysql://localhost/teacher","root","12345678");
			
			String username = request.getParameter("txtUsername");
			String password = request.getParameter("txtPassword");
			
			s = connect.createStatement();
			
			String sql = "SELECT * FROM  profes_git WHERE " +
			" Username = '" + username + "' AND " + 
			" Password = '" + password + "' ";
			
			ResultSet rs = s.executeQuery(sql);
			
			if(!rs.next())
			{
				out.print("<font color=red>Username and Password Incorrect!</font>");
			} else {
				rs.first();
				session.setAttribute("sid_teach",rs.getString("id_teach"));	
				response.sendRedirect("Profile.jsp");
			}
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.println(e.getMessage());
				e.printStackTrace();
			}
		
			try {
				if(s!=null){
					s.close();
					connect.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				out.println(e.getMessage());
				e.printStackTrace();
			}
		
	}
		
	
      out.write("\n");
      out.write("        \n");
      out.write("        <!--body-->     \n");
      out.write("        <div class=\"content\"> \n");
      out.write("            <center><h1><font color=\"#00FF00\">ลงชื่อเข้าสู่ระบบ</font></h1></center>\n");
      out.write("            <form name=\"frmLogin\" method=\"post\" action=\"frm_login_git.jsp?Action=Login\">\n");
      out.write("            <form action=\"manage/login.jsp\" method=\"post\" autocomplete=\"off\">     \n");
      out.write("                <div class=\"group-input container\" >                \n");
      out.write("                    <div style=\"width: 100%;\">                 \n");
      out.write("                        ชื่อเข้าสู่ระบบ :<br>       \n");
      out.write("                        <input name=\"txtUsername\" type=\"text\" id=\"txtUsername\"><br>  \n");
      out.write("                        \n");
      out.write("                        รหัสผ่าน :<br>                   \n");
      out.write("                        <td><input name=\"txtPassword\" type=\"password\" id=\"txtPassword\"><br>      \n");
      out.write("                        <div align=\"center\">                      \n");
      out.write("                            <button class=\"btn btn-blue\" type=\"submit\">เข้าสู่ระบบ</button>\n");
      out.write("                            <button class=\"btn btn-green\" type=\"reset\"> ยกเลิก </button> \n");
      out.write("                            <a href=\"frm_login_admin.jsp\" class=\"btn btn-red\">admin</a><br>\n");
      out.write("                            <a href=\"frm_login.jsp\" class=\"btn btn-red\">IT</a>\n");
      out.write("                            <a href=\"frm_login.jsp\" class=\"btn btn-red\">GIT</a>\n");
      out.write("                            <a href=\"frm_login.jsp\" class=\"btn btn-red\">CTC</a>\n");
      out.write("                            <a href=\"frm_login.jsp\" class=\"btn btn-red\">MTA</a>\n");
      out.write("                            <a href=\"frm_login.jsp\" class=\"btn btn-red\">TM</a>\n");
      out.write("                        </div>             \n");
      out.write("                    </div>            \n");
      out.write("                </div>       \n");
      out.write("            </form>   \n");
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
      out.write("            <span> ระบบฐานข้อมูลอาจารย์ คณะเทคโนโลยีสารสนเทศ  </span>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
