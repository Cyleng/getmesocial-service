package com.example.getmesocialservice.service;
import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service("AlbumService")
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;

    public  Album saveAlbum(com.example.getmesocialservice.model.Album album){
        return albumRepository.save(album);
    }

    public List<Album> getAllAlbums(){
        return albumRepository.findAll();
    }

    public Album updateAlbum(Album album){
        return albumRepository.save(album);
    }

    public Optional<Album> getAlbumById(String albumId){
        return albumRepository.findById(albumId);
    }

    public void deleteAlbum(String albumId){
        albumRepository.deleteById(albumId);
    }
}
