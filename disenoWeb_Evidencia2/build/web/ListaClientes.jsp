<%-- 
    Document   : ListaClientes
    Created on : 6 abr. 2022, 17:18:48
    Author     : julia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista clientes</h1>
        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Direccion</th>
                <th>Postal</th>
                <th>Ciudad</th>
                <th>Estado</th>
                <th>Pais</th>
                <th>Telefono</th>
                <th>Correo</th>
                <th>Nacimiento</th>
                <th>Numero de Cliente</th>
                <th>Saldo</th>
                <th>Tipo de Cuenta</th>
                <th>Numero de Cuenta</th>
            </tr>
            <c:forEach var="obj" items="${listaClientes}">
                <tr>
                    <td>${obj.getId()}</td>
                    <td>${obj.getNombre()}</td>
                    <td>${obj.getApellidos()}</td>
                    <td>${obj.getDireccion()}</td>
                    <td>${obj.getPostal()}</td>
                    <td>${obj.getCiudad()}</td>
                    <td>${obj.getEstado()}</td>
                    <td>${obj.getPais()}</td>
                    <td>${obj.getTelefono()}</td>
                    <td>${obj.getCorreo()}</td>
                    <td>${obj.getNacimiento()}</td>
                    <td>${obj.getNumeroCliente()}</td>
                    <td>${obj.getSaldo()}</td>
                    <td>${obj.getTipoCuenta()}</td>
                    <td>${obj.getNumeroCuenta()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
