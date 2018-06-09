/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avs;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author student
 */
public class AVS {

    /**
     * @param args the command line arguments
     **/
    
    /*
     * Superuser
     */
    static Users p1 = new Users("super", "user", "superuser", "password", "Superuser");
    
    /*
     * Officer
     */
    static Users p2 = new Users("officer", "1", "officer1", "password", "Officer");
    static Users p3 = new Users("officer", "2", "officer2", "password", "Officer");
    
    /*
     * Voter
     */
    static Users p4 = new Users("voter", "1", "voter1", "password", "Voter");
    static Users p5 = new Users("voter", "2", "voter2", "password", "Voter");
    static Users p6 = new Users("voter", "3", "voter3", "password", "Voter");
    
    /*
     * Presidents (3)
     */
    
    /*
     * Vice-Presidents (3)
     */
    
    /*
     * Senators (10)
     */
    
    /*
     * Governors (3)
     */
    
    /*
     * Mayors (3)
     */
    
    /*
     * District Representatives (10)
     */
    

    public static Map<String, Users> user = new HashMap<>();
    public static Map<String, Candidates> candidate = new HashMap<>();
    
    public static void main(String[] args) {
        user.put("superuser", p1);
        user.put("officer1", p2);
        user.put("officer2", p3);
        user.put("voter1", p4);
        user.put("voter2", p5);
        user.put("voter3", p6);
    }
}
