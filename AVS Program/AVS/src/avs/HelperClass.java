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
    private static Map<String, Integer> max_candidate_count;
    private static boolean editStatus; // check if candidates can still be edited
    private int noOfActualVoters;
    /**********************************/
    
    public HelperClass(){
        avsController = new AVS();
        users = avsController.getUsers();
        candidates = avsController.getCandidates();
        candidate_count = avsController.getCandidateCount();
        max_candidate_count = avsController.getMaxCandidateCount();
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
    
    public Map<String, Integer> getMaxCandidateCount(){
        return max_candidate_count;
    }
    
    public boolean getEditStatus(){
        return editStatus;
    }
    
    /**** setters ****/
    
    public void setEditStatus(){
        editStatus = false;
    }
    
    
    
    /*** helper methods ****/
    
    //check number of candidates in a specific position
    public boolean canAddCandidateOnPosition(String position){
        return (candidate_count.get(position) < max_candidate_count.get(position));
    }
    
    //check if maxinum number of candidates per position is satisfied
    public boolean checkMaxNumberOfCandidates(){
        int max[] = {3,3,10,10,3,3};
        int x = 0;
        
        for( Map.Entry<String, Integer> entry : candidate_count.entrySet()){
            if(entry.getValue() != max[x] ){
                return false;
            }
            x++;
        }
        
        return true;
    }
    
//    //checks if at least one voter has voted, will set editStatus to false
//    public void checkEditStatus(){
//       if( users.get("voter1").getVoteStatus() == true ||
//            users.get("voter2").getVoteStatus() == true ||
//            users.get("voter3").getVoteStatus() == true ){
//            editStatus = false;
//       }
//    }
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
    public boolean login(String username, String password){
        Users user = users.get(username);
        if(user == null){
            return false;
        }else if(!user.getPassword().equals(password)){
            return false;
        }
        return true;
    }
}
