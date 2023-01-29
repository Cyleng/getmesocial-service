package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;
    public User getOneUser(){
        return resourceRepository.getOneUser();

    }

    public User saveUser(User user) {
        return resourceRepository.saveUser(user);
    }

    public List<User> getAllUsers() {
        return resourceRepository.getAllUsers();
    }

    public User getUserById(int userId) {
        return resourceRepository.getUserById(userId);
    }

    public User updateUser(int userId, User user) {
        return resourceRepository.updateUser(userId, user);
    }

    public User deleteUser(int userId) {
        return resourceRepository.deleteUser(userId);
    }

    public Album saveAlbum(Album album){
        return resourceRepository.saveAlbum(album);
    }

    public List<Album> getAllAlbum(){
        return resourceRepository.getAllAlbums();
    }

    public Album getAlbumById(int albumId){
        return resourceRepository.getAlbumById(albumId);
    }

    public Album updateAlbum(int albumId, Album album){
        return resourceRepository.updateAlbum(albumId, album);
    }

    public Album deleteAlbum(int albumId){
        return resourceRepository.deleteAlbum(albumId);
    }
}
