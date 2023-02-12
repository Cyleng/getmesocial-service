package com.example.getmesocialservice.resource;
import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController("CommentController")
@RequestMapping("api/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }
    @GetMapping
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

    @PutMapping
    public Comment updateComment(@RequestBody Comment comment){
        return commentService.updateComment(comment);
    }

    @GetMapping("{commentId}")
    public Optional<Comment> getCommentById(@PathVariable("commentId") String commentId){
        return commentService.getCommentById(commentId);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name = "commentId") String commentId){
        commentService.deleteComment(commentId);
    }

}
