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
            <form class = "form" id = "form" action = "addplayer"  method= "POST" >
                
                <label for="fname">First name:</label><br>
                <input type="text" id="fname" name="fname" placeholder = "Enter your first name" required >
                <br><br>
        
                <label for="lname">Last name:</label><br>
                <input type="text" id="lname" name="lname" placeholder = "Enter your last name"><br><br>
        
                <label >Gender:</label><br>
                <input class = "check_boxes" type="radio" id="male" name="gender" value="male">Male            
                <input class = "check_boxes" type="radio" id="female" name="gender" value="female">Female <br><br>
        
                  
                <label >Date of birth:</label><br>
                <input type = "date" id= "date" name= "date"><br><br>

                     
                <label for="email">Email:</label><br>
                <input type="email" id="email" name="email" pattern="[a-zA-Z0-9._]+@[a-z0-9.-]+\.[a-z]{2,3}" placeholder = "Enter your email address" required><br><br>
        
                <label for="address">Address</label><br>
                <textarea id="address_user" name="address_user" rows="4" style = "width: 98%;"></textarea><br><br>
        
                <input class = "check_boxes" type="checkbox" id="policy_u" onclick="enableButton1();" > Accept privacy <a href="#">policy and terms </a><br><br>
                
                <button class = "submit_btn" type = "submit" id = "submit_btn_u" name ="submit_btn" disabled>Continue to Payment</button>
            </form>
        </div>

	</div>

</body>
</html>