/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author student
 */
public class AVS {

    /**
     * @param args the command line arguments
     */
    public class User{
        private String first_name;
        private String last_name;
        private String username;
        private String password;
        private String type;
        
        /*
         * Constructor
         */
        public User(String first_name, String last_name, String username, String password, String type){
            this.first_name = first_name;
            this.last_name = last_name;
            this.username = username;
            this.password = password;
            this.type = type;
        }
        
        /*
         * Setters
         */
        public void setFirst_name(String first_name){
            this.first_name = first_name;
        }
        public void setLast_name(String last_name){
            this.last_name = last_name;
        }
        public void setUsername(String username){
            this.username = username;
        }
        public void setPassword(String password){
            this.password = password;
        }
        public void setType(String type){
            this.type = type;
        }
        
        /*
         * Getters
         */
        public String getFirst_name(){
            return this.first_name;
        }
        public String getLast_name(){
            return this.last_name;
        }
        public String getUsername(){
            return this.username;
        }
        public String getType(){
            return this.type;
        }
        
    }
    
    public static Map<String, User> users = new HashMap<>();
    
    public boolean checkCredentials(String username, String password){
        boolean flag;
        User user = users.get(username);
        
        if (user == null){
            flag = false;
        }else{
            flag = (password.equals(user.password)); 
        }
        return flag;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
