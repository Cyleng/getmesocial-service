package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepository extends MongoRepository<Album, String> {
}
