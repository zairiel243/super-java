/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avs;

import java.util.Map;
import javax.swing.JOptionPane;
import ui.SuperuserUI;
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
    private static Map<Integer, Users> users;
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
       if( users.get(4).getVoteStatus() == true ||
            users.get(5).getVoteStatus() == true ||
            users.get(6).getVoteStatus() == true ){
            editStatus = false;
       }
    }
    //returns number of voters who already voted
    public int getNoOfActualVoters(){
       if( users.get(4).getVoteStatus() == true){
           noOfActualVoters++;
       }
       
       if( users.get(5).getVoteStatus() == true){
           noOfActualVoters++;
       }
       
       if( users.get(6).getVoteStatus() == true){
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
            
            Users user = getUser(username);

            ret = user.getPassword().equals(password) ? user.getType() : "false";
            
            
        }catch(NullPointerException e){
            ret = "false" ;
        }
          
        return ret;
    }
    
    public static Users getUser(String username){
  
        Users ret = null;
        for( Map.Entry<Integer, Users> entry : users.entrySet()){
            
            if(entry.getValue().getUsername().equals(username) ){
                ret =  entry.getValue();
                break;
            }
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
    
    /**************** OFFICER METHODS ***************/
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
    
    /*************** SUPER USER METHODS ***************/
    
    //add a new officer
    public static void addOfficer(Users newUser){
        users.put(newUser.getID(), newUser);
    }
    
    //remove a officer
    public static void removeOfficer(Users user){
        users.remove(user.getID());
    }
    
    //update an officer
    public static void updateOfficer(Users user){
        users.put(user.getID(), user);
    }
    
    
    //redirect to correct page according to user type
    public static void redirect(String type, String username){
        switch(type){
            case GlobalConstants.SUPERUSER : 
                new SuperuserUI().setVisible(true);
                break;
            case GlobalConstants.OFFICER : 
                new officer_landing(username).setVisible(true);
                break;
            case GlobalConstants.VOTER : 
                new voter_landing_page().setVisible(true);
                break;
            default: HelperClass.infoBox("Incorrect username or password.", "Login Error");
        }
    }
    
    //info box used to display info to user using a dialog box
    public static void infoBox(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage ,
                    titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static int confirmBox(String message){
        return JOptionPane.showConfirmDialog(null, message );
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
