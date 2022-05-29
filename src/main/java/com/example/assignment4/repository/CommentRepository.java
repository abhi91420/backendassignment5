package com.example.assignment4.repository;

import com.example.assignment4.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentRepository {

    List<Comment> commentList = new ArrayList();

    public static Comment getComment(){
        Comment comment = new Comment(1,"ID1","msg1","ABC","1-1-22");
        return comment;
    }

    public Comment saveComment(Comment comment){

        comment.setId(commentList.size()+1);
        commentList.add(comment);
        return comment;

    }

    public Comment getCommentByID(long id)
    {
        for (Comment comment: commentList){
            if(comment.getId() == id)
            {
                return comment;
            }
        }
        return null;
    }

    public Comment updateComment(long id,Comment comment){

        Comment deletedComment = null;

        for (Comment a : commentList){

            if(a.getId() == id){
                a.setMessage(comment.getMessage());
                a.setCreatedBy(comment.getCreatedBy());
                a.setDateCreated(comment.getDateCreated());
                return a;
            }
        }
        return deletedComment;
    }

    public void deleteById(long id){
        for(Comment comment : commentList){
            if(comment.getId() == id){
                comment.setId(0);
                comment.setDateCreated(null);
                comment.setMessage(null);
                comment.setPhotoId(null);
            }
        }
    }


    public List<Comment> findAllById(String commentID) {
        return commentList;
    }
}
