<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Autos JSP</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <h1 class="text-center mt-3">Consecionario de Autos</h1>
            <form action="SvAutos" method="POST">
                <div class="mb-3">
                    <label class="form-label">Patente</label>
                    <input 
                        type="text" 
                        name="patente" 
                        class="form-control"
                        placeholder="XX XXX XX">
                </div>
                <div class="mb-3">
                    <label class="form-label">Marca</label>
                    <input 
                        type="text" 
                        name="marca" 
                        class="form-control"
                        placeholder="Ej: Toyota, Peugeot, Fiat...">
                </div>
                <div class="mb-3">
                    <label class="form-label">Modelo</label>
                    <input 
                        type="text" 
                        name="modelo" 
                        class="form-control"
                        placeholder="Modelo del automovil">
                </div>
                <div class="mb-3">
                    <label class="form-label">Color</label>
                    <input 
                        type="text" 
                        name="color" 
                        class="form-control"
                        placeholder="Ej: azul, verde, negro...">
                </div>
                <div class="mb-3">
                    <label class="form-label">Tipo de motor</label>
                    <input 
                        type="text" 
                        name="motor" 
                        class="form-control"
                        placeholder="Ej: gas-oil, nafta, electrico...">
                </div>
                <div class="d-grid gap-2">
                    <button 
                        type="submit"
                        class="btn btn-outline-success"
                    >Agregar</button>
                </div>
            </form>
        </div>
    </body>
</html>
