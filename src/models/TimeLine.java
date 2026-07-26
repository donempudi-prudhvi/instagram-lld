package models;

import java.util.ArrayList;
import java.util.List;

public class TimeLine {
    private List<Post> posts;

    public TimeLine(){
        this.posts = new ArrayList<>();
    }
    public List<Post> getPosts(){
        return this.posts;
    }
    public void setPosts(List<Post> posts){
        this.posts = posts;
    }
}
