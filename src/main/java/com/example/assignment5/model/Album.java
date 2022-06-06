package com.example.assignment5.model;

import com.example.assignment5.validation.CustomValidation;
import org.hibernate.validator.constraints.Length;

public class Album
{
    private long albumID;
    @Length(max = 10)
    private String name;
    private String description;
    @CustomValidation
    private String createdBy;
    private String coverPicURL;

    public Album(String name, String description, String createdBy, String coverPicURL) {

        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
        this.coverPicURL = coverPicURL;

    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
