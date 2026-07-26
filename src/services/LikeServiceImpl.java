package services;

import java.util.ArrayList;
import java.util.List;

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
        List<Like> likesToRemove = new ArrayList<>();

        for(Like l:allLikes){
            if(l.getLikedBy() == createdBy){
                likesToRemove.add(l);
                break; 
            }
        }
        if(likesToRemove.size()>0)
            allLikes.remove(likesToRemove.get(0));
        
    }
    
}
