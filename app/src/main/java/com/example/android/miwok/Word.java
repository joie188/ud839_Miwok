package com.example.android.miwok;

/**
 * Created by Joie on 1/1/2017.
 */

public class Word {

    private String chinese;
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int audioResourceID;

    public Word(String defaults, String miwok, int audio, String chingchong) {
        defaultTranslation = defaults;
        miwokTranslation = miwok;
        audioResourceID = audio;
        chinese = chingchong;
    }

    public Word(String defaults, String miwok, int img, int audio, String chingchong) {
        defaultTranslation = defaults;
        miwokTranslation = miwok;
        imageResourceID = img;
        audioResourceID = audio;
        chinese = chingchong;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResourceID() { return imageResourceID; }

    public int getAudioResourceID() {
        return audioResourceID;
    }

    public String getChinese() { return chinese; }

    public boolean hasImage() {
        return imageResourceID != NO_IMAGE_PROVIDED;
    }
}
