/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avs;

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

    /*
     * Constructor
     */
    public Candidates(String first_name, String last_name, String position, String party) {
        this.id = count;
        count++;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.party = party;
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
}
