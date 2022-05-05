<%@page import="logica.Producto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Productos</title>
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
                            <a class="nav-link" aria-current="page" href="index.jsp">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="newproduct.jsp">Nuevo Producto</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="SvProducto">Lista de Productos</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <h1 class="text-center">Lista de Productos</h1>
            <table class="table">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Código</th>
                        <th>Nombre</th>
                        <th>Categoría</th>
                        <th>Cantidad</th>
                        <th>Precio Costo</th>
                        <th>Precio Venta</th>
                        <th>Total $</th>
                    </tr>
                </thead>
                <tbody>
                    <%  List<Producto> listaProductos = (List) request.getSession().getAttribute("listaProductos");
                        float venta = 0.0f;
                        float total = 0.0f;
                        for(Producto prod : listaProductos){
                            total = prod.getPrecioVenta() * prod.getStock();
                    %>
                            
                        <tr class=
                            <%
                                if(prod.getStock() > 50) {
                                    out.println("table-success");
                                }else if(prod.getStock() <= 50 && prod.getStock() > 0){
                                    out.println("table-warning");
                                }else {
                                    out.println("table-danger");
                                }
                            %>>
                            <td><%= prod.getId() %></td>
                            <td><%= prod.getCodigo() %></td>
                            <td><%= prod.getNombre() %></td>
                            <td><%= prod.getCategoria() %></td>
                            <td><%= prod.getStock() %></td>
                            <td>$ <%= prod.getPrecioCosto() %></td>
                            <td>$ <%= prod.getPrecioVenta() %></td>
                            <td>$ <%= total %></td>
                        </tr>
                    <%
                        venta += prod.getPrecioVenta() * prod.getStock();
                        }
                    %>
                    <tfoot>
                        <tr>
                            <th></th>
                            <th></th>
                            <th></th>
                            <th></th>
                            <th></th>
                            <th></th>
                            <th></th>
                            <th>$ <%= venta%></th>
                        </tr>
                    </tfoot>
                </tbody>
            </table>
        </div>
</html>
