package interfaces;

import models.Profile;

public interface LikeService {

    void like(Profile createdBy, Likeable likeable);
    void unlike(Profile createdBy, Likeable likeable);
}
