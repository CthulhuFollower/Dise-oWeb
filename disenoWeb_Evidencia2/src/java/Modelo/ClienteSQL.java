/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class ClienteSQL extends Conexion {

    public Cliente validar(int numeroCliente, String password) {
        Cliente cliente = new Cliente();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "SELECT * FROM cliente where NumeroCliente=? and Password=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, numeroCliente);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                cliente.setId(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("Nombre"));
                cliente.setApellidos(rs.getString("Apellidos"));
                cliente.setDireccion(rs.getString("Direccion"));
                cliente.setPostal(rs.getInt("Postal"));
                cliente.setCiudad(rs.getString("Ciudad"));
                cliente.setEstado(rs.getString("Estado"));
                cliente.setPais(rs.getString("Pais"));
                cliente.setTelefono(rs.getString("Telefono"));
                cliente.setCorreo(rs.getString("Correo"));
                cliente.setNacimiento(rs.getString("Nacimiento"));
                cliente.setNumeroCliente(rs.getInt("NumeroCliente"));
                cliente.setPassword(rs.getString("Password"));
                cliente.setSaldo(rs.getFloat("Saldo"));
                cliente.setTipoCuenta(rs.getString("TipoCuenta"));
                cliente.setNumeroCuenta(rs.getInt("NumeroCuenta"));
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return cliente;
    }

    public boolean registrarCliente(Cliente cliente) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "INSERT INTO cliente (Nombre, Apellidos, Direccion,"
                + " Postal, Ciudad, Estado, Pais, Telefono, Correo, Nacimiento,"
                + " NumeroCliente, Password) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getPostal());
            ps.setString(5, cliente.getCiudad());
            ps.setString(6, cliente.getEstado());
            ps.setString(7, cliente.getPais());
            ps.setString(8, cliente.getTelefono());
            ps.setString(9, cliente.getCorreo());
            ps.setString(10, cliente.getNacimiento());
            ps.setInt(11, cliente.getNumeroCliente());
            ps.setString(12, cliente.getPassword());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un erro en el registro");
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean registrarCuenta(Cliente cliente) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "INSERT INTO cliente (Nombre, Apellidos, Direccion,"
                + " Postal, Ciudad, Estado, Pais, Telefono, Correo, Nacimiento,"
                + " NumeroCliente, Password, Saldo, TipoCuenta, NumeroCuenta) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getPostal());
            ps.setString(5, cliente.getCiudad());
            ps.setString(6, cliente.getEstado());
            ps.setString(7, cliente.getPais());
            ps.setString(8, cliente.getTelefono());
            ps.setString(9, cliente.getCorreo());
            ps.setString(10, cliente.getNacimiento());
            ps.setInt(11, cliente.getNumeroCliente());
            ps.setString(12, cliente.getPassword());
            ps.setFloat(13, cliente.getSaldo());
            ps.setString(14, cliente.getTipoCuenta());
            ps.setInt(15, cliente.getNumeroCuenta());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un erro en el registro");
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean modificar(Cliente cliente) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "UPDATE cliente SET Nombre=?, Apellidos=?, Direccion=?, Postal=?, "
                + "Ciudad=?, Estado=?, Pais=?, Telefono=?, Correo=?, Nacimiento=?, "
                + "NumeroCliente=?, Password=?, Saldo=?, TipoCuenta=?, NumeroCuenta=? "
                + "WHERE idCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getPostal());
            ps.setString(5, cliente.getCiudad());
            ps.setString(6, cliente.getEstado());
            ps.setString(7, cliente.getPais());
            ps.setString(8, cliente.getTelefono());
            ps.setString(9, cliente.getCorreo());
            ps.setString(10, cliente.getNacimiento());
            ps.setInt(11, cliente.getNumeroCliente());
            ps.setString(12, cliente.getPassword());
            ps.setFloat(13, cliente.getSaldo());
            ps.setString(14, cliente.getTipoCuenta());
            ps.setInt(15, cliente.getNumeroCuenta());

            ps.setInt(16, cliente.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(Cliente cliente) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "DELETE FROM cliente WHERE idCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean buscar(Cliente cliente) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "SELECT * FROM producto WHERE idCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                cliente.setId(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("Nombre"));
                cliente.setApellidos(rs.getString("Apellidos"));
                cliente.setDireccion(rs.getString("Direccion"));
                cliente.setPostal(rs.getInt("Postal"));
                cliente.setCiudad(rs.getString("Ciudad"));
                cliente.setEstado(rs.getString("Estado"));
                cliente.setPais(rs.getString("Pais"));
                cliente.setTelefono(rs.getString("Telefono"));
                cliente.setCorreo(rs.getString("Correo"));
                cliente.setNacimiento(rs.getString("Nacimiento"));
                cliente.setNumeroCliente(rs.getInt("NumeroCliente"));
                cliente.setPassword(rs.getString("Password"));
                cliente.setSaldo(rs.getFloat("Saldo"));
                cliente.setTipoCuenta(rs.getString("TipoCuenta"));
                cliente.setNumeroCuenta(rs.getInt("NumeroCuenta"));
                return true;
            }
            return false;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public ArrayList<Cliente> getListaClientes() {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "SELECT * FROM cliente";

        try {
            ps = con.prepareStatement(sql);
            //ps.setString(1, "ADMIN");
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("Nombre"));
                cliente.setApellidos(rs.getString("Apellidos"));
                cliente.setDireccion(rs.getString("Direccion"));
                cliente.setPostal(rs.getInt("Postal"));
                cliente.setCiudad(rs.getString("Ciudad"));
                cliente.setEstado(rs.getString("Estado"));
                cliente.setPais(rs.getString("Pais"));
                cliente.setTelefono(rs.getString("Telefono"));
                cliente.setCorreo(rs.getString("Correo"));
                cliente.setNacimiento(rs.getString("Nacimiento"));
                cliente.setNumeroCliente(rs.getInt("NumeroCliente"));
                cliente.setPassword(rs.getString("Password"));
                cliente.setSaldo(rs.getFloat("Saldo"));
                cliente.setTipoCuenta(rs.getString("TipoCuenta"));
                cliente.setNumeroCuenta(rs.getInt("NumeroCuenta"));
                lista.add(cliente);
            }
            return lista;
        } catch (Exception e) {
            System.err.println(e);
            return lista;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
