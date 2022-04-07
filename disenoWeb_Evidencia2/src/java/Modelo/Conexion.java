/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.HeadlessException;
import java.sql.*;

/**
 *
 * @author julia
 */
public class Conexion {
    private final String base = "banco";
    private final String user = "root";
    private final String password = "1234";
    private final String url = "JDBC:mysql://localhost:3306/" + base;
    private Connection con = null;

    public Connection getConection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password);
            if (con != null) {
                System.out.println("Conexion Exitosa");
                //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return con;
    }
}
