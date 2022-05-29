package com.example.assignment4.resource;

import com.example.assignment4.model.Comment;
import com.example.assignment4.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Repository("/api/comment")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment)
    {
        return commentService.saveComment(comment);
    }
    @GetMapping("/commentID")
    public List<Comment> getById(@RequestParam(name = "commentID") String commentID)
    {
        return commentService.getById(commentID);
    }
    @PutMapping
    public Comment updateComment(@RequestBody long id, Comment comment)
    {
        return commentService.updateComment(id,comment);
    }
    @DeleteMapping
    public void deleteComment(@RequestParam(name = "commentID") long commentID)
    {
        commentService.deleteComment(commentID);
    }

}
