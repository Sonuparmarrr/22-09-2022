package exercises4.inheritanceinterface.pll;

import exercises4.inheritanceinterface.bll.Author;
import exercises4.inheritanceinterface.bll.Book;

public class TestBook {
	public static void main (String[] args) { 
	Author a1 = new Author("sonu","Sonup657@hotmail.com");
		
		System.out.println("Author ["+a1.toString()+"]");
		Book b1 = new Book("101-201-930","Changes in Life we face","Sonu",102.2,2);
		System.out.println(b1);

	
	}}

