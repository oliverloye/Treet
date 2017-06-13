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

    public Treet(String mAuthor, String mDescription, Date mCreationDate) {
        this.mAuthor = mAuthor;
        this.mDescription = mDescription;
        this.mCreationDate = mCreationDate;
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

    @Override
    public String toString() {
        return "Treet: " + mDescription + " - @" +mAuthor + ", mCreationDate: " + mCreationDate + '}';
    }
    
    
}
