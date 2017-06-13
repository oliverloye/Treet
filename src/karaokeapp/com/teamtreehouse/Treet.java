/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karaokeapp.com.teamtreehouse;

import java.util.Date;

/**
 *
 * @author oliverloye
 */
public class Treet {
    private String mAuthor;
    private String mDescription;
    private Date mCreationDate;

    public Treet(String author, String description, Date creationDate) {
        mAuthor = author;
        mDescription = description;
        mCreationDate = creationDate;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmDescription() {
        return mDescription;
    }

    public Date getmCreationDate() {
        return mCreationDate;
    }

    public String[] getWords() {
        return mDescription.toLowerCase().split("[^\\w#@']+");
    }
    
    @Override
    public String toString() {
        return "Treet: " + mDescription + " - @" +mAuthor + ", mCreationDate: " + mCreationDate + '}';
    }
    
    
}
