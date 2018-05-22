package com.bcs.fsl.filipinosignlanguage;

import android.graphics.drawable.Drawable;

public class Sign {

    public boolean isPicture() {
        return picture;
    }

    public void setPicture(boolean picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Sign(String file, String title){
        setFile(file);
        setTitle(title);
    }

    public boolean picture;
    public String title;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String file;



}
