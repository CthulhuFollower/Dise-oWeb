<%-- 
    Document   : ColocarOrden
    Created on : 18 abr. 2022, 18:08:30
    Author     : julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Estilos/OrdenCSS.css"/>
        <title>Colocar Orden</title>
    </head>
    <body>

        <div class="container-all">
            <h1 class="title">Detalles de la orden</h1>
            <div class="pizza">
                <img src="IMAGENES/DLX.png" alt="Carnes frias">
                <h1 class="sub-title">Carnes Frias</h1>
                <p class="Ingredientes">Pepperoni, Salami, Jamón y Finas Hierbas</p>
            </div>
            <div class="detallesCliente">
                <p>Ordenado por: Julian Antonio</p>
                <p>Direccion de envio:</p>
                <p>Calle Principal 3000</p>
                <p>Col. Valle</p>
                <p>Apodaca</p>
                <p>9933600000</p>
            </div>
            <button type="button" class="btn btn-success">Ordenar</button>
            <button type="button" class="btn btn-danger">Cancelar</button>

        </div>

    </body>
</html>