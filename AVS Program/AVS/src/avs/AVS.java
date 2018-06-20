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
    public static Users p1 = new Users("super", "user", "superuser", "password", "Superuser", "God");
    
    /*
     * Officer
     */
    public static Users p2 = new Users("officer", "1", "officer1", "password", "Officer", "superuser");
    public static Users p3 = new Users("officer", "2", "officer2", "password", "Officer", "superuser");
    
    /*
     * Voter
     */
    public static Users p4 = new Users("voter", "1", "voter1", "password", "Voter", "superuser");
    public static Users p5 = new Users("voter", "2", "voter2", "password", "Voter", "superuser");
    public static Users p6 = new Users("voter", "3", "voter3", "password", "Voter", "superuser");
    
    /*
     * Presidents (3)
     */
    public static Candidates p7 = new Candidates("Lucius Annaeus", "Seneca", "President", "Stoicism", "officer1");
    public static Candidates p8 = new Candidates("Adolf", "Hitler", "President", "Nazi", "officer2");
    public static Candidates p9 = new Candidates("Joseph", "Stalin", "President", "Communist", "officer1");
    
    /*
     * Vice-Presidents (3)
     */
    public static Candidates p10 = new Candidates("Marcus", "Aurelius", "Vice-President", "Stoicism", "officer2");
    public static Candidates p11 = new Candidates("Franz", "von Papen", "Vice-President", "Nazi", "officer1");
    public static Candidates p12 = new Candidates("Sergei", "Kirov", "Vice-President", "Communist", "officer2");
    
    /*
     * Senators (10)
     */
    public static Candidates p13 = new Candidates("Gaius Mosonius", "Rufus", "Senator", "Stoicism", "officer1");
    public static Candidates p14 = new Candidates("Rubellius", "Plautus", "Senator", "Stoicism", "officer2");
    public static Candidates p15 = new Candidates("Publius", "Paetus", "Senator", "Stoicism", "officer1");
    
    public static Candidates p16 = new Candidates("Julius", "Schreck", "Senator", "Nazi", "officer2");
    public static Candidates p17 = new Candidates("Joseph", "Berchtold", "Senator", "Nazi", "officer1");
    public static Candidates p18 = new Candidates("Erhard", "Heiden", "Senator", "Nazi", "officer2");
    
    public static Candidates p19 = new Candidates("Georgy", "Malenkov", "Senator", "Communist", "officer1");
    public static Candidates p20 = new Candidates("Nikita", "Khrushchev", "Senator", "Communist", "officer2");
    public static Candidates p21 = new Candidates("Leonid", "Brezhnev", "Senator", "Communist", "officer1");
    public static Candidates p22 = new Candidates("Yuri", "Andropov", "Senator", "Communist", "officer2");
    
    /*
     * Governors (3)
     */
    public static Candidates p23 = new Candidates("Zeno", "of Citium", "Governor", "Stoicism", "officer1");
    public static Candidates p24 = new Candidates("Heinrich", "Himmler", "Governor", "Nazi", "officer2");
    public static Candidates p25 = new Candidates("Konstantin", "Chernenko", "Governor", "Communist", "officer1");
    
    /*
     * Mayors (3)
     */
    public static Candidates p26 = new Candidates("Aratus", "of Soli", "Mayor", "Stoicism", "officer2");
    public static Candidates p27 = new Candidates("Karl", "Hanke", "Mayor", "Nazi", "officer1");
    public static Candidates p28 = new Candidates("Mikhail", "Kalinin", "Mayor", "Communist", "officer2");
    
    /*
     * District Representatives (10)
     */
    public static Candidates p29 = new Candidates("Aristo", "of Chios", "District Representative", "Stoicism", "officer1");
    public static Candidates p30 = new Candidates("Dionysius", "the Renegade", "District Representative", "Stoicism", "officer2");
    public static Candidates p31 = new Candidates("Herillus", "of Carthage", "District Representative", "Stoicism", "officer1");
    
    public static Candidates p32 = new Candidates("Kurt", "Daluege", "District Representative", "Nazi", "officer2");
    public static Candidates p33 = new Candidates("Sepp", "Dietrich", "District Representative", "Nazi", "officer1");
    public static Candidates p34 = new Candidates("Paul", "Hausser", "District Representative", "Nazi", "officer2");
    
    public static Candidates p35 = new Candidates("Lev", "Kamenev", "District Representative", "Communist", "officer1");
    public static Candidates p36 = new Candidates("Grogiry", "Zinoviev", "District Representative", "Communist", "officer2");
    public static Candidates p37 = new Candidates("Lavrentiy", "Beria", "District Representative", "Communist", "officer1");
    public static Candidates p38 = new Candidates("Alexei", "Kosygin", "District Representative", "Communist", "officer2");

    public static Map<String, Users> user = new HashMap<>();
    public static Map<Integer, Candidates> candidate = new HashMap<>();
    public static Map<String, Integer> candidate_count = new HashMap<>();
    
    public static void main(String[] args) {
        user.put("superuser", p1);
        user.put("officer1", p2);
        user.put("officer2", p3);
        user.put("voter1", p4);
        user.put("voter2", p5);
        user.put("voter3", p6);
        
        candidate.put(p7.getId(), p7);
        candidate.put(p8.getId(), p8);
        candidate.put(p9.getId(), p9);
        candidate.put(p11.getId(), p11);
        candidate.put(p12.getId(), p12);
        candidate.put(p13.getId(), p13);
        candidate.put(p14.getId(), p14);
        candidate.put(p15.getId(), p15);
        candidate.put(p16.getId(), p16);
        candidate.put(p17.getId(), p17);
        candidate.put(p18.getId(), p18);
        candidate.put(p19.getId(), p19);
        candidate.put(p20.getId(), p20);
        candidate.put(p21.getId(), p21);
        candidate.put(p22.getId(), p22);
        candidate.put(p23.getId(), p23);
        candidate.put(p24.getId(), p24);
        candidate.put(p25.getId(), p25);
        candidate.put(p26.getId(), p26);
        candidate.put(p27.getId(), p27);
        candidate.put(p28.getId(), p28);
        candidate.put(p29.getId(), p29);
        candidate.put(p30.getId(), p30);
        candidate.put(p31.getId(), p31);
        candidate.put(p32.getId(), p32);
        candidate.put(p33.getId(), p33);
        candidate.put(p34.getId(), p34);
        candidate.put(p35.getId(), p35);
        candidate.put(p36.getId(), p36);
        candidate.put(p37.getId(), p37);
        candidate.put(p38.getId(), p38);
        
        candidate_count.put("President", 3);
        candidate_count.put("Vice-President", 3);
        candidate_count.put("Senators", 10);
        candidate_count.put("District Representative", 10);
        candidate_count.put("Governor", 3);
        candidate_count.put("Mayor", 3);
    }
}
