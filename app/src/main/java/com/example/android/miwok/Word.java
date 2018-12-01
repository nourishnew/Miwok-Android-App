package com.example.android.miwok;

import android.content.Context;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    public Word(String defaultTransition, String miwokTransition, int imageResourceId, int audioResourceId){
        mDefaultTranslation=defaultTransition;
        mMiwokTranslation=miwokTransition;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;

    }
    public Word(String defaultTransition, String miwokTransition,int audioResourceId){
        mDefaultTranslation=defaultTransition;
        mMiwokTranslation=miwokTransition;
        mAudioResourceId=audioResourceId;


    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    public int getimageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}

