/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karaokeapp.com;

import java.util.Date;
import karaokeapp.com.teamtreehouse.Treet;

/**
 *
 * @author oliverloye
 */
public class KaraokeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Treet treet = new Treet("oliverloye", "This is my tweet", new Date(1421849702000L));
        System.out.printf("This is a new Treet: %s %n", treet);
    }
    
}
