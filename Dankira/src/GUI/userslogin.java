package GUI;

import database.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class userslogin {
 public static boolean  userslogin(String username,String password){
         Connection conn;
    
        conn=connection.getConnection();
    
         PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            
            
            String query="select * from user where username=? and password=?";
             preparedStatement= conn.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
             resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
             return true;
            }
            
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(userslogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
              finally{
      try {
            preparedStatement.close();
            resultSet.close();       
         } 
     
     catch (Exception ex) {
             
         }
     }
    return false;
    }}
