<%-- 
    Document   : DetallesCliente
    Created on : 6 abr. 2022, 17:18:12
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
        <h1>Detalles Cliente</h1>
        <div class="card"> 
            <div class="card-body">
                <form action="controlador?menu=DetallesCliente&numeroCliente=${clienteModificar.getNumeroCliente()}" method="POST">
                    <div class="form-group">
                        <label>Nombre</label>
                        <input type="text" value="${clienteModificar.getNombre()}" name="Nombre" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Apellidos</label>
                        <input type="text" value="${clienteModificar.getApellidos()}" name="Apellidos" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Direccion</label>
                        <input type="text" value="${clienteModificar.getDireccion()}" name="Direccion" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Postal</label>
                        <input type="text" contenteditable="" value="${clienteModificar.getPostal()}" name="Postal" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Ciudad</label>
                        <input type="text" value="${clienteModificar.getCiudad()}" name="Ciudad" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Estado</label>
                        <input type="text" value="${clienteModificar.getEstado()}" name="Estado" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Pais</label>
                        <input type="text" value="${clienteModificar.getPais()}" name="Pais" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Telefono</label>
                        <input type="text" value="${clienteModificar.getTelefono()}" name="Telefono" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Correo</label>
                        <input type="text" value="${clienteModificar.getCorreo()}" name="Correo" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Fecha de Nacimiento (YYYY-MM-DD)</label>
                        <input type="text" value="${clienteModificar.getNacimiento()}" name="Nacimiento" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Numero de Cliente</label>
                        <input type="text" value="${clienteModificar.getNumeroCliente()}" name="NumeroCliente" class="form-control">
                    </div>
                    <input type="submit" name="accion" value="Modificar" class="btn btn-primary">
                </form>
            </div>
        </div>
    </body>
</html>
