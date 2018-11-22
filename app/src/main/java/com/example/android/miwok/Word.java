package com.example.android.miwok;

import android.content.Context;

public class Word {

   private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;




    public Word(String defaultTransition, String miwokTransition, int imageResourceId){
        mDefaultTranslation=defaultTransition;
        mMiwokTranslation=miwokTransition;
        mImageResourceId=imageResourceId;

    }
    public Word(String defaultTransition, String miwokTransition){
        mDefaultTranslation=defaultTransition;
        mMiwokTranslation=miwokTransition;


    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getimageResourceId() {
        return mImageResourceId;
    }
}

