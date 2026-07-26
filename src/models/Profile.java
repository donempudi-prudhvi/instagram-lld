package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Profile {
    
    String username;
    String email;
    boolean isCelebrity;
    List<Profile> followers;
    List<Profile> following;
    LocalDateTime lastSeen;
    List<Post> posts;
    TimeLine timeLine;
    


    public Profile(String username, String email, boolean isCelebrity) {
        this.username = username;
        this.email = email;
        this.isCelebrity = isCelebrity;
        this.followers =  new ArrayList<>();
        this.following = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.timeLine = new TimeLine();
    }

    public void follow(Profile profile){
        this.following.add(profile);
        profile.getFollowers().add(this);
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isCelebrity() {
        return isCelebrity;
    }
    public void setCelebrity(boolean isCelebrity) {
        this.isCelebrity = isCelebrity;
    }
    public List<Profile> getFollowers() {
        return followers;
    }
    public void setFollowers(List<Profile> followers) {
        this.followers = followers;
    }
    public List<Profile> getFollowing() {
        return following;
    }
    public void setFollowing(List<Profile> following) {
        this.following = following;
    }
    public LocalDateTime getLastSeen() {
        return lastSeen;
    }
    public void setLastSeen(LocalDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public TimeLine getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(TimeLine timeLine) {
        this.timeLine = timeLine;
    }
    
    
    


}   
