<%-- 
    Document   : login
    Created on : 18 abr. 2022, 11:28:42
    Author     : julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>Login</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card">
                <div class="card-body">
                    <form class="form-sign" action="Validar" method="POST">
                        <div class="form-group text-center">
                            <img src="IMAGENES//Logo.png" alt="70" width="170"/><br>
                            <label>Pizzeria Lara</label>
                        </div>
                        <div class="form-group">
                            <label>Nombre de usuario:</label>
                            <input type="text" name="txtCliente" class="form-control">
                        </div>
                        <div class="form-group" style="margin-bottom: 10px">
                            <label>Contraseña:</label>
                            <input type="password" name="txtPassword" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-primary">
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
