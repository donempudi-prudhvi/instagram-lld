

import models.Comment;
import models.Post;
import models.Profile;
import services.CommentServiceImpl;
import services.FeedServiceImpl;
import services.LikeServiceImpl;
import services.PostServiceImpl;

public class App {
    public static void main(String[] args) throws Exception {
        Profile user_1 = new Profile("user_1", "user_1@mail.com", false);
        Profile user_2 = new Profile("user_2", "user_2@mail.com", true);

        user_2.follow(user_1);

        FeedServiceImpl feedServiceImpl = new FeedServiceImpl();
        PostServiceImpl postServiceImpl = new PostServiceImpl(feedServiceImpl);
        postServiceImpl.createPost(user_1, "This is the first Post");

        LikeServiceImpl likeServiceImpl = new LikeServiceImpl();
        for(Post post: user_2.getTimeLine().getPosts()){
            likeServiceImpl.like(user_2, post);
        }

        for(Post post: user_2.getTimeLine().getPosts()){
            CommentServiceImpl commentServiceImpl = new CommentServiceImpl();
            commentServiceImpl.createComment("Good Post", user_2, post);
            for(Comment cmt: post.getComments()){
                commentServiceImpl.createComment("Yes, this is Good", user_2, cmt);
            }
        }
        
        System.out.println("Summary of User 2 Time Line");
        for(Post post: user_2.getTimeLine().getPosts()){
             System.out.println("Likes for the post - "+ post.getDescription()+" : " + post.getLikes().size());
             System.out.println("Comments for the post - "+ post.getDescription());
                for(Comment comment: post.getComments()){
                    System.out.println("\t" +comment.getDescription());
                    System.out.println("\tReplies for: " + comment.getDescription());
                        for(Comment replies: comment.getReplies()){
                            System.out.println("\t\t"+replies.getDescription());
                        }
                }
        }

    }
}
