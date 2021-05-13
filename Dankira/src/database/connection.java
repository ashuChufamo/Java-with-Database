package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    public static Connection getConnection(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dankira","root","");
           return connection;
        }
        catch(Exception e){
            e.getStackTrace();
            return null;
        }
    }
}