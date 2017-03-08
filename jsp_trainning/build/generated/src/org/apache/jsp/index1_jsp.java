package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>index1</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");

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
			
			String sql = "SELECT * FROM  profes_it WHERE " +
			" Username = '" + username + "' AND " + 
			" Password = '" + password + "' ";
			
			ResultSet rec = s.executeQuery(sql);
			
			if(!rec.next())
			{
				out.print("<font color=red>Username and Password Incorrect!</font>");
			} else {
				rec.first();
				session.setAttribute("sUserID",rec.getString("UserID"));	
				response.sendRedirect("profile.jsp");
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
      out.write("\t\n");
      out.write("<form name=\"frmLogin\" method=\"post\" action=\"index1.jsp?Action=Login\">\n");
      out.write("  Login<br>\n");
      out.write("  <table border=\"1\" style=\"width: 300px\">\n");
      out.write("    <tbody>\n");
      out.write("      <tr>\n");
      out.write("        <td> &nbsp;Username</td>\n");
      out.write("        <td>\n");
      out.write("          <input name=\"txtUsername\" type=\"text\" id=\"txtUsername\">\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td> &nbsp;Password</td>\n");
      out.write("        <td><input name=\"txtPassword\" type=\"password\" id=\"txtPassword\">\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("  <br>\n");
      out.write("  <input type=\"submit\" name=\"Submit\" value=\"Login\">\n");
      out.write("</form>\n");
      out.write("\t\n");
      out.write("</body>\n");
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
