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
                
                <label for="fname">First name:</label><br>
                <input type="text" id="fname" name="fname" placeholder = "<% %>" required >
                <br><br>
        
                <label for="lname">Last name:</label><br>
                <input type="text" id="lname" name="lname" placeholder = "<% %>"><br><br>
        
                <label >Date of birth:</label><br>
                <input type = "date" id= "date" name= "dob"><br><br>

                     
                <label for="email">Email:</label><br>
                <input type="email" id="email" name="email" pattern="[a-zA-Z0-9._]+@[a-z0-9.-]+\.[a-z]{2,3}" placeholder = "<% %>" required><br><br>
        
                <button class = "submit_btn" type = "submit" id = "submit_btn_u" name ="submit_btn" >Update</button>
            </form>
        </div>

	</div>

</body>
</html>