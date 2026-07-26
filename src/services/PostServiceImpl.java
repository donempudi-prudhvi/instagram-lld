package services;

import interfaces.PostService;
import models.Post;
import models.Profile;

public class PostServiceImpl implements PostService{
    FeedServiceImpl feedServiceImpl = new FeedServiceImpl();

    @Override
    public void createPost(Profile createdBy, String description) {
        Post post = new Post(description, createdBy);
        createdBy.getPosts().add(post);
        if(!createdBy.isCelebrity()){
            feedServiceImpl.addToTimeline(post, createdBy.getFollowers());
        }
    }
    
}
