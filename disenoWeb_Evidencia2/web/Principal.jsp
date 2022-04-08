<%-- 
    Document   : Principal
    Created on : 6 abr. 2022, 18:51:54
    Author     : julia
--%>

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
        <h1>Hola</h1>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-link active" aria-current="page" href="controlador?menu=Principal">Home</a>
                    <a class="nav-link active" aria-current="page" href="controlador?menu=DetallesCuenta&accion=user" target="myFrame">Detalles de Cuenta</a>
                    <a class="nav-link active" aria-current="page" href="controlador?menu=Transferencias&accion=nada" target="myFrame">Transferencias</a>
                    <a class="nav-link active" aria-current="page" href="controlador?menu=ListarTransferencias&accion=nada" target="myFrame">Lista de Transferencias</a>
                    
                    <a class="nav-link" aria-current="page" href="controlador?menu=AltaCliente&accion=nada" target="myFrame">Alta de Cliente</a>
                    <a class="nav-link" aria-current="page" href="controlador?menu=AltaCuenta&accion=nada" target="myFrame">Alta de Cuenta</a>
                    <a class="nav-link" aria-current="page" href="controlador?menu=ListaClientes&accion=nada" target="myFrame">Lista de Clientes</a>
                </div>
            </div>
        </nav>
        <div class="mt-4" style="height: 550px;">
            <iframe name="myFrame" style="height: 100%; width: 100%"></iframe>
        </div>
    </body>
</html>
