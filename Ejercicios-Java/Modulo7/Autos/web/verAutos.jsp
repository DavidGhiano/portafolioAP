<%@page import="logica.Auto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Autos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">Lista de Vehículos</h1>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Patente</th>
                        <th>Marca</th>
                        <th>Modelo</th>
                        <th>Color</th>
                        <th>Tipo de Motor</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Auto> listaAutos = (List) request.getSession().getAttribute("listaAuto");
                        for (Auto auto : listaAutos) {
                    %>
                    <tr>
                        <td><%= auto.getId()%></td>
                        <td><%= auto.getPatente()%></td>
                        <td><%= auto.getMarca()%></td>
                        <td><%= auto.getModelo()%></td>
                        <td><%= auto.getColor()%></td>
                        <td><%= auto.getMotor()%></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>

            </table>
            <div class="d-grid gap-2">
                <a href="index.jsp" class="btn btn-outline-success">Regresar</a>
            </div>
        </div>
    </body>
</html>
