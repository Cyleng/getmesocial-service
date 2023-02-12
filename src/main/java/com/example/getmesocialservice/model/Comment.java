package com.example.getmesocialservice.model;

import nonapi.io.github.classgraph.json.Id;

import java.util.Date;

public class Comment {
    @Id
    private String id;
    private String photoId;

    private String message;
    private String createdBy;
    private Date dateCreated;

    public Comment(String photoId, String message, String createdBy) {
        this.photoId = photoId;
        this.message = message;
        this.createdBy = createdBy;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
