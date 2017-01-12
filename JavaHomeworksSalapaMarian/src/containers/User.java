/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author MMM
 */
public class User {
    int user_id;
    String user_name;
    static int noOfUsers=0;

    public User(String user_name) {
        noOfUsers++;
        this.user_id = 1000+noOfUsers;
        this.user_name = user_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    
    
}
