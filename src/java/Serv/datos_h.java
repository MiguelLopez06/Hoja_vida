/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serv;

import Persona.FachadaDatos;
import Persona.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "datos_h", urlPatterns = {"/datos_h"})
public class datos_h extends HttpServlet{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Persona llenar = new Persona();
        
        this.llenar(llenar, request);
        FachadaDatos f = new FachadaDatos();
        f.guardarDatos(llenar);
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel="+("stylesheet")+ " type="+("text/css")+ " href="+("style.css")+">");
            out.println("<title> Hoja de vida </title>");
            out.println("</head>");
            out.println("<body>");		
            out.println("<div id="+("showing")+">");
            out.println("<h1 align="+("center")+"> Hoja de vida </h1>");		
            out.println("<table id="+("showingtb")+ "align="+("center")+">");
            out.println("<tr>");
            out.println("<td>Nombres:</td>");
            out.println("<td><div> "+llenar.nombre+"</div></td>");
            out.println("</tr>");
            out.println("<td>Apellidos:</td>");
            out.println("<td><div> "+llenar.apellido+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("	<td>Tipo de documento:</td>");
            out.println("	<td><div> "+llenar.tipdoc+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("	<td>Documento:</td>");
            out.println("	<td><div> "+llenar.id+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("	<td>Genero:</td>");
            out.println("	<td><div> "+llenar.gen+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("	<td>Fecha de nacimiento:</td>");
            out.println("	<td><div> "+llenar.fnac+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("	<td>Lugar de nacimiento:</td>");
            out.println("	<td><div> "+llenar.lugar_n+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("	<td>Estado civil:</td>");
            out.println("	<td><div> "+llenar.estadoc+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Ciudad:</td>");
            out.println("	<td><div> "+llenar.ciudad+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Estudios:</td>");
            out.println("	<td><div> "+llenar.estudios+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Dirección:</td>");
            out.println("<td><div> "+llenar.direc+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Teléfono:</td>");
            out.println("	<td><div> "+llenar.tel+"</div></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Correo electrónico:</td>");
            out.println("<td><div> "+llenar.email+"</div></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }
    
    private void llenar(Persona llenar, HttpServletRequest request ){
        llenar.nombre =(request.getParameter("nombre"));
        llenar.apellido = (request.getParameter("apellido"));
        llenar.tipdoc = (request.getParameter("tipdoc"));
        llenar.id = (request.getParameter("id"));
        llenar.gen = (request.getParameter("gen"));
        llenar.fnac = (request.getParameter("fnac"));
        llenar.lugar_n = (request.getParameter("lugar"));
        llenar.estadoc = (request.getParameter("estadoc"));
        llenar.ciudad = (request.getParameter("ciudad"));
        llenar.estudios = (request.getParameter("estu"));
        llenar.direc = (request.getParameter("direc"));
        llenar.email = (request.getParameter("correo"));
        llenar.tel = (request.getParameter("tel"));
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
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
