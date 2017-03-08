
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css"> 
        <link rel="stylesheet" type="text/css" href="css/header.css"> 
        <link rel="stylesheet" type="text/css" href="css/footer.css"> 
        <!--header--> 
        <title>แก้ไข้อมูล</title>   

        <!--header--> 
    </head>

    <body>
        <%@include file="menu_admin.jsp" %>
        <div class="content"> 
            <h1 align="center"><font color="#0000FF"></font></h1> 
            <form action="manage/insert.jsp" method="post" autocomplete="off">
                <div class="group-input container" >                 
                    <div style="width: 90%;">
                        ชื่อ - นามสกุล :<br>
                        <input type="text" name="fname" placeholder="ชื่อ"><br>
                        รหัสอาจารย์ :<br>
                        <input type="text" name="username" placeholder="ชื่อเข้าสู่ระบบ"><br>
                        รหัสผ่าน :<br>
                        <input type="text" name="password" placeholder="รหัสผ่าน"><br>            
                        ตำแหน่ง :<br>
                        <input type="text" name="position" placeholder="ตำแหน่ง"><br>  
                        ติดต่อ :<br>
                        <input type="text" name="contact" placeholder="ติดต่อ"><br> 
                        </textarea><br>
                        <div align="center"> 

                            <button class="btn btn-blue" type="submit">บันทึก</button>                  
                            <button class="btn btn-red" type="reset">ยกเลิก</button>                
                        </div>
                    </div>         
                </div>     
            </form> </div> 
    </body>
    <%@include file="footer.jsp" %> 
</html>