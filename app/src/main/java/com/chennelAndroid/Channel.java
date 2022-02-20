package com.chennelAndroid;

public class Channel {
    private String title;
    private String chaine;
    private String coverImage;

    public Channel(){}

    public Channel(String title, String description, String coverImage) {
        this.title = title;
        this.chaine = chaine;
        this.coverImage = coverImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChaine() {
        return chaine;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

}
