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
public class TransaccionSQL extends Conexion {

    public boolean registrar(Transaccion transaccion) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "INSERT INTO transacciones (NumeroCliente, NumeroDestino, Monto,"
                + " Fecha, TipoCuenta) VALUES(?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, transaccion.getNumeroCliente());
            ps.setInt(2, transaccion.getIdDestino());
            ps.setFloat(3, transaccion.getMonto());
            ps.setString(4, transaccion.getFecha());
            ps.setString(5, transaccion.getTipoCuenta());
            JOptionPane.showMessageDialog(null, transaccion.getTipoCuenta());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Si se pudo?");
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

    public boolean modificar(Transaccion transaccion) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "UPDATE transacciones SET NumeroCliente=?, idDestino=?, Monto=?, Fecha=? WHERE idTransacciones=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, transaccion.getNumeroCliente());
            ps.setInt(2, transaccion.getIdDestino());
            ps.setFloat(3, transaccion.getMonto());
            ps.setString(4, transaccion.getFecha());
            
            ps.setInt(5, transaccion.getIdTransaccion());
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

    public boolean eliminar(Transaccion transaccion) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "DELETE FROM transacciones WHERE idTransacciones=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, transaccion.getIdTransaccion());
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

    public boolean buscar(Transaccion transaccion) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "SELECT * FROM transacciones WHERE idTransacciones=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, transaccion.getIdTransaccion());
            rs = ps.executeQuery();
            if (rs.next()) {
                transaccion.setIdTransaccion(rs.getInt("idTransacciones"));
                transaccion.setNumeroCliente(rs.getInt("idCliente"));
                transaccion.setIdDestino(rs.getInt("idDestino"));
                transaccion.setMonto(rs.getFloat("Monto"));
                transaccion.setFecha(rs.getString("Fecha"));
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

    public ArrayList<Transaccion> getListaTransferencias(int numeroCliente) {
        ArrayList<Transaccion> lista = new ArrayList<Transaccion>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();
        
        String sql = "SELECT * FROM transacciones WHERE NumeroCliente=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, numeroCliente);
            rs = ps.executeQuery();
            while (rs.next()) {
                Transaccion transacciones = new Transaccion();
                transacciones.setIdTransaccion(rs.getInt("idTransacciones"));
                transacciones.setNumeroCliente(rs.getInt("NumeroCliente"));
                transacciones.setIdDestino(rs.getInt("NumeroDestino"));
                transacciones.setMonto(rs.getFloat("Monto"));
                transacciones.setFecha(rs.getString("Fecha"));
                transacciones.setTipoCuenta(rs.getString("TipoCuenta"));
                lista.add(transacciones);
            }
            JOptionPane.showMessageDialog(null, lista.get(0).getTipoCuenta());
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Salio mall");
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
