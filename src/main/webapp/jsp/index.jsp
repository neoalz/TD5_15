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
			<th scope="col">orderDate</th>
			<th scope="col">requiredDate</th>
			<th scope="col">shippedDate</th>
			<th scope="col">status</th>
			<th scope="col">comments</th>
			<th scope="col">Seleccionar orden</th>
			
			
		</thead>
		<tbody>
			<c:forEach items="${lista}" var="c">
			
				<tr>
					<td>
						<c:out value="${c.idasignacion }"></c:out>
					</td>
		
					
					
				</tr>
			
			</c:forEach>
		</tbody>
	</table>

</body>
</html>