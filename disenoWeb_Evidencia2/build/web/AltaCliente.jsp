<%-- 
    Document   : AltaCliente
    Created on : 6 abr. 2022, 17:17:41
    Author     : julia
--%>

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
        <h1>Alta de cliente</h1>
        <div class="card"> 
            <div class="card-body">
                <form action="controlador?menu=AltaCliente" method="POST">
                    <div class="form-group">
                        <label>Nombre</label>
                        <input type="text" name="Nombre" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Apellidos</label>
                        <input type="text" name="Apellidos" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Direccion</label>
                        <input type="text" name="Direccion" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Postal</label>
                        <input type="text" name="Postal" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Ciudad</label>
                        <input type="text" name="Ciudad" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Estado</label>
                        <input type="text" name="Estado" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Pais</label>
                        <input type="text" name="Pais" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Telefono</label>
                        <input type="text" name="Telefono" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Correo</label>
                        <input type="text" name="Correo" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Fecha de Nacimiento (YYYY-MM-DD)</label>
                        <input type="text" name="Nacimiento" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Numero de Cliente</label>
                        <input type="text" name="NumeroCliente" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Contraseña</label>
                        <input type="text"  name="password" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Repetir Contraseña</label>
                        <input type="text" name="passwordAux" class="form-control">
                    </div>
                    <input type="submit" name="accion" value="Dar Alta Cliente" class="btn btn-primary">
                </form>
            </div>
        </div>
    </body>
</html>
