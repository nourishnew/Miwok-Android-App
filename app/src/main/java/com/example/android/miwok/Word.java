package com.example.android.miwok;

import android.content.Context;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;




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
}

