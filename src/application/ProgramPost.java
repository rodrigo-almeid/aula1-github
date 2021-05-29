package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.HourContract;
import entities.Post;

public class ProgramPost {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		Post post2 = new Post
				(sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		
		for (int i=1; i<=2; i++) {
			String comentario = "comentarios";
			Comment comment = new Comment(comentario);
			post1.addComment(comment);
			post2.addComment(comment);
			
		}
		
		
		System.out.println(post1);
		System.out.println(post2);
		
		

	}

}
