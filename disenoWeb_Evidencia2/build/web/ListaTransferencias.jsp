<%-- 
    Document   : ListaTransferencias
    Created on : 6 abr. 2022, 17:19:14
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
        <h1>Lista transferencias</h1>
        
        <table border="1">
            <tr>
                <th>Numero de Cliente</th>
                <th>Numero de Destino</th>
                <th>Tipo de Cuenta</th>
                <th>Monto</th>
                <th>Fecha</th>
            </tr>
            <c:forEach var="obj" items="${listaTrasferencias}">
                <tr>
                    <td>${obj.getNumeroCliente()}</td>
                    <td>${obj.getIdDestino()}</td>
                    <td>${obj.getTipoCuenta()}</td>
                    <td>${obj.getMonto()}</td>
                    <td>${obj.getFecha()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
