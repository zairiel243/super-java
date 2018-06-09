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
public class Candidates extends Users{
    private String position;
    private String party;

    /*
     * Constructor
     */
    public Candidates(String first_name, String last_name, String username, String password, String type, String position, String party) {
        super(first_name, last_name, username, password, type);
        this.position = position;
        this.party = party;
    }
        
    /*
     * Setters
     */
    public void setPosition(String position){
        this.position = position;
    }
    public void setParty(String party){
        this.party = party;
    }
        
    /*
     * Getters
     */
    public String getPosition(){
        return this.position;
    }
    public String getParty(){
        return this.party;
    }
}
