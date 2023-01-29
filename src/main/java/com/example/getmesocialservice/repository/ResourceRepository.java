package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ResourceRepository {

    List<User> userList = new ArrayList<User>();
    List<Album> albumList = new ArrayList<Album>();
    public User getOneUser(){
        User user = new User("CY", "Ca", 20);
        return user;
    }

    public User saveUser(User user) {
        user.setUserId(userList.size()+1);
        userList.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUserById(int userId) {
        for (User user: userList){
            if(user.getUserId() == userId){
                return user;
            }
        }
        return null;
    }

    public User updateUser(int userId, User user) {
        for (User u: userList){
            if(u.getUserId() == userId){
                u.setName(user.getName());
                u.setAddress(user.getAddress());
                u.setAge(user.getAge());
                return u;
            }

        }
        return null;
    }

    public User deleteUser(int userId) {
        User deletedUser = null;
        for (User u:userList){
            if(u.getUserId() == userId){
                deletedUser = u;
                userList.remove(u);
                return deletedUser;
            }
        }

        return deletedUser;
    }


    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size()+1);
        albumList.add(album);
        return album;
    }

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for (Album album: albumList){
            if(album.getAlbumId() == albumId){
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumId, Album album) {
        for (Album a: albumList){
            if(a.getAlbumId() == albumId){
                a.setName(album.getName());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
                return a;
            }

        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for (Album a:albumList){
            if(a.getAlbumId() == albumId){
                deletedAlbum = a;
                albumList.remove(a);
                return deletedAlbum;
            }
        }

        return deletedAlbum;
    }
}
