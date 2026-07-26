package interfaces;

import models.Profile;

public interface PostService {
    void createPost(Profile createdBy, String description);
}
