<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<LINK REL="StyleSheet" HREF="assets/css/main.css" TYPE="text/css" MEDIA=screen>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap Core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="simple-sidebar.css" rel="stylesheet">
    <script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>
</head>
<body>
	<form action="MenuPrincipal" method="post">
		<input type="text" name="nombre" value=<%= request.getParameter("nombre")%>></input>
		<input type="submit" value="Guardar" ></input>
	</form>
	
	<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<div class="logo">
							<i class="icon fa-diamond"></i>
						</div>
						<div class="content">
							<div class="inner">
								<h1>Bienvenido a Profesor Cognitivo</h1>
							</div>
						</div>
						<div>
							<h2>Ingresar como</h2>
						</div>
						<nav>
							<ul>
								<li><a href="InicioSesion.html">Administrador</a></li>
								<li><a href="#est">Estudiante</a></li>
							</ul>
						</nav>
					</header>
			</div>
</body>
</html>