package models;

import java.util.ArrayList;
import java.util.List;

import interfaces.Commentable;
import interfaces.Likeable;

public class Comment implements Likeable, Commentable {

    String description;
    Profile createdBy;
    List<Comment> replies;
    List<Like> likes;

    public Comment(String description, Profile createdBy) {
        this.description = description;
        this.createdBy = createdBy;
        this.replies = new ArrayList<>();
        this.likes = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Profile getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(Profile createdBy) {
        this.createdBy = createdBy;
    }
    public List<Comment> getReplies() {
        return replies;
    }
    public void setReplies(List<Comment> replies) {
        this.replies = replies;
    }
    public List<Like> getLikes() {
        return likes;
    }
    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    @Override
    public List<Comment> getComments() {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
