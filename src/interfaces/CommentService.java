package interfaces;

import models.Profile;

public interface CommentService {
    void createComment(String description, Profile createdBy, Commentable commentable);
    
}
