package interfaces;

import java.util.List;

import models.Comment;

public interface Commentable {
    List<Comment> getComments();
}
