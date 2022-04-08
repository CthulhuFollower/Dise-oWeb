/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteSQL;
import Modelo.Cuenta;
import Modelo.CuentaSQL;
import Modelo.Transaccion;
import Modelo.TransaccionSQL;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class controlador extends HttpServlet {

    //Variables para Clientes
    ClienteSQL clienteSQL = new ClienteSQL();
    Cliente cliente = new Cliente();
    Cliente clienteModificar = new Cliente();
    ArrayList<Cliente> clientes;
    int numeroCliente;

    //Variables para Cuentas
    CuentaSQL cuentaSQL = new CuentaSQL();
    Cuenta cuenta = new Cuenta();
    Cuenta cuentaModificar = new Cuenta();
    ArrayList<Cuenta> cuentas;
    int numeroCuenta;

    //Variables para Tranferencias
    TransaccionSQL transaccionSQL = new TransaccionSQL();
    Transaccion transaccion = new Transaccion();
    Transaccion transaccionModificar = new Transaccion();
    ArrayList<Transaccion> transacciones;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }

        if (menu.equals("AltaCliente")) {
            if (accion.equals("Dar Alta Cliente")) {
                String password = request.getParameter("password");
                String passwordAux = request.getParameter("passwordAux");
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
                        request.getRequestDispatcher("ListaClientes.jsp").forward(request, response);
                        //request.getRequestDispatcher("controlador?menu=ListaClientes&accion=x").forward(request, response);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal");
                }
            }
            request.getRequestDispatcher("AltaCliente.jsp").forward(request, response);
        }

        if (menu.equals("AltaCuenta")) {
            if (accion.equals("Dar Alta Cuenta")) {
                try {
                    cuenta.setNumeroCliente(Integer.parseInt(request.getParameter("NumeroCliente")));
                    cuenta.setNumeroCuenta(Integer.parseInt(request.getParameter("NumeroCuenta")));
                    cuenta.setTipoCuenta(request.getParameter("TipoCuenta"));
                    cuenta.setSaldo(Float.parseFloat(request.getParameter("Saldo")));
                    cuenta.setFecha(request.getParameter("Fecha"));
                    if (cuentaSQL.validar(cuenta.getNumeroCliente())) {
                        cuentaSQL.registrarCuenta(cuenta);
                        JOptionPane.showMessageDialog(null, "El registro fue un exito");
                        request.getRequestDispatcher("DetallesCuenta.jsp").forward(request, response);
                    } else {
                        JOptionPane.showMessageDialog(null, "El cliente no existe");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal");
                }
            }
            request.getRequestDispatcher("AltaCuenta.jsp").forward(request, response);
        }

        if (menu.equals("DetallesCliente")) {
            switch (accion) {
                case "Agregar":
                    break;
                case "Detalles":
                    numeroCliente = Integer.parseInt(request.getParameter("numeroCliente"));
                    clienteModificar = clienteSQL.buscar(numeroCliente);
                    request.setAttribute("clienteModificar", clienteModificar);
                    request.getRequestDispatcher("DetallesCliente.jsp").forward(request, response);
                    break;
                case "Modificar":
                    numeroCliente = Integer.parseInt(request.getParameter("numeroCliente"));
                    JOptionPane.showMessageDialog(null, numeroCliente);
                    clienteModificar.setNombre(request.getParameter("Nombre"));
                    clienteModificar.setApellidos(request.getParameter("Apellidos"));
                    clienteModificar.setDireccion(request.getParameter("Direccion"));
                    clienteModificar.setPostal(Integer.parseInt(request.getParameter("Postal")));
                    clienteModificar.setCiudad(request.getParameter("Ciudad"));
                    clienteModificar.setEstado(request.getParameter("Estado"));
                    clienteModificar.setPais(request.getParameter("Pais"));
                    clienteModificar.setTelefono(request.getParameter("Telefono"));
                    clienteModificar.setCorreo(request.getParameter("Correo"));
                    clienteModificar.setNacimiento(request.getParameter("Nacimiento"));
                    clienteModificar.setNumeroCliente(Integer.parseInt(request.getParameter("NumeroCliente")));

                    clienteSQL.modificar(clienteModificar, numeroCliente);
                    request.getRequestDispatcher("ListaClientes.jsp").forward(request, response);
                    break;
            }
        }

        if (menu.equals("DetallesCuenta")) {
            switch (accion) {
                case "user":
                    HttpSession sesion = request.getSession(false);
                    cuentas = (ArrayList<Cuenta>) sesion.getAttribute("CuentasUsuario");
                    request.setAttribute("listaCuentas", cuentas);
                    request.getRequestDispatcher("DetallesCuentaUser.jsp").forward(request, response);
                    break;
                case "Detalles":
                    numeroCliente = Integer.parseInt(request.getParameter("numeroCliente"));
                    numeroCuenta = Integer.parseInt(request.getParameter("numeroCuenta"));
                    cuentaModificar = cuentaSQL.buscar(numeroCliente, numeroCuenta);
                    request.setAttribute("cuentaModificar", cuentaModificar);
                    request.getRequestDispatcher("DetallesCuentaAdmin.jsp").forward(request, response);
                    break;
                case "Modificar":
                    numeroCliente = Integer.parseInt(request.getParameter("numeroCliente"));
                    numeroCuenta = Integer.parseInt(request.getParameter("numeroCuenta"));

                    cuentaModificar.setNumeroCliente(Integer.parseInt(request.getParameter("NumeroCliente")));
                    cuentaModificar.setNumeroCuenta(Integer.parseInt(request.getParameter("NumeroCuenta")));
                    cuentaModificar.setTipoCuenta(request.getParameter("TipoCuenta"));
                    cuentaModificar.setSaldo(Float.parseFloat(request.getParameter("Saldo")));
                    cuentaModificar.setFecha(request.getParameter("Fecha"));

                    clienteSQL.modificar(clienteModificar, numeroCliente);
                    cuentaSQL.modificar(cuentaModificar, numeroCuenta, numeroCliente);
                    request.getRequestDispatcher("controlador?menu=ListarCuentas&accion=nada").forward(request, response);
                    break;
            }
        }

        if (menu.equals("Transferencias")) {
            if (accion.equals("Transferir")) {
                try {
                    transaccion.setNumeroCliente(Integer.parseInt(request.getParameter("NumeroCliente")));
                    transaccion.setIdDestino(Integer.parseInt(request.getParameter("NumeroDestino")));
                    transaccion.setMonto(Float.parseFloat(request.getParameter("Monto")));
                    transaccion.setTipoCuenta(request.getParameter("TipoCuenta"));
                    transaccion.fechaHoy();
                    if (cuentaSQL.validar(transaccion.getNumeroCliente())) {
                        transaccionSQL.registrar(transaccion);
                        HttpSession sesion = request.getSession(false);
                        sesion.setAttribute("CuentasUsuario", cuentaSQL.getListaCuentas(transaccion.getNumeroCliente()));
                        request.getRequestDispatcher("controlador?menu=DetallesCuenta&accion=user").forward(request, response);
                    } else {
                        JOptionPane.showMessageDialog(null, "El cliente no existe");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            request.getRequestDispatcher("Transferencias.jsp").forward(request, response);
        }
        
        if (menu.equals("ListarTransferencias")) {
            numeroCliente = Integer.parseInt(request.getParameter("numeroCliente"));
            cuentas = cuentaSQL.getListaCuentas(numeroCliente);
            request.setAttribute("listaCuentas", cuentas);
            request.getRequestDispatcher("ListaCuentas.jsp").forward(request, response);
        }
        
        if (menu.equals("ListarCuentas")) {
            numeroCliente = Integer.parseInt(request.getParameter("numeroCliente"));
            cuentas = cuentaSQL.getListaCuentas(numeroCliente);
            request.setAttribute("listaCuentas", cuentas);
            request.getRequestDispatcher("ListaCuentas.jsp").forward(request, response);
        }
        if (menu.equals("ListaClientes")) {
            clientes = clienteSQL.getListaClientes();
            request.setAttribute("listaClientes", clientes);
            request.getRequestDispatcher("ListaClientes.jsp").forward(request, response);
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
