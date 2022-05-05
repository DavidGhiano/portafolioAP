<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso de Producto</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="css/stylos.css">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-danger">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">SuperMercadito</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="index.jsp">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="newproduct.jsp">Nuevo Producto</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="SvProducto">Lista de Productos</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container mt-3">
            <h1 class="text-center">Ingrese el producto nuevo</h1>
            <div class="row justify-content-center">
                <form action="SvProducto" method="POST" class="col col-md-7 mb-3 newProduct">
                    <div class="mb-3">
                        <label for="codigo" class="form-label">Código:</label>
                        <input type="text" name="codigo" class="form-control" placeholder="Código interno/codigo de barra">
                    </div>
                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombre:</label>
                        <input type="text" name="nombre" class="form-control" placeholder="Ej: Coca-cola 1lt">
                    </div>
                    <div class="mb-3">
                        <label for="categoria" class="form-label">Tipo de Producto:</label>
                        <select name="categoria" class="form-select">
                            <option selected>-- Selecciona una opción --</option>
                            <option value="Perecedero">Perecedero</option>
                            <option value="No Perecedero">No Perecedero</option>
                            <option value="Limpieza">Limpieza</option>
                            <option value="Bebida">Bebida</option>
                            <option value="Bazar">Bazar</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="stock" class="form-label">Cantidad de stock:</label>
                        <input type="number" name="stock" class="form-control" min="0">
                    </div>
                    <div class="mb-3">
                        <label for="precioCosto" class="form-label">Precio Costo:</label>
                        <input type="number" name="precioCosto" class="form-control" min="0">
                    </div>
                    <div class="mb-3">
                        <label for="precioVenta" class="form-label">Precio Venta:</label>
                        <input type="number" name="precioVenta" class="form-control" min="0">
                    </div>

                    <div class="d-grid gap-2">
                        <button class="btn btn-danger" type="submit">Agregar</button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
