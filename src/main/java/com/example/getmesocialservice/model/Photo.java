package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Photo {
    @Id
    private String id;
    private String albumId;
    private String photoUrl;
    private String createdBy;
    private Date dateCreated;

    public Photo(String albumId, String photoUrl) {
        this.albumId = albumId;
        this.photoUrl = photoUrl;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
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
