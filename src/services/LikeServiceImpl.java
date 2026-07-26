package services;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import interfaces.LikeService;
import interfaces.Likeable;
import models.Like;
import models.Profile;

public class LikeServiceImpl implements LikeService{

    @Override
    public void like(Profile createdBy, Likeable likeable) {
        Like like = new Like(createdBy);
        likeable.getLikes().add(like);
    }

    @Override
    public void unlike(Profile createdBy, Likeable likeable) {
        List<Like> allLikes = likeable.getLikes();
        for(Like l:allLikes){
            if(l.getLikedBy() == createdBy){
                allLikes.remove(l);
                return;
            }
        }
        
    }
    
}
