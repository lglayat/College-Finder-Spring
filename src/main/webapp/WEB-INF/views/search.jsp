<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.13/semantic.min.css"/>
	<link rel="stylesheet" type="text/css" href="../resources/style.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body style="display:flex;min-height:100vh;flex-direction: column;" data-no-turbolink="true">

<div style="flex:1;">
      <div class="ui header">
        <div class="ui blue menu">
          <div class="item">
            <a href="/"><h1>College Finder</h1></a>
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
          <a href="/colleges"><h3>Colleges</h3></a>
        </div>
        <div class="item">
         <a href="/programs"><h3>Programs</h3></a>
        </div>
        <div class="item">
         <a href="/src/search"><h3>Advanced Search</h3></a>
        </div>

      
      </div>
    </div>
  </div>
<!-- End header  -->

<div class="ui form">
		<div class="six wide field">
		  	<ul>
		  		<div class="field">
					<p>State
					</p>
					<input id="state" type="text"/>
					
				</div>
		   </ul>
			<ul>
		  	    <div class="field">
				    <p>SAT Score
				    </p>
					<input id="SAT" type="text"/>
				    
		    	</div>
		  	</ul>
			<ul>
				<div class="field">
				  <p>ACT Score 
				  	<input id="ACT" type="text"/>
				  </p>
			  	</div>
			</ul>
			<ul>
				<div class="field">
					<p>Field of Study 
			   		</p>
					<select id="major">
						<option>English Language and Literature</option>
						<option>Education</option>
						<option>Architecture</option>
						<option>Agriculture</option>
						<option>Communications and Journalism</option>
						<option>Computer and Information Sciences</option>
						<option>Culinary Services</option>
						<option>Engineering</option>
						<option>Culinary Services </option>
						<option>Engineering </option>
						<option>Legal Professions and Studies </option>
						<option>Liberal Arts and Sciences </option>
						<option>Biological and Biomedical Sciences </option>
						<option>Mathematics and Statistics </option>
						<option>Philosophy and Religious Studies </option>
						<option>Psychology </option>
						<option>Social Sciences </option>
						<option>Visual and Performing Arts </option>
						<option>Business </option>
						<option>History</option>
					</select>
					
				</div>
				
				<ul>
		  	    <div class="field">
					<button onclick="makeSearch()")> </button>  				    
		    		</div>
		  	</ul>
		  	
		  	
		  	<form action="/src/searchResults" method="POST">
        <label>Nome <span class="color-red">*</span></label>
        <input type="text" class="form-control margin-bottom-20" name="nome" required></input>      

        <label>Email <span class="color-red">*</span></label>
        <input type="email" class="form-control margin-bottom-20" name="email" required></input>

        <label>Password <span class="color-red">*</span></label>
        <input type="password" class="form-control margin-bottom-20" name="password" required></input>                          

        <label>Conferma Password <span class="color-red">*</span></label>
        <input type="password" class="form-control margin-bottom-20" name="password1" required></input>
        <button type="submit" class="btn btn-primary">REGISTRATI</button>
    </form>
		  	
			</ul>
	  	</div>
	</div>

 


 
 
</body>
</html>