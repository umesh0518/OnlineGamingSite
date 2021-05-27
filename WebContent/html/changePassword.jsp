<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="../WEB-INF/views/header.jsp"></jsp:include>
</head>
<body >
   
	<div class = "container margin_top margin_bottom">
        <jsp:include page="../WEB-INF/views/navbar.jsp"></jsp:include>
   
		   

        <div class = "login_form">
            <form class = "form" id = "form" action = "UpdateInfo"  method= "POST" >
                
               
        
                <label for="password">Password</label><br>
                <input type ="password" id="user_password" name="user_password" placeholder = "<% %>" required></input><br><br>
        
               
                
                <button class = "submit_btn" type = "submit" id = "submit_btn_u" name ="submit_btn" >Confirm</button>
            </form>
        </div>

	</div>

</body>
</html>