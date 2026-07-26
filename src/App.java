import java.util.ArrayList;
import java.util.List;

import models.Comment;
import models.Like;
import models.Post;
import models.Profile;
import services.LikeServiceImpl;
import services.PostServiceImpl;

public class App {
    public static void main(String[] args) throws Exception {
        Profile user_1 = new Profile("user_1", "user_1@mail.com", false);
        Profile user_2 = new Profile("user_2", "user_2@mail.com", true);

        List<Profile> followers = new ArrayList<>();
        followers.add(user_2);

        user_1.setFollowers(followers);

        PostServiceImpl postServiceImpl = new PostServiceImpl();
        postServiceImpl.createPost(user_1, "This is the first Post");

        for(Post post: user_2.getTimeLine().getPosts()){
             List<Like> likes = post.getLikes();
             likes.add(new Like(user_2));
        }

        for(Post post: user_2.getTimeLine().getPosts()){
             List<Comment> comments = post.getComments();
             Comment comment= new Comment("Good Post", user_2);
             comments.add(comment);
                for(Comment cmt: post.getComments()){
                    cmt.getReplies().add(new Comment("Yes, this is Good", user_2));
                }
        }
        
        System.out.println("Summary of User 2 Time Line");
        for(Post post: user_2.getTimeLine().getPosts()){
             System.out.println("Likes for the post - "+ post.getDescription()+" : " + post.getLikes().size());
             System.out.println("Comments for the post - "+ post.getDescription());
                for(Comment comment: post.getComments()){
                    System.out.println("\t" + comment.getDescription());
                    System.out.println("\t Replies for: " + comment.getDescription());
                        for(Comment replies: comment.getReplies()){
                            System.out.println("\t\t " + replies.getDescription());
                        }
                }
        }

    }
}
