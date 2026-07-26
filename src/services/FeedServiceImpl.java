package services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import interfaces.FeedService;
import models.Post;
import models.Profile;

public class FeedServiceImpl implements FeedService{

    @Override
    public void addToTimeline(Post post, List<Profile> profiles) {
        for(Profile p: profiles){
            p.getTimeLine().getPosts().add(post);
        }
    }

    @Override
    public List<Post> fetchFeed(Profile profile) {
        List<Post> posts = profile.getTimeLine().getPosts();
        List<Post> celebPosts = getCelbPosts(profile);
        return null;
    }
    
    private List<Post> getCelbPosts(Profile profile){
        List<Profile> following = profile.getFollowing();
        List<Post> posts = new ArrayList<>();
        for(Profile f : following){
            if(f.isCelebrity()){
                posts.addAll(getAllPostsFromCelebs(profile.getLastSeen(), f.getPosts()));
            }
        }
        return posts;
    }

    private List<Post> getAllPostsFromCelebs(LocalDateTime lastSeen, List<Post> posts){
        List<Post> newPosts = new ArrayList<>();
        for(Post p: posts){
            if(p.getCreatedAt().isAfter(lastSeen)){
                newPosts.add(p);
            }
        }
        return newPosts;
    }
}
