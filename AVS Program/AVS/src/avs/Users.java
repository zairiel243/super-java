/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avs;

import java.util.Date;

/**
 *
 * @author student
 */
public class Users {
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String type;
    private String added_by;
    private String edited_by;
    private Date date_added;
    private Date date_edited;
    private boolean voteStatus; // check if a voter has voted or not
    private int ID;
    static int count = 1;
    
    /*
     * Constructor
     */
    public Users(String first_name, String last_name, String username,
            String password, String type, String added_by){
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.type = type;
        this.added_by = added_by;
        this.date_added = new Date();
        voteStatus = false;
        ID = count;
        count++;
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
    public void setEdited_by(String edited_by){
        this.edited_by = edited_by;
    }
    public void setDate_edited(){
        this.date_edited = new Date();
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
    public String getPassword(){
        return this.password;
    }
    public String getType(){
        return this.type;
    }
    public String getAdded_by(){
        return this.added_by;
    }
    public Date getDate_added(){
        return this.date_added;
    }
    public String getEdited_by(){
        return this.edited_by;
    }
    public Date getDate_edited(){
        return this.date_edited;
    }
    public boolean getVoteStatus(){
        return voteStatus;
    }
    public int getID(){
        return ID;
    }
}
