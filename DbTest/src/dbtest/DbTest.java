/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 123
 */
public class DbTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try {
            // TODO code application logic here
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ashu","root","");
            Statement statement=(Statement) connection.createStatement();
            statement.execute("create table asdf( h char(1) , primary key (h));");
            
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
}
