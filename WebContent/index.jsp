<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<jsp:include page="WEB-INF/views/header.jsp"></jsp:include>

<body>
<center><img class = "logo" src ="uploads/images/AAA.JPG" width="220px" height="220px"></center>



<ul>
  <li><a href="Home.html">Home</a></li>
  <li><a href="Store.html">Store</a></li>
  <li><a href="FAQ.html">Forum</a></li>
  <li><a href="FAQ.html">FAQ</a></li>
  <li style="float:right"><a class="active" href="Sign in.html">Sign in</a></li>
</ul>

<br>
<br>


<div class="slideshow-container">
	
	<div class="mySlides fade">
	  <img src="uploads/images/ccc.png" style="width:100%">
	</div>
	
	<div class="mySlides fade">
	  <img src="uploads/images/xyz.png" style="width:100%">
	</div>
	
	<br>
	
	<div style="text-align:center">
	  <span class="dot"></span> 
	  <span class="dot"></span> 
	</div>
</div>
<br>

<br>
<script>
	var slideIndex = 0;
	showSlides();
</script>

<jsp:include page="WEB-INF/views/footer.jsp"></jsp:include>
</body>
</html>
