<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html>    
    <head>      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
        <title>Frm Login</title>     
  
    </head>   
    <body>       
        <%@include file="menu.jsp" %> 
        <!--body-->     
        <div class="content"> 
            <center><h1><font color="#00FF00">ลงชื่อเข้าสู่ระบบ</font></h1></center>
            <form action="manage/login_admin.jsp" method="post" autocomplete="off">     
                <div class="group-input container" >                
                    <div style="width: 100%;">                 
                        ชื่อเข้าสู่ระบบ :<br>       
                        <input type="text" name="useradmin" placeholder="ชื่อเข้าสู่ระบบ"><br>  
                        
                        รหัสผ่าน :<br>                   
                        <input type="password" name="passadmin" placeholder="รหัสผ่าน"><br>      
                        <div align="center">                      
                            <button class="btn btn-blue" type="submit">เข้าสู่ระบบ</button>
                            <a href="" <button class="btn btn-green" type="reset"> ยกเลิก </button></a> <br>
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