package com.example.assignment4.model;

public class Album
{
    private long albumID;
    private String name;
    private String description;
    private String coverPicURL;

    public Album(String name, String description, String coverPicURL) {

        this.name = name;
        this.description = description;
        this.coverPicURL = coverPicURL;

    }

    public long getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPicURL() {
        return coverPicURL;
    }

    public void setCoverPicURL(String coverPicURL) {
        this.coverPicURL = coverPicURL;
    }
}
