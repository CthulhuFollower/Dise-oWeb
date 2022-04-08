<%-- 
    Document   : DetallesCuenta
    Created on : 6 abr. 2022, 17:18:24
    Author     : julia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            HttpSession sesion = request.getSession(false);
            if (sesion.getAttribute("nivel").equals("ADMINISTRADOR")) {
                
            }
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Detalles de Cuenta</h1>
        <div class="card"> 
            <div class="card-body">
                <form action="controlador?menu=DetallesCuenta&numeroCliente=${cuentaModificar.getNumeroCliente()}&numeroCuenta=${cuentaModificar.getNumeroCuenta()}" method="POST">
                    <div class="form-group">
                        <label>Numero de Cliente</label>
                        <input type="text" value="${cuentaModificar.getNumeroCliente()}" name="NumeroCliente" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Numero de Cuenta</label>
                        <input type="text" value="${cuentaModificar.getNumeroCuenta()}" name="NumeroCuenta" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Tipo de Cuenta</label>
                        <input type="text" value="${cuentaModificar.getTipoCuenta()}" name="TipoCuenta" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Saldo</label>
                        <input type="text" value="${cuentaModificar.getSaldo()}" name="Saldo" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Fecha</label>
                        <input type="text" value="${cuentaModificar.getFecha()}" name="Fecha" class="form-control">
                    </div>
                    <input type="submit" name="accion" value="Modificar" class="btn btn-primary">
                </form>
            </div>
        </div>
    </body>
</html>
