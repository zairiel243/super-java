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
public class Candidates{
    static int count = 1;
    private int id;
    private String first_name;
    private String last_name;
    private String position;
    private String party;
    private String added_by;
    private String edited_by;
    private Date date_added;
    private Date date_edited;
    private int votes;
    

    /*
     * Constructor
     */
    public Candidates(String first_name, String last_name, String position, String party, String added_by) {
        this.id = count;
        count++;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.party = party;
        this.votes = 0;
        this.added_by = added_by;
        this.date_added = new Date();
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
    public void setPosition(String position){
        this.position = position;
    }
    public void setParty(String party){
        this.party = party;
    }
    public void setEdited_by(String edited_by){
        this.edited_by = edited_by;
    }
    public void setDate_edited(){
        this.date_edited = new Date();
    }
    public void setVotes(){
        this.votes++;
    }
        
    /*
     * Getters
     */
    public int getId(){
        return this.id;
    }
    public String getFirst_name(){
        return this.first_name;
    }
    public String getLast_name(){
        return this.last_name;
    }
    public String getPosition(){
        return this.position;
    }
    public String getParty(){
        return this.party;
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
    public int getVotes(){
        return this.votes;
    }
}
