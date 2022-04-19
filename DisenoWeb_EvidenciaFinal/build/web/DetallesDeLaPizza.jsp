<%-- 
    Document   : DetallesDeLaPizza
    Created on : 18 abr. 2022, 17:25:28
    Author     : julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Estilos/homeStyles.css"/>
        <title>Detalles De La Pizza</title>
    </head>
    <body>
        <main>

            <div class="menu">

                <div class="card">
                    <div class="imagen">
                        <img src="IMAGENES/DLX.png" alt="Carnes Frias">
                    </div>
                    <div class="contenido">
                        <p class="titulo texto">
                            Carnes Frias
                        </p>
                        <p class="informacion texto">
                            Ingredientes y descripcion
                        </p>
                        <button class="boton_ordenar texto" type="submit">Ordenar</button>
                    </div>
                </div>

                <div class="card">
                    <div class="imagen">
                        <img src="IMAGENES/DLX.png" alt="Carnes Frias">
                    </div>
                    <div class="contenido">
                        <p class="titulo texto">
                            Carnes Frias
                        </p>
                        <p class="informacion texto">
                            Ingredientes y descripcion
                        </p>

                        <!-- Seleccion de tamaños -->
                        <div id="viewCustomFilters">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" data-toggle="collapse" href="#precio1" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                                <label class="form-check-label" for="inlineRadio1">14 cm</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" data-toggle="collapse" href="#precio2" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
                                <label class="form-check-label" for="inlineRadio2">10 cm</label>
                            </div>

                            <!-- Precios -->
                            <div class="precio collapse" id="precio1" data-parent="#viewCustomFilters">
                                <div class="card card-body">
                                    $189    
                                </div>
                            </div>
                            <div class="precio collapse" id="precio2" data-parent="#viewCustomFilters">
                                <div class="card card-body">
                                    $189    
                                </div>
                            </div>
                        </div>

                            <button class="boton_ordenar texto" type="submit">Ordenar</button>
                        </div>
                    </div>

                    <div class="card">
                        <div class="imagen">
                            <img src="IMAGENES/DLX.png" alt="Carnes Frias">
                        </div>
                        <div class="contenido">
                            <p class="titulo texto">
                                Carnes Frias
                            </p>
                            <p class="informacion texto">
                                Ingredientes y descripcion
                            </p>
                            <button class="boton_ordenar texto" type="submit">Ordenar</button>
                        </div>
                    </div>

                    <div class="card">
                        <div class="imagen">
                            <img src="IMAGENES/DLX.png" alt="Carnes Frias">
                        </div>
                        <div class="contenido">
                            <p class="titulo texto">
                                Carnes Frias
                            </p>
                            <p class="informacion texto">
                                Ingredientes y descripcion
                            </p>
                            <button class="boton_ordenar texto" type="submit">Ordenar</button>
                        </div>
                    </div>

                    <div class="card">
                        <div class="imagen">
                            <img src="IMAGENES/DLX.png" alt="Carnes Frias">
                        </div>
                        <div class="contenido">
                            <p class="titulo texto">
                                Carnes Frias
                            </p>
                            <p class="informacion texto">
                                Ingredientes y descripcion
                            </p>
                            <button class="boton_ordenar texto" type="submit">Ordenar</button>
                        </div>
                    </div>

                    <div class="card">
                        <div class="imagen">
                            <img src="IMAGENES/DLX.png" alt="Carnes Frias">
                        </div>
                        <div class="contenido">
                            <p class="titulo texto">
                                Carnes Frias
                            </p>
                            <p class="informacion texto">
                                Ingredientes y descripcion
                            </p>
                            <button class="boton_ordenar texto" type="submit">Ordenar</button>
                        </div>
                    </div>

                </div>
        </main>
    </body>
</html>
