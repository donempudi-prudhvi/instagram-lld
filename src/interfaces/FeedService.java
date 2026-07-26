package interfaces;

import java.util.List;

import models.Post;
import models.Profile;

public interface FeedService {
    List<Post> fetchFeed(Profile profile);
    void addToTimeline(Post post, List<Profile> profiles);
}
