package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ProgramPost {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(sdf.parse("21/06/2024 13:03:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Enjoy your journey!");

        post.addComment(comment1);
        post.addComment(comment2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post Post2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        Post2.addComment(c3);
        Post2.addComment(c4);

        System.out.println(post);
        System.out.println(Post2);



    }
}
