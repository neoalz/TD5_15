<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Proyecto</title>
</head>
<body>

	<form:form action="/modificarProyecto" method="post" modelAttribute="proyecto">			
		<h3>AGREGAR PROYECTO</h3>
		<table class="table">
			<thead>
				<th scope="col">CÓDIGO</th>
				<th scope="col">NOMBRE</th>
			</thead>
			<tbody>
					<tr>
						<td>
							<form:input path="codproyecto" type="number" value="${proyecto.codproyecto }"/>
							<form:errors></form:errors>
						</td>
						<td>
							<form:input path="nomproyecto" value="${proyecto.nomproyecto }"/>
							<form:errors></form:errors>
						</td>
					</tr>
			</tbody>
		</table>
		<form:button class="btn btn-info" id="buscarBoton" onclick="location.reload()">Modificar</form:button>
	</form:form>

</body>
</html>