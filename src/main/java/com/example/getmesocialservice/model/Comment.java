package com.example.getmesocialservice.model;

import nonapi.io.github.classgraph.json.Id;

public class Comment {
    @Id
    private String id;
    private String photoId;

    public Comment(String photoId) {
        this.photoId = photoId;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
}
