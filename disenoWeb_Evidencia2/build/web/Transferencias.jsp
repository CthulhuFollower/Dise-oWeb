<%-- 
    Document   : Transferencias
    Created on : 6 abr. 2022, 17:18:35
    Author     : julia
--%>

<%@page import="javax.swing.JOptionPane"%>
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
        <h1>Tranferencias</h1>
        <div class="card"> 
            <div class="card-body">
                <form action="controlador?menu=Transferencias" method="POST">
                    <div class="form-group">
                        <label>Numero de Cliente</label>
                        <input type="text" name="NumeroCliente" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Numero de Destino</label>
                        <input type="text" name="NumeroDestino" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Cuenta</label>
                        <input type="text" name="TipoCuenta" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Monto</label>
                        <input type="text" name="Monto" class="form-control">
                    </div>
                    <input type="submit" name="accion" value="Transferir" class="btn btn-primary">
                </form>
            </div>
        </div>
    </body>
</html>
