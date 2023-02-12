package com.example.getmesocialservice.resource;
import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/photos")
public class PhotoController {
    @Autowired
    private PhotoService photoService;

    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }

    @GetMapping
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }

    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }

    @GetMapping("{photoId}")
    public Optional<Photo> getPhotoById(@PathVariable("photoId") String photoId){
        return photoService.getPhotoById(photoId);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "photoId") String photoId){
        photoService.deletePhoto(photoId);
    }

}
