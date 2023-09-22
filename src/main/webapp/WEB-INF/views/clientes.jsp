<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Clientes</title>
</head>
<body>

<h2>Lista de Clientes</h2>
<table border="1">
    <thead>
    <tr>
        <th>Tipo Documento</th>
        <th>Documento</th>
        <th>Primer Nombre</th>
        <th>Segundo Nombre</th>
        <th>Primer Apellido</th>
        <th>Segundo Apellido</th>
        <th>Celular</th>
        <th>Dirección</th>
        <th>Correo</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${clientes}" var="cliente">
        <tr>
            <td>${cliente.tipoDocumento}</td>
            <td>${cliente.documento}</td>
            <td>${cliente.primerNombre}</td>
            <td>${cliente.segundoNombre}</td>
            <td>${cliente.primerApellido}</td>
            <td>${cliente.segundoApellido}</td>
            <td>${cliente.celular}</td>
            <td>${cliente.direccion}</td>
            <td>${cliente.correo}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<h2>Agregar Cliente</h2>
<form action="rutaDelControlador" method="post">
    Tipo Documento: <input type="text" name="tipoDocumento" required><br>
    Documento: <input type="number" name="documento" required><br>
    Primer Nombre: <input type="text" name="primerNombre" required><br>
    Segundo Nombre: <input type="text" name="segundoNombre"><br>
    Primer Apellido: <input type="text" name="primerApellido" required><br>
    Segundo Apellido: <input type="text" name="segundoApellido"><br>
    Celular: <input type="text" name="celular"><br>
    Dirección: <input type="text" name="direccion"><br>
    Correo: <input type="email" name="correo"><br>
    <input type="submit" value="Agregar Cliente">
</form>

</body>
</html>