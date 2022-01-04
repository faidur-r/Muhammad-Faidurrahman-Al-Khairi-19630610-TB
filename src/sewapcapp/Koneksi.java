/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewapcapp;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Faidur
 */
public class Koneksi {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/db_warnet";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    
    
    public static Connection Koneksi(){
        try {
            Class.forName(JDBC_DRIVER);
            Connection koneksi = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("koneksi berhasil;");
            return koneksi;
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
            return null;
        }
    }
}
