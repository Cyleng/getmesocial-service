package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommnetRepository extends MongoRepository<Comment, String> {
}
