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
<title>Asignar Proyecto</title>
</head>
<body>

	<form:form action="/agregarAsignacion" method="post" modelAttribute="asignacion">			
		<h3>ASIGNAR PROYECTO</h3>
		<table class="table">
			<thead>
				<th scope="col">CÓDIGO ASIGNACION</th>
				<th scope="col">FECHA INICIO</th>
				<th scope="col">FECHA TERMINO</th>
				<th scope="col">HORAS</th>
				<th scope="col">ASIGNAR EMPLEADO</th>
				<th scope="col">ASIGNAR PROYECTO</th>
				
			</thead>
			<tbody>
					<tr>
						<td>
							<form:input path="idasignacion" type="number"/>
							<form:errors></form:errors>
						</td>
						<td>
							<form:input path="fecinicio" type="date"  
							value="2021-08-14"
       						min="2021-01-01" 
       						max="2022-12-31" />
							<form:errors></form:errors>
						</td>
						<td>
							<form:input path="fectermino" type="date"  
							value="2021-08-15"
       						min="2021-01-01" 
       						max="2022-12-31" />
							<form:errors></form:errors>
						</td>
						<td>
							<form:input path="horas" type="number"/>
							<form:errors></form:errors>
						</td>
						<td>
							<form:select								
								path="empleado"
								items="${ empleados }"
								itemLabel="rut"
								itemValue="rut"
							/>	
						</td>
						<td>
							<form:select								
								path="proyecto"
								items="${ proyectos }"
								itemLabel="nomproyecto"
								itemValue="codproyecto"
							/>	
						</td>
						
					</tr>
			</tbody>
		</table>
		<form:button class="btn btn-info" id="buscarBoton" onclick="location.reload()">Asignar Proyecto</form:button>
	</form:form>
	<a class="btn btn-primary" href="/" role="button">Volver a Asignaciones</a>

</body>
</html>