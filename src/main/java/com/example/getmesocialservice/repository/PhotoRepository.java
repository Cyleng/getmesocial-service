package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
