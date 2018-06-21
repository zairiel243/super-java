/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avs;

import java.util.HashMap;
import java.util.Map;
import avs.GlobalConstants;

/** History
 *
 * @author John Paul Jayme
 * Last updated : 6-19-18
 * Added comments to each variable and some operations.
 * Updated variable names for meaning.
 * Added setters and getters
 * 
 */
public class AVS {

    /**
     * @param args the command line arguments
     **/
    
   
    
    /*
     * Superuser
     */
    public static Users p1 = new Users("super", "user", "superuser", "password",
            GlobalConstants.SUPERUSER, "God");
    
    /*
     * Officer
     */
    public static Users p2 = new Users("officer", "1", "officer1", "password", 
            GlobalConstants.OFFICER, "superuser");
    public static Users p3 = new Users("officer", "2", "officer2", "password", 
            GlobalConstants.OFFICER, "superuser");
    
    /*
     * Voter
     */
    public static Users p4 = new Users("voter", "1", "voter1", "password", 
            GlobalConstants.VOTER, "superuser");
    public static Users p5 = new Users("voter", "2", "voter2", "password", 
            GlobalConstants.VOTER, "superuser");
    public static Users p6 = new Users("voter", "3", "voter3", "password", 
            GlobalConstants.VOTER, "superuser");
    
    /*
     * Presidents (3)
     */
    public static Candidates p7 = new Candidates("Lucius Annaeus", 
            "Seneca", "President", "Stoicism", "officer1");
    public static Candidates p8 = new Candidates("Adolf", "Hitler", 
            "President", "Nazi", "officer2");
    public static Candidates p9 = new Candidates("Joseph", "Stalin", 
            "President", "Communist", "officer1");
    
    /*
     * Vice-Presidents (3)
     */
    public static Candidates p10 = new Candidates("Marcus", "Aurelius", 
            "Vice-President", "Stoicism", "officer2");
    public static Candidates p11 = new Candidates("Franz", "von Papen", 
            "Vice-President", "Nazi", "officer1");
    public static Candidates p12 = new Candidates("Sergei", "Kirov", 
            "Vice-President", "Communist", "officer2");
    
    /*
     * Senators (10)
     */
    public static Candidates p13 = new Candidates("Gaius Mosonius", 
            "Rufus", "Senator", "Stoicism", "officer1");
    public static Candidates p14 = new Candidates("Rubellius", 
            "Plautus", "Senator", "Stoicism", "officer2");
    public static Candidates p15 = new Candidates("Publius", 
            "Paetus", "Senator", "Stoicism", "officer1");
    
    public static Candidates p16 = new Candidates("Julius", 
            "Schreck", "Senator", "Nazi", "officer2");
    public static Candidates p17 = new Candidates("Joseph", 
            "Berchtold", "Senator", "Nazi", "officer1");
    public static Candidates p18 = new Candidates("Erhard", 
            "Heiden", "Senator", "Nazi", "officer2");
    
    public static Candidates p19 = new Candidates("Georgy", "Malenkov", 
            "Senator", "Communist", "officer1");
    public static Candidates p20 = new Candidates("Nikita", 
            "Khrushchev", "Senator", "Communist", "officer2");
    public static Candidates p21 = new Candidates("Leonid", "Brezhnev", 
            "Senator", "Communist", "officer1");
    public static Candidates p22 = new Candidates("Yuri", "Andropov", 
            "Senator", "Communist", "officer2");
    
    /*
     * Governors (3)
     */
    public static Candidates p23 = new Candidates("Zeno", "of Citium",
            "Governor", "Stoicism", "officer1");
    public static Candidates p24 = new Candidates("Heinrich", "Himmler",
            "Governor", "Nazi", "officer2");
    public static Candidates p25 = new Candidates("Konstantin", "Chernenko",
            "Governor", "Communist", "officer1");
    
    /*
     * Mayors (3)
     */
    public static Candidates p26 = new Candidates("Aratus", "of Soli",
            "Mayor", "Stoicism", "officer2");
    public static Candidates p27 = new Candidates("Karl", "Hanke",
            "Mayor", "Nazi", "officer1");
    public static Candidates p28 = new Candidates("Mikhail", "Kalinin",
            "Mayor", "Communist", "officer2");
    
    /*
     * District Representatives (10)
     */
    public static Candidates p29 = new Candidates("Aristo", "of Chios",
            "District Representative", "Stoicism", "officer1");
    public static Candidates p30 = new Candidates("Dionysius", "the Renegade",
            "District Representative", "Stoicism", "officer2");
    public static Candidates p31 = new Candidates("Herillus", "of Carthage",
            "District Representative", "Stoicism", "officer1");
    
