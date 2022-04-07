/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteSQL;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class controlador extends HttpServlet {

    ClienteSQL clienteSQL = new ClienteSQL();
    Cliente cliente = new Cliente();
    ArrayList<Cliente> clientes;

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
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if (menu.equals("AltaCliente")) {
            switch (accion) {
                case "agregar":
                    String password = request.getParameter("Password");
                    String passwordAux = request.getParameter("PasswordAux");
                    try {
                        if (password.equals(passwordAux)) {
                            cliente.setNombre(request.getParameter("Nombre"));
                            cliente.setApellidos(request.getParameter("Apellidos"));
                            cliente.setDireccion(request.getParameter("Direccion"));
                            cliente.setPostal(Integer.parseInt(request.getParameter("Postal")));
                            cliente.setCiudad(request.getParameter("Ciudad"));
                            cliente.setEstado(request.getParameter("Estado"));
                            cliente.setPais(request.getParameter("Pais"));
                            cliente.setTelefono(request.getParameter("Telefono"));
                            cliente.setCorreo(request.getParameter("Correo"));
                            cliente.setNacimiento(request.getParameter("Nacimiento"));
                            cliente.setNumeroCliente(Integer.parseInt(request.getParameter("NumeroCliente")));
                            cliente.setPassword(password);
                            clienteSQL.registrarCliente(cliente);
                            JOptionPane.showMessageDialog(null, "El registro fue un exito");
                            request.getRequestDispatcher("controlador?menu=ListaClientes&accion=x").forward(request, response);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Algo salio mal");
                        request.getRequestDispatcher("controlador?menu=AltaCliente&accion=x").forward(request, response);
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }

        switch (accion) {
            case "Principal":
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
                break;
            case "AltaCliente":
                String darAlta = request.getParameter("accion");
                String password = request.getParameter("Password");
                String passwordAux = request.getParameter("PasswordAux");
                if (password.equals(passwordAux)) {
                    cliente.setNombre(request.getParameter("Nombre"));
                    cliente.setApellidos(request.getParameter("Apellidos"));
                    cliente.setDireccion(request.getParameter("Direccion"));
                    cliente.setPostal(Integer.parseInt(request.getParameter("Postal")));
                    cliente.setCiudad(request.getParameter("Ciudad"));
                    cliente.setEstado(request.getParameter("Estado"));
                    cliente.setPais(request.getParameter("Pais"));
                    cliente.setTelefono(request.getParameter("Telefono"));
                    cliente.setCorreo(request.getParameter("Correo"));
                    cliente.setNacimiento(request.getParameter("Nacimiento"));
                    cliente.setNumeroCliente(Integer.parseInt(request.getParameter("NumeroCliente")));
                    cliente.setPassword(request.getParameter("Password"));
                    clienteSQL.registrarCliente(cliente);
                } else {
                    request.setAttribute("mensaje", "Las contraseñas no coinciden");
                }
                request.getRequestDispatcher("AltaCliente.jsp").forward(request, response);
                break;
            case "AltaCuenta":
                cliente.setSaldo(Float.parseFloat(request.getParameter("Saldo")));
                cliente.setTipoCuenta(request.getParameter("TipoCuenta"));
                cliente.setNumeroCuenta(Integer.parseInt(request.getParameter("NumeroCuenta")));
                request.getRequestDispatcher("AltaCuenta.jsp").forward(request, response);
                break;
            case "DetallesCliente":
                request.getRequestDispatcher("DetallesCliente.jsp").forward(request, response);
                break;
            case "DetallesCuenta":
                request.getRequestDispatcher("DetallesCuenta.jsp").forward(request, response);
                break;
            case "Transferencias":
                request.getRequestDispatcher("Transferencias.jsp").forward(request, response);
                break;
            case "ListaClientes":
                clientes = clienteSQL.getListaClientes();
                JOptionPane.showMessageDialog(null, clientes.get(0).getNombre());
                request.setAttribute("listaClientes", clientes);
                request.getRequestDispatcher("ListaClientes.jsp").forward(request, response);
                break;
            case "ListaTransferencias":
                request.getRequestDispatcher("ListaTransferencias.jsp").forward(request, response);
                break;
            default:
                throw new AssertionError();
        }

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
