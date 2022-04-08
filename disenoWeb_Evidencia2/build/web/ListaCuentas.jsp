<%-- 
    Document   : ListaCuentas
    Created on : 7 abr. 2022, 19:15:55
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
        <h1>Lista Cuentas</h1>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Numero de Cliente</th>
                <th>Numero de Cuenta</th>
                <th>Tipo de Cuenta</th>
                <th>Saldo</th>
                <th>Fecha</th>
            </tr>
            <c:forEach var="obj" items="${listaCuentas}">
                <tr>
                    <td>${obj.getIdCuenta()}</td>
                    <td>${obj.getNumeroCliente()}</td>
                    <td>${obj.getNumeroCuenta()}</td>
                    <td>${obj.getTipoCuenta()}</td>
                    <td>${obj.getSaldo()}</td>
                    <td>${obj.getFecha()}</td>
                    <td>
                        <a class="btn btn-warning" href="controlador?menu=DetallesCuenta&accion=Detalles&numeroCliente=${obj.getNumeroCliente()}&numeroCuenta=${obj.getNumeroCuenta()}">Modificar Cuenta</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>