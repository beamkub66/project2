<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html>    
    <head>      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
        <title>Frm Login</title>     
  
    </head>   
    <body>       
        <%@include file="menu.jsp" %> 
        	<%
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
			
			String sql = "SELECT * FROM  profes_tm WHERE " +
			" Username = '" + username + "' AND " + 
			" Password = '" + password + "' ";
			
			ResultSet rs = s.executeQuery(sql);
			
			if(!rs.next())
			{
				out.print("<font color=red>Username and Password Incorrect!</font>");
			} else {
				rs.first();
				session.setAttribute("sid_teach",rs.getString("id_teach"));	
				response.sendRedirect("Profiletm.jsp");
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
		
	%>
        
        <!--body-->     
        <div class="content"> 
            <center><h1><font color="#00FF00">ลงชื่อเข้าสู่ระบบ</font></h1></center>
            <form name="frmLogin" method="post" action="frm_login_tm.jsp?Action=Login">
            <form action="manage/login.jsp" method="post" autocomplete="off">     
                <div class="group-input container" >                
                    <div style="width: 100%;">                 
                        ชื่อเข้าสู่ระบบ :<br>       
                        <input name="txtUsername" type="text" id="txtUsername"><br>  
                        
                        รหัสผ่าน :<br>                   
                        <td><input name="txtPassword" type="password" id="txtPassword"><br>      
                        <div align="center">                      
                            <button class="btn btn-blue" type="submit">เข้าสู่ระบบ</button>
                            <button class="btn btn-green" type="reset"> ยกเลิก </button> 
                            <a href="frm_login_admin.jsp" class="btn btn-red">admin</a><br>
                            <a href="frm_login.jsp" class="btn btn-red">IT</a>
                            <a href="frm_login_git.jsp" class="btn btn-red">GIT</a>
                            <a href="frm_login_ctc.jsp" class="btn btn-red">CTC</a>
                            <a href="frm_login_mta.jsp" class="btn btn-red">MTA</a>
                            <a href="frm_login_tm.jsp" class="btn btn-red">TM</a>
                        </div>             
                    </div>            
                </div>       
            </form>   
        </div>   
    </body>    
    <!--footer-->  
    <%@include file="footer.jsp" %>
</html>