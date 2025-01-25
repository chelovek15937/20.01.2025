package bd;

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student 2
 */
public final class DbConnector {

    //Make the Connection Object Accessible by any class
    public static Connection conn;
    private Statement statement;
    String url = "jdbc:mysql://localhost:3306/Kornilov_11?autoReconnect=true&serverTimezone=UTC&useSSL=False";
    String driver = "com.mysql.cj.jdbc.Driver";
    String userName = "root";
    String password = "root";

    //Instantiate the Object
    public static DbConnector db = new DbConnector();

    //Private Prevents from Instantiating the Object from Outside Class
    public DbConnector() {

        try {
            //Class.forName(driver).newInstance();
            DbConnector.conn = (Connection) DriverManager.getConnection(url, userName, password);
        } catch (Exception sql) {
            sql.printStackTrace();
        }
    }

    /*
     * Method to View Data from Table
     * String parameter query receives query
     * Returns ResultSet
     * Throws SQLException
     */
    public ResultSet viewQuery(String query) throws SQLException {
        statement = DbConnector.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        //statement.close();
        return res;
    }

    public ResultSet getLogin(String query, String param1, String param2) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, param1);
        preparedStatement.setString(2, param2);
        ResultSet res = preparedStatement.executeQuery(query);
        return res;
    }

    /*
     * Method to insert,Delete,Update data
     * String parameter query receives query
     * Returns boolean value
     * Throws SQLException
     */
    public int insertDeleteUpdate(String query) throws SQLException {
        statement = DbConnector.conn.createStatement();
        int result = statement.executeUpdate(query);
        return result;
    }

    public void close() throws SQLException {
        DbConnector.conn.close();
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }
}
