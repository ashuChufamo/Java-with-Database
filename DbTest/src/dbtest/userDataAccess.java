/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 123
 */
public class userDataAccess implements IUserManager{
    Connection connection;
    Statement statment;
    ResultSet resultSet;
    public userDataAccess() throws ClassNotFoundException, SQLException{
         
            // TODO code application logic here
            Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection connection=(com.mysql.jdbc.Connection)DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/store","root","");
            com.mysql.jdbc.Statement statement=(com.mysql.jdbc.Statement) connection.createStatement();
        statment=connection.createStatement();
        
    }

    @Override
    public void insert(user user) {
        
        try {
            String query=String.format("insert into users values('%s','%s')",user.getName(),user.getPassword());
            statment.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(userDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
//
//    @Override
//    public user getUSer(String name) {
//        String query2=String.format("select from users where name=(%s)",name);
//        return statment.execute(query2);
//    }

    @Override
    public void update(user user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String name) {
          try {
            String query2=String.format("delete from users where name=(%s)",name);
            statment.execute(query2);
        } catch (SQLException ex) {
            Logger.getLogger(userDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
    }
}
