/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

/**
 *
 * @author 123
 */
interface IUserManager {
    void insert(user user);
    //user getUSer(String name);
    void update(user user);
    void delete(String name);
}