    public static Candidates p32 = new Candidates("Kurt", "Daluege",
            "District Representative", "Nazi", "officer2");
    public static Candidates p33 = new Candidates("Sepp", "Dietrich",
            "District Representative", "Nazi", "officer1");
    public static Candidates p34 = new Candidates("Paul", "Hausser",
            "District Representative", "Nazi", "officer2");
    
    public static Candidates p35 = new Candidates("Lev", "Kamenev",
            "District Representative", "Communist", "officer1");
    public static Candidates p36 = new Candidates("Grogiry", "Zinoviev",
            "District Representative", "Communist", "officer2");
    public static Candidates p37 = new Candidates("Lavrentiy", "Beria",
            "District Representative", "Communist", "officer1");
    public static Candidates p38 = new Candidates("Alexei", "Kosygin",
            "District Representative", "Communist", "officer2");

    /****** Variables ********************************************************/
    private static Map<String, Users> users = new HashMap<>();
    private static Map<Integer, Candidates> candidates = new HashMap<>();
    private static Map<String, Integer> candidate_count = new HashMap<>();
    private static Map<String, Integer> max_candidate_count = new HashMap<>();
    /***********************************************************************/
    
    public static boolean canAddCandidateOnPosition(String position){
        return (candidate_count.get(position) < max_candidate_count.get(position));
    }
    
    //check if maxinum number of candidates per position is satisfied
    public static boolean checkMaxNumberOfCandidates(){
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
    
    /*public static String login(String username, String password){
        String ret = "false";
        Users user = users.get(username);
        if(user == null){
            return ret;
        }else if(!user.getPassword().equals(password)){
            return ret;
        }
        return user.getType();
    }*/
    
    public static void main(String[] args) {
        
       
       // AVS avs = new AVS();
        //avs.populate(avs);
       
 
    }
    public static void populate(){
         //Populate users
        AVS.setUsers();
        //Populate candidates
        AVS.setCandidates();
        //Populate candidate count per category
        AVS.setCandidateCount();
        //Populate max candidate count
        AVS.setMaxCandidateCount();
    }
    

    /*** getters
     * @return  ***/
    
    public static Map<String, Users> getUsers(){
        return users;
    }
    
    public static Map<Integer, Candidates> getCandidates(){
        return candidates;
    }
    
    public static Map<String, Integer> getCandidateCount(){
        return candidate_count;
    }
    
    public static Map<String, Integer> getMaxCandidateCount(){
        return max_candidate_count;
    }
    
    

    
    /**** setters ****/
    private static void setUsers(){
        
        users.put("superuser", p1);
        users.put("officer1", p2);
        users.put("officer2", p3);
        users.put("voter1", p4);
        users.put("voter2", p5);
        users.put("voter3", p6);
    
    }
    
    private static void setCandidates(){
        
        candidates.put(p7.getId(), p7);
        candidates.put(p8.getId(), p8);
        candidates.put(p9.getId(), p9);
        candidates.put(p11.getId(), p11);
        candidates.put(p12.getId(), p12);
        candidates.put(p13.getId(), p13);
        candidates.put(p14.getId(), p14);
        candidates.put(p15.getId(), p15);
        candidates.put(p16.getId(), p16);
        candidates.put(p17.getId(), p17);
        candidates.put(p18.getId(), p18);
        candidates.put(p19.getId(), p19);
        candidates.put(p20.getId(), p20);
        candidates.put(p21.getId(), p21);
        candidates.put(p22.getId(), p22);
        candidates.put(p23.getId(), p23);
        candidates.put(p24.getId(), p24);
        candidates.put(p25.getId(), p25);
        candidates.put(p26.getId(), p26);
        candidates.put(p27.getId(), p27);
        candidates.put(p28.getId(), p28);
        candidates.put(p29.getId(), p29);
        candidates.put(p30.getId(), p30);
        candidates.put(p31.getId(), p31);
        candidates.put(p32.getId(), p32);
        candidates.put(p33.getId(), p33);
        candidates.put(p34.getId(), p34);
        candidates.put(p35.getId(), p35);
        candidates.put(p36.getId(), p36);
        candidates.put(p37.getId(), p37);
        candidates.put(p38.getId(), p38);
        
    }
    
    private static void setCandidateCount(){
        
        candidate_count.put("President", 3);
        candidate_count.put("Vice-President", 3);
        candidate_count.put("Senators", 10);
        candidate_count.put("District Representative", 10);
        candidate_count.put("Governor", 3);
        candidate_count.put("Mayor", 3);
        
    }
    
    private static void setMaxCandidateCount(){
        
        max_candidate_count.put("President", 3);
        max_candidate_count.put("Vice-President", 3);
        max_candidate_count.put("Senators", 10);
        max_candidate_count.put("District Representative", 10);
        max_candidate_count.put("Governor", 3);
        max_candidate_count.put("Mayor", 3);
        
    }
 
    
}
