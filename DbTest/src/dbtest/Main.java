/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 123
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
            IUserManager manager=new userDataAccess();
            user me=new user("heloe","1234");
            //manager.insert(me);
            //manager.delete("heloe");
        }
    }

