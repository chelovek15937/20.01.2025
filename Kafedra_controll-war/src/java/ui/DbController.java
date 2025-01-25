/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import bd.DbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Student 2
 */
public class DbController {

    DbConnector conn;

    public DbController() {
        conn = DbConnector.db;
        ResultSet resultSet;
    }

    public void Write() {
        ResultSet resultSet;
        String sql = "Insert into book (name, author, category, year, price) Values ('" + "To Do Write Her" + "' , '" + "To Do Write Her" + "' , '" + "To Do Write Her" + "' , '" + "To Do Write Her" + "' , '" + "To Do Write Her" + "')";
        System.out.println(sql);
        try {
            int i = conn.insertDeleteUpdate(sql);
            System.out.println("i=" + i);

        } catch (SQLException ex) {
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conn.close();
            } catch (SQLException ex1) {
                Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
}
