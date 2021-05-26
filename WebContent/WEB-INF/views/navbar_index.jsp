<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div>
	<ul class="menu">
		  <li class="menu">
		  		<a href="index.jsp">Home</a>
		  </li>
		  
		  <li class="menu">
		  		<a href="Store.html">Store</a>
		  </li>
		  
		  <li class="menu">
		 		<a href="FAQ.html">Forum</a>
		  </li>
		  
		  <li class="menu">
		 		<a href="html/registerUser.jsp">FAQ</a>
		  </li >
	
		  <li class = "menu search_bar">
		       
               <a onclick="displaySearch()" href="javascript:void(0);">
                    <img src="uploads/images/search.jpg" alt = "search"/>
                </a>
            </li>
		  
		  <li class="menu" style="float:right">
		 	 	<a class="active" href="html/registerUser.jsp">Sign in</a>
		  </li>
	</ul>

</div>
<jsp:include page="search.jsp"></jsp:include>
