<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
	 <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.13/semantic.min.css"/>
	<link rel="stylesheet" type="text/css" href="../resources/style.css">
</head>
<body style="display:flex;min-height:100vh;flex-direction: column;" data-no-turbolink="true">

<div style="flex:1;">
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



<p>${friend} </p>


 <div class="index-body">
	<div class="homepageHero">
		<div id="heroOverlay"></div>
			<h1 style="opacity:1 !important;">Welcome to College Finder!</h1>
	</div>
	<p> With this tool, you can research any college in the US!</p>

	<ul>
		<li>Sign Up to see your profile, save your college searches, and view your recommended colleges</li>
		<li>Curate &amp; customize your criteria with Advanced Search</li>
		<li> View different fields of studies through "Programs"</li>
	</ul>
</div>

</body>
</html>
