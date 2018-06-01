<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>File Uploader</title>
<!-- <link href="css/bootstrap.css" rel='stylesheet' type='text/css' /> -->
 <!-- Custom Theme files -->
<link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="File Uploader Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

</head>
<body>

<h1>FILE UPLOADER</h1>

<div class="upload">

		<div class="login-form">

			<form id="upload" method="post" action="upload" enctype="multipart/form-data">

				<div id="drop">
					<a>Upload File</a>
					<input type="file" name="upl" multiple />
				</div>

				<ul>
				<!-- The file uploads will be shown here -->
				</ul>

			</form>

		</div>
			
	<!-- JavaScript Includes -->
		<script src="js/jquery.knob.js"></script>
	<!-- JavaScript Includes -->

	<!-- jQuery File Upload Dependencies -->
		<script src="js/jquery.ui.widget.js"></script>
		<script src="js/jquery.iframe-transport.js"></script>
		<script src="js/jquery.fileupload.js"></script>
	<!-- jQuery File Upload Dependencies -->
		
	<!-- Main JavaScript file -->
		<script src="js/script.js"></script>
	<!-- Main JavaScript file -->

	<div class="button">

	<div class="cancel"><a href="success.jsp">Cancel</a></div>
	<div class="done"><a href="#">Done</a></div>
	<div class="clear"> </div>

	</div>
	
</div>

<div class="footer">
     <p>Copyright &copy; 2015 File Uploader Widget. All Rights Reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
</div>
	
</body>
</html>