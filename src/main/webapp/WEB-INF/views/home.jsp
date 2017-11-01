<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
	 <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.13/semantic.min.css"/>
	<link rel="stylesheet" type="text/css" href="/Users/mac/Documents/workspace-sts-3.9.0.RELEASE/HelloWorld/src/main/webapp/resources/style.css">
	<style type="text/css">
      div.index-body{
        max-width: 1000px;
        margin:0 auto;
      }
      div.secondary h3 {
        font-weight:normal;
        font-color:#000;
        text-transform: uppercase;
        letter-spacing:2px;
        font-size:12px;
      }
      div.index-body p {
        color: #464646;
        text-align: center;
        font-size:1.3em;
        margin-top:1em;
        line-height: 1.2em;
        font-weight:bold;
      }
      div.index-body ul{
        padding:0;
        margin:0;
      }
      div.index-body li{
        list-style: none;
        float:left;
        width:300px;
        height:100px;
        border-style: solid;
        border-color: #ccc;
        border-width: 1px;
        padding:10px;
        margin:10px;
        vertical-align: middle;
        text-align: center;
        font-size:16px;
        color:#464646;
      }

      div.homepageHero{
        width:100%;
        height:400px;
        background-image: url('https://static.pexels.com/photos/207691/pexels-photo-207691.jpeg');
        background-position: center;
        background-size: cover;
      }
      #heroOverlay{
        width:100%;
        height:400px;
        background-color:black;
        opacity: .3;
      }
      div.homepageHero h1{
          text-align: center;
          position: relative;
          top:-65%;
          font-size:3em;
          color:white;
      }

    </style>
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
