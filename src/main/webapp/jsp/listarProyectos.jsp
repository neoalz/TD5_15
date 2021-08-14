<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrador de Asignaciones</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
	crossorigin="anonymous">
</head>
<body>

<h3>PROYECTOS</h3>
	<table class="table">
		<thead>
			<th scope="col">CÓDIGO</th>
			<th scope="col">NOMBRE</th>
			<th scope="col">ASIGNACIONES</th>
		</thead>
		<tbody>
			<c:forEach items="${lista}" var="c">
				<tr>
					<td>
						<c:out value="${c.codproyecto }"></c:out>
					</td>
					<td>
						<c:out value="${c.nomproyecto }"></c:out>
					</td>
					<td>
						<c:out value="${c.asignacions.empleado.nombres} ${c.asignacions.empleado.apellidos}"></c:out>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>