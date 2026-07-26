package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import interfaces.Commentable;
import interfaces.Likeable;

public class Post implements Likeable, Commentable{
    String description;
    Profile createdBy;
    List<Like> likes;
    List<Comment> comments;
    LocalDateTime createdAt;


    public Post(String description, Profile createdBy) {
        this.description = description;
        this.createdBy = createdBy;
        this.likes = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.createdAt = LocalDateTime.now();
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

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    
    
    
}
