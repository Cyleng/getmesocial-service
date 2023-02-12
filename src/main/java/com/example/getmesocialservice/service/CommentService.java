package com.example.getmesocialservice.service;
import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.repository.CommnetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service("CommentService")
public class CommentService {
    @Autowired
    private CommnetRepository commnetRepository;

    public Comment saveComment(Comment comment){
        return commnetRepository.save(comment);
    }

    public List<Comment> getAllComments(){
        return commnetRepository.findAll();
    }

    public Comment updateComment(Comment comment){
        return commnetRepository.save(comment);
    }

    public Optional<Comment> getCommentById(String commentId){
        return commnetRepository.findById(commentId);
    }

    public void deleteComment(String commentId){
        commnetRepository.deleteById(commentId);
    }
}
