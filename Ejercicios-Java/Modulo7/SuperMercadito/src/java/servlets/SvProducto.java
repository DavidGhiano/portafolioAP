
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Producto;

@WebServlet(name = "SvProducto", urlPatterns = {"/SvProducto"})
public class SvProducto extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Producto> listaProductos = control.traerProductos();
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaProductos", listaProductos);
        
        response.sendRedirect("listproduct.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        String categoria = request.getParameter("categoria");
        int stock = Integer.parseInt(request.getParameter("stock"));
        float precioCosto = Float.parseFloat(request.getParameter("precioCosto"));
        float precioVenta = Float.parseFloat(request.getParameter("precioVenta"));
        
        Producto prod = new Producto(0,codigo,nombre,categoria,stock,precioCosto,precioVenta);
        
        control.crearProducto(prod);
        
        response.sendRedirect("index.jsp");
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
