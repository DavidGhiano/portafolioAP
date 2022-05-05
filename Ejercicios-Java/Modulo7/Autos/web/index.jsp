
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <h1 class="text-center mt-3 mb-3">Consecionaria</h1>
            <div class="d-grid gap-2">
                <a href="autos.jsp" class="btn btn-outline-success mt-1 mb-1">Agregar Auto Nuevo</a>
                <a href="#" class="btn btn-outline-warning mt-1 mb-1">Editar Auto</a>
                <a href="#" class="btn btn-outline-danger mt-1 mb-1">Eliminar Auto</a>
                <form action="SvAutos" method="GET" class="d-grid gap-2">
                    <button type="submit" class="btn btn-outline-info mt-1 mb-1">Listar Autos</button>
                </form>
            </div>
        </div>
    </body>
</html>
