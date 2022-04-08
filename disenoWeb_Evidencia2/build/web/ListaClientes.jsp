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
        <%
            HttpSession sesion = request.getSession(false);
            if (sesion.getAttribute("nivel").equals("USUARIO")) {
                request.getRequestDispatcher("controlador?menu=Principal&accion=nada").forward(request, response);
            }
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista clientes</h1>
        <table border="1">
            <tr>
                <th>Id</th>
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
                    <td>
                        <a class="btn btn-warning" href="controlador?menu=DetallesCliente&accion=Detalles&numeroCliente=${obj.getNumeroCliente()}">Modificar Cliente</a>
                        <a class="btn btn-info" href="controlador?menu=ListarCuentas&accion=ninguna&numeroCliente=${obj.getNumeroCliente()}">Modificar Cuentas</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
