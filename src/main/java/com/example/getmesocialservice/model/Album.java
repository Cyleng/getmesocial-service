package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Album {
    @Id
    private String id;
    private String name;
    private String coverPhotoUrl;
    private String createdBy;
    private Date dateCreated;

    public Album(String name, String coverPhotoUrl) {
        this.name = name;
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
