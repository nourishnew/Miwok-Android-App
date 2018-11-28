package com.example.android.miwok;

import android.content.Context;

public class Word {

   private String mDefaultTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;



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
   public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

