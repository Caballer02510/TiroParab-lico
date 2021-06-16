/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Coordenada;
import modelo.Tiro;
import modelo.Utilidades;



/**
 *
 * @author SergioCaballeroSáez
 */
public class ServletTiro extends HttpServlet {
    ArrayList<String> lista;
    @Override
    public void init() throws ServletException {
        lista = Utilidades.angulos();
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("lista", lista);
        request.getRequestDispatcher("formualrio.jsp").forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Tiro ti = new Tiro(
            
            Double.parseDouble(request.getParameter("velocidad")),
            Integer.parseInt(request.getParameter("angulo")));
            
      
        request.setAttribute("ti", ti);        
        request.setAttribute("lista", lista);
        
        ArrayList<Coordenada> listaCoordenadas = new ArrayList();
        listaCoordenadas = Utilidades.getCoordenadas(ti.getAlcanceMaximo(), ti.getVelocidadInicial(), ti.getAngulo());
        request.setAttribute("listaCoordenadas", listaCoordenadas);
        
        request.getRequestDispatcher("formualrio.jsp").forward(request, response);

               
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
