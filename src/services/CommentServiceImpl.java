package services;

import interfaces.CommentService;
import interfaces.Commentable;
import models.Comment;
import models.Profile;

public class CommentServiceImpl implements CommentService {

    @Override
    public void createComment(String description, Profile createdBy, Commentable commentable) {
        Comment comment = new Comment(description, createdBy);
        commentable.getComments().add(comment);
    }
    
}
