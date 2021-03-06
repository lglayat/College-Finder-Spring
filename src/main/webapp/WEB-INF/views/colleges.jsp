<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
	 <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.13/semantic.min.css"/>
	
</head>
<body style="display:flex;min-height:100vh;flex-direction: column;" data-no-turbolink="true">

	<div style="flex: 1;">
		<div class="ui header">
			<div class="ui blue menu">
				<div class="item">
					<a href="/src/"><h1>College Finder</h1></a>
				</div>
			</div>
		</div>
		<!-- Close Header -->

		<!-- Open Nav Bar -->
		<div class="ui secondary menu">
			<div class="container" style="margin-left: auto; margin-right: auto;">
				<div class="item">
					<a href="/src/"><h3>Home</h3></a>
				</div>
				<div class="item">
					<a href="/src/colleges"><h3>Colleges</h3></a>
				</div>
				<div class="item">
					<a href="/src/programs"><h3>Programs</h3></a>
				</div>
				<div class="item">
					<a href="/src/search"><h3>Advanced Search</h3></a>
				</div>

			</div>
		</div>
	</div>
	<!-- End header  -->
  
   
	
	<div class="ui container">
	<h4>Colleges</h4>
 	<ul>
        	<c:forEach begin="0" end="${fn:length(colleges) - 1 }" var="index">
        		<li><c:out value="${colleges[index]}" /></li>
        	</c:forEach>
	</ul>
	</div>
  
  
</body>
</html>


