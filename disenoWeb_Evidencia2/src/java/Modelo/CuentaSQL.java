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
public class CuentaSQL extends Conexion {

    public String getPermisos(int numeroCliente) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "SELECT * FROM cuenta where NumeroCliente=? and TipoCuenta=?";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, numeroCliente);
            ps.setString(2, "ADMINISTRADOR");

            rs = ps.executeQuery();

            if (rs.next()) {
                return "ADMINISTRADOR";
            }

        } catch (Exception e) {
            System.err.println(e);
        }

        return "USUARIO";
    }

    public Cuenta validar(int numeroCliente, int numeroCuenta) {
        Cuenta cuenta = new Cuenta();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "SELECT * FROM cuenta where NumeroCliente=? and NumeroCuenta=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, numeroCliente);
            ps.setInt(2, numeroCuenta);
            rs = ps.executeQuery();
            while (rs.next()) {
                cuenta.setIdCuenta(rs.getInt("idCliente"));
                cuenta.setNumeroCliente(rs.getInt("NumeroCliente"));
                cuenta.setNumeroCuenta(rs.getInt("NumeroCuenta"));
                cuenta.setTipoCuenta(rs.getString("TipoCuenta"));
                cuenta.setSaldo(rs.getFloat("Saldo"));
                cuenta.setFecha(rs.getString("Fecha"));
            }
            return cuenta;
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return cuenta;
    }

    public boolean validar(int numeroCliente) {
        Cuenta cuenta = new Cuenta();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "SELECT * FROM cliente where NumeroCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, numeroCliente);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
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
        return false;
    }

    public boolean registrarCuenta(Cuenta cuenta) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "INSERT INTO cuenta (NumeroCliente, NumeroCuenta, TipoCuenta,"
                + " Saldo, Fecha) "
                + "VALUES(?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cuenta.getNumeroCliente());
            ps.setInt(2, cuenta.getNumeroCuenta());
            ps.setString(3, cuenta.getTipoCuenta());
            ps.setFloat(4, cuenta.getSaldo());
            ps.setString(5, cuenta.getFecha());
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

    public boolean modificar(Cuenta cuenta, int numeroCuenta, int numeroCliente) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "UPDATE cuenta SET NumeroCliente=?, NumeroCuenta=?, TipoCuenta=?, "
                + "Saldo=?, Fecha=? "
                + "WHERE NumeroCuenta=? and NumeroCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cuenta.getNumeroCliente());
            ps.setInt(2, cuenta.getNumeroCuenta());
            ps.setString(3, cuenta.getTipoCuenta());
            ps.setFloat(4, cuenta.getSaldo());
            ps.setString(5, cuenta.getFecha());

            ps.setInt(6, numeroCuenta);
            ps.setInt(7, numeroCliente);
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

    public ArrayList<Cuenta> getListaCuentas(int numeroCliente) {
        ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "SELECT * FROM cuenta WHERE NumeroCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, numeroCliente);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cuenta cuenta = new Cuenta();
                cuenta.setIdCuenta(rs.getInt("idCuenta"));
                cuenta.setNumeroCliente(rs.getInt("NumeroCliente"));
                cuenta.setNumeroCuenta(rs.getInt("NumeroCuenta"));
                cuenta.setTipoCuenta(rs.getString("TipoCuenta"));
                cuenta.setSaldo(rs.getFloat("Saldo"));
                cuenta.setFecha(rs.getString("Fecha"));
                lista.add(cuenta);
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
    
    public Cuenta buscar(int NumeroCliente, int NumeroCuenta) {
        Cuenta cuenta = new Cuenta();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "SELECT * FROM cuenta where NumeroCliente=? and NumeroCuenta=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, NumeroCliente);
            ps.setInt(2, NumeroCuenta);
            rs = ps.executeQuery();
            if (rs.next()) {
                cuenta.setIdCuenta(rs.getInt("idCuenta"));
                cuenta.setNumeroCliente(rs.getInt("NumeroCliente"));
                cuenta.setNumeroCuenta(rs.getInt("NumeroCuenta"));
                cuenta.setTipoCuenta(rs.getString("TipoCuenta"));
                cuenta.setSaldo(rs.getFloat("Saldo"));
                cuenta.setFecha(rs.getString("Fecha"));
                return cuenta;
            }
            return cuenta;
        } catch (Exception e) {
            System.err.println(e);
            return cuenta;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
