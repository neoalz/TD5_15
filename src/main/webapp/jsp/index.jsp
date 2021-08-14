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

<h3>LISTADO DE ASIGNACIONES</h3>
	<table class="table">
		<thead>
			<th scope="col">ID ASIGNACION</th>
			<th scope="col">FECHA INICIO</th>
			<th scope="col">FECHA TERMINO</th>
			<th scope="col">HORAS</th>
			<th scope="col">RUT EMPLEADO</th>
			<th scope="col">CÓDIGO PROYECTO</th>
			<th scope="col">PROYECTO</th>
			<th scope="col">EMPRESA</th>
			<th scope="col">SELECCIONAR ASIGNACIÓN</th>
		</thead>
		<tbody>
			<c:forEach items="${lista}" var="c">
				<tr>
					<td>
						<c:out value="${c.idasignacion }"></c:out>
					</td>
					<td>
						<c:out value="${c.fecinicio }"></c:out>
					</td>
					<td>
						<c:out value="${c.fectermino }"></c:out>
					</td>
					<td>
						<c:out value="${c.horas }"></c:out>
					</td>
					<td>
						<c:out value="${c.empleado.rut }-${c.empleado.dv }"></c:out>
					</td>
					<td>
						<c:out value="${c.proyecto.codproyecto }"></c:out>
					</td>
					<td>
						<c:out value="${c.proyecto.nomproyecto }"></c:out>
					</td>
					<td>
						<c:out value="${c.empleado.empresa.razonsocial}"></c:out>
					</td>
					<td>
						<form:form action="/editarAsignacion" method="post" modelAttribute="asignacion">
							<form:input path="idasignacion" type="hidden" value="${c.idasignacion}"/>
							<form:button class="btn btn-info">EDITAR</form:button>
						
						</form:form>
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<h3>Acciones</h3>
	<div>
		<!--  Ver proyectos -->
		<form:form action="/proyectos" method="get" modelAttribute="proyecto">			
				<form:button class="btn btn-info" id="buscarBoton">Ver Proyectos</form:button>
		</form:form>
		<a class="btn btn-primary" href="paginaAsignarProyecto" role="button">Asignar Proyecto</a>
	</div>

</body>
</html>