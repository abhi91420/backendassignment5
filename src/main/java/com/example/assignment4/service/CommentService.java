package com.example.assignment4.service;

import com.example.assignment4.model.Comment;
import com.example.assignment4.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.saveComment(comment);
    }

    public Comment updateComment(long id,Comment comment) {
        return commentRepository.updateComment(id,comment);
    }

    public void deleteComment(long commentID) {
        commentRepository.deleteById(commentID);
    }

    public List<Comment> getById(String commentID) {
        return commentRepository.findAllById(commentID);
    }

}