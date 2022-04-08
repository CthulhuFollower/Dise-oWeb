<%-- 
    Document   : DetallesCuentaUser
    Created on : 7 abr. 2022, 20:54:14
    Author     : julia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            HttpSession sesion = request.getSession(false);
            if (!sesion.getAttribute("nivel").equals("USUARIO")) {
                request.getRequestDispatcher("controlador?menu=Principal&accion=nada").forward(request, response);
            }
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Detalles de Cuentas</h1>
            <c:forEach var="obj" items="${listaCuentas}">
                    <div class="form-group">
                        <label>Numero de Cliente</label>
                        <input type="text" contenteditable="false" value="${obj.getNumeroCliente()}" name="NumeroCliente" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Numero de Cuenta</label>
                        <input type="text" contenteditable="false" value="${obj.getNumeroCuenta()}" name="NumeroCuenta" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Tipo de Cuenta</label>
                        <input type="text" contenteditable="false" value="${obj.getTipoCuenta()}" name="TipoCuenta" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Saldo</label>
                        <input type="text" contenteditable="false" value="${obj.getSaldo()}" name="Saldo" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Fecha</label>
                        <input type="text" contenteditable="false" value="${obj.getFecha()}" name="Fecha" class="form-control">
                    </div>
                    <br>--------------------------------------------------<br>
            </c:forEach>

    </body>
</html>
