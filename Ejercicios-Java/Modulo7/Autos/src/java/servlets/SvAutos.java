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
import logica.Auto;
import logica.Controladora;

@WebServlet(name = "SvAutos", urlPatterns = {"/SvAutos"})
public class SvAutos extends HttpServlet {

    private Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Auto> listaAuto = control.traerAutos();
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaAuto", listaAuto);
        
        response.sendRedirect("verAutos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String patente = request.getParameter("patente");
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String color = request.getParameter("color");
        String motor = request.getParameter("motor");
        
        Auto auto = new Auto(0, patente, marca, modelo, color, motor);
                
        control.crearAuto(auto);
        
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
