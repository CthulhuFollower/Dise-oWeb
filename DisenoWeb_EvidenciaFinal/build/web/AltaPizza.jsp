<%-- 
    Document   : AgregarPizza
    Created on : 18 abr. 2022, 15:21:36
    Author     : julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Estilos/FormulariosCSS.css"/>
        <title>Agregar Pizza</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card">
                <div class="card-body">
                    <form class="form-sign" action="controlador?menu=AltaPizza" method="POST">

                        <div class="form-group text-center">
                            <h3>Agregar Pizza</h3>
                        </div>

                        <div class="form-group">
                            <label>Nombre:</label>
                            <input type="text" name="Nombre" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Ingredientes:</label>
                            <input type="text" name="Ingredientes" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Tamaño Uno:</label>
                            <input type="text" name="size1" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Precio uno:</label>
                            <input type="text" name="Precio uno" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Tamaño dos:</label>
                            <input type="text" name="size2" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Precio dos:</label>
                            <input type="text" name="Precio dos" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Registrar Pizza" class="btn btn-primary">

                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
