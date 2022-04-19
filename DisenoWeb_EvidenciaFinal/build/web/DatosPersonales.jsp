<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Estilos/FormulariosCSS.css"/>
        <title>Datos Personales</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card">
                <div class="card-body">
                    <form class="form-sign" action="controlador?menu=DatosPersonales" method="POST">

                        <div class="form-group text-center">
                            <h3>Ingrese sus datos de entrega</h3>
                        </div>

                        <div class="form-group">
                            <label>Nombre:</label>
                            <input type="text" name="Nombre" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Calle:</label>
                            <input type="text" name="Calle" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Numero:</label>
                            <input type="text" name="Numero" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Colonia:</label>
                            <input type="text" name="Colonia" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Ciudad:</label>
                            <input type="text" name="Ciudad" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Telefono:</label>
                            <input type="text" name="Telefono" class="form-control">
                        </div>
                        
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                            <label class="form-check-label" for="inlineRadio1">14 cm</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
                            <label class="form-check-label" for="inlineRadio2">10 cm</label>
                        </div>
                        
                        <div class="form-group">
                            <label>Cantidad:</label>
                            <input type="text" name="Cantidad" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Registrar Pizza" class="btn btn-primary">

                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
