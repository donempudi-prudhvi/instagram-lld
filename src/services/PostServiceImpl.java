package services;

import interfaces.FeedService;
import interfaces.PostService;
import models.Post;
import models.Profile;

public class PostServiceImpl implements PostService{

    private final FeedService feedService;

    public PostServiceImpl(FeedService feedService) {
        this.feedService = feedService;
    }

    @Override
    public void createPost(Profile createdBy, String description) {
        Post post = new Post(description, createdBy);
        createdBy.getPosts().add(post);
        if(!createdBy.isCelebrity()){
            this.feedService.addToTimeline(post, createdBy.getFollowers());
        }
    }
    
}
