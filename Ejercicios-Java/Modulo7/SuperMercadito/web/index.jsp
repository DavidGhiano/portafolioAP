<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SuperMercadito</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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
                            <a class="nav-link active" aria-current="page" href="index.jsp">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="newproduct.jsp">Nuevo Producto</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="SvProducto">Lista de Productos</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container mt-4">
            <h1 class="text-center">Bienvenido al Sistema de Stock de Productos para Supermercados</h1>
            <div class="row">
                <div class="col-12 col-md-6 mt-3">
                    <div class="card bg-success bg-gradient text-light text-center">
                        <div class="card-body">
                            <h5 class="card-title">Ingresar nuevo Producto</h5>
                            <p class="card-text">Presione el botón para así poder ingresar nuevo producto al sistema</p>
                            <a href="newproduct.jsp" class="btn btn-danger">Ingresar Producto</a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-6 mt-3">
                    <div class="card bg-warning bg-gradient text-light text-center">
                        <div class="card-body">
                            <h5 class="card-title">Ver lista de Productos</h5>
                            <p class="card-text">Presione el botón si desea ver la lista de productos cargados al sistema.</p>
                            <a href="SvProducto" class="btn btn-danger">Ver stock de Productos</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
