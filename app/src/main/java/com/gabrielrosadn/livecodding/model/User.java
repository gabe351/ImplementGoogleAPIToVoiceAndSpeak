package com.gabrielrosadn.livecodding.model;

/**
 * Created by gabrielrosa on 02/03/17.
 */

public class User {
    private String mName;
    private String mLastName;

    public User(String name, String lastName){
        mName     = name;
        mLastName = lastName;
    }

    public String getName(){
        return mName;
    }

    public String getLastName(){
        return mLastName;
    }

    public String getFullName(){
        return mName + " " + mLastName;
    }
}
