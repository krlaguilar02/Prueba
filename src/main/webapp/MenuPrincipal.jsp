<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		VENTANA NUEVA
	</h1>
	<form action="VentanaPrincipal" method="post">
		<input type="text" name="nombre" value=<%= request.getParameter("nombre")%>></input>
		<input type="submit" value="Guardar2"></input>
	</form>
</body>
</html>