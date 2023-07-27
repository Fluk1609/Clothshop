/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothproject;
import java.sql.*;
/**
 *
 * @author fluk
 */
public class ClothPrOject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new LoginForm().show();
    }
        public static Connection getConnection(){
        String db_name = "dbcloth";
        String user = "root";
        String pass = "";
        String hostname = "localhost";
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            String url = "jdbc:mysql://"+hostname+"/"+db_name;
            Connection con =DriverManager.getConnection(url, user, pass);
            System.out.println("LOGIN");
            return con;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }   
}
