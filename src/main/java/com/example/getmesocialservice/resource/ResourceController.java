package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/user")
    public User getOneUser(){
        return resourceService.getOneUser();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return resourceService.saveUser(user);
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return resourceService.getAllUsers();
    }
    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable("userId") int userId){
        return resourceService.getUserById(userId);
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@PathVariable("userId") int userId, @RequestBody User user){
        return resourceService.updateUser(userId, user);
    }

    @DeleteMapping("/user/{userId}")
    public User deleteUser(@PathVariable("userId") int userId){
        return resourceService.deleteUser(userId);
    }

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
        return resourceService.saveAlbum(album);
    }

    @GetMapping("/album")
    public List<Album> getAllAlbum(){
        return resourceService.getAllAlbum();
    }

    @GetMapping("/album/{albumId}")
    public Album getAlbumById(@PathVariable("albumId") int albumId){
        return resourceService.getAlbumById(albumId);
    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album album){
        return resourceService.updateAlbum(albumId, album);
    }

    @DeleteMapping("/album/{albumId}")
    public Album deleteAlbum(@PathVariable("albumId") int albumId){
        return resourceService.deleteAlbum(albumId);
    }
}
