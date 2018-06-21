/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avs;

import java.util.Map;
import javax.swing.JOptionPane;
import ui.officer_landing;
import ui.voter_landing_page;

/**
 *
 * @author John Paul Jayme
 * Last updated : 6-21-18
 * Added new methods. Fixed errors on accessing static variables
 * and methods
 */
public class HelperClass {
    
    /************Variables***************/
    private static Map<String, Users> users;
    private static Map<Integer, Candidates> candidates;
    private static Map<String, Integer> candidate_count;
    private static Map<String, Integer> max_candidate_count;
    private static boolean editStatus; // check if candidates can still be edited
    private static int noOfActualVoters;
    /**********************************/
    
    public HelperClass(){

    }
    
        
    /**** getters
     * @return  ****/
    
    
    public boolean getEditStatus(){
        return editStatus;
    }
    
    /**** setters ****/
    
    public void setEditStatus(){
        editStatus = false;
    }
    
    
    
    /*** helper methods ****/

    
    //check number of candidates in a specific position
    public static boolean canAddCandidateOnPosition(String position){
        return (candidate_count.get(position) < max_candidate_count.get(position));
    }
    
    //check if maxinum number of candidates per position is satisfied
    public static boolean checkMaxNumberOfCandidates(){
        int max[] = {GlobalConstants.MAX_PRESIDENT, GlobalConstants.MAX_VICEPRESIDENT,
            GlobalConstants.MAX_SENATOR, GlobalConstants.MAX_DISTRICTREP,
            GlobalConstants.MAX_GOVERNOR, GlobalConstants.MAX_MAYOR
        };
        int x = 0;
        
        for( Map.Entry<String, Integer> entry : candidate_count.entrySet()){
            if(entry.getValue() != max[x] ){
                return false;
            }
            x++;
        }
        
        return true;
    }
    
    //checks if at least one voter has voted, will set editStatus to false
    public void checkEditStatus(){
       if( users.get("voter1").getVoteStatus() == true ||
            users.get("voter2").getVoteStatus() == true ||
            users.get("voter3").getVoteStatus() == true ){
            editStatus = false;
       }
    }
    //returns number of voters who already voted
    public int getNoOfActualVoters(){
       if( users.get("voter1").getVoteStatus() == true){
           noOfActualVoters++;
       }
       
       if( users.get("voter2").getVoteStatus() == true){
           noOfActualVoters++;
       }
       
       if( users.get("voter3").getVoteStatus() == true){
          noOfActualVoters++;
       }
       
       return noOfActualVoters;
    }
    
    //Update vote counts of candidates given the submitted votes by user
    public void updateCandidateVoteCount(){
        
    }
    
    //user validation for login
    public static String login(String username, String password){

        String ret;
        try{
            Users user = users.get(username);
            
            ret = user.getPassword().equals(password) ? user.getType() : "false";
        }catch(NullPointerException e){
            ret = "false" ;
        }
          
        return ret;
    }
    
    //check last name of a candidate 
    //returns true if there is an existing candidate with 
    public static boolean checkCandidate(String fname, String lname){
        boolean ret = false;
        
        for( Map.Entry<Integer, Candidates> entry : candidates.entrySet()){
            if(entry.getValue().getLast_name().equalsIgnoreCase(fname.toLowerCase())
                && entry.getValue().getFirst_name().equalsIgnoreCase(lname.toLowerCase())
            ){
                ret = true;
            }
        }
        
        return ret;
    }
    
    //add a new candidate
    public static void addCandidate(Candidates newCandidate){
        candidates.put(newCandidate.getId(), newCandidate);
    }
    
    //remove a candidate
    public static void removeCandidate(Candidates candidate){
        candidates.remove(candidate.getId());
    }
    
    //update a candidate
    public static void updateCandidate(Candidates candidate){
        candidates.put(candidate.getId(), candidate);
    }
    
    //redirect to correct page according to user type
    public static void redirect(String type, String username){
        switch(type){
            case GlobalConstants.SUPERUSER : new voter_landing_page().setVisible(true);
                break;
            case GlobalConstants.OFFICER : 
                new officer_landing(username).setVisible(true);
                break;
            case GlobalConstants.VOTER : 
                break;
            default: HelperClass.infoBox("User not found", "Login Error");
        }
    }
    
    //info box used to display info to user using a dialog box
    public static void infoBox(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage ,
                    titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    //initialize local static variables from AVS class.
    public static void setHelperClass(){
        users = AVS.getUsers();
        candidates = AVS.getCandidates();
        candidate_count = AVS.getCandidateCount();
        max_candidate_count = AVS.getMaxCandidateCount();
        editStatus = true;
    }
}
