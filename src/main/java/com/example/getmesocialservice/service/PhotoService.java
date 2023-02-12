package com.example.getmesocialservice.service;
import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service("PhotoService")
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;

    public Photo savePhoto(Photo photo){
        return photoRepository.save(photo);
    }

    public List<Photo> getAllPhotos(){
        return photoRepository.findAll();
    }

    public Photo updatePhoto(Photo photo){
        return photoRepository.save(photo);
    }

    public Optional<Photo> getPhotoById(String photoId){
        return photoRepository.findById(photoId);
    }

    public void deletePhoto(String photoId){
        photoRepository.deleteById(photoId);
    }
}
