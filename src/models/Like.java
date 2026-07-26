package models;

public class Like {
    Profile likedBy;
    
    public Like(Profile user){
        this.likedBy = user;
    }
    
    public Profile getLikedBy() {
        return likedBy;
    }

}
