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
 * @author jaymezing
 * Last updated : 6-19-18
 * 
 */
public class HelperClass {
    
    /************Variables***************/
    private AVS avsController;
    private Users usersController;
    private static Map<String, Users> users;
    private static Map<Integer, Candidates> candidates;
    private static Map<String, Integer> candidate_count;
    private static boolean editStatus; // check if candidates can still be edited
    private int noOfActualVoters;
    /**********************************/
    
    public HelperClass(){
        avsController = new AVS();
        users = avsController.getUsers();
        candidates = avsController.getCandidates();
        candidate_count = avsController.getCandidateCount();
        editStatus = true;
    }
    
    /**** getters ****/
    
     public Map<String, Users> getUsers(){
        return users;
    }
    
    public Map<Integer, Candidates> getCandidates(){
        return candidates;
    }
    
    public Map<String, Integer> getCandidateCount(){
        return candidate_count;
    }
    
    
    /**** setters ****/
    
    
    
    
    /*** helper methods ****/
    
    //check if maxinum number of candidates per position is satisfied
    public boolean checkMaxNumberOfCandidates(){
        boolean retval = true;
        int max[] = {3,3,10,10,3,3};
        int x = 0;
        
        for( Map.Entry<String, Integer> entry : candidate_count.entrySet()){
            if(entry.getValue() != max[x] ){
                retval = false;
            }
            x++;
        }
        
        return retval;
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
    
    //user validation for login?
    
}
