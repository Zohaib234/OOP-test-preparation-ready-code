
// 04  Composition =>
/*
The composition is a design technique in java to implement a has-a relationship. Java Inheritance is used for code reuse purposes and the same we can do by using composition. The composition is achieved by using an instance variable that refers to other objects. If an object contains the other object and the contained object cannot exist without the existence of that object, then it is called composition. In more specific words composition is a way of describing reference between two or more classes using instance variable and an instance should be created before it is used.
*/

import java.util.*;
import java.io.*;

// real life demonstration

public class composition{

  public static void main(String [] args){
     // Creating the objects of class 1 (Book class)
        // inside main() method
        Book b1
            = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2
            = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference",
                           "Herbert Schildt");
 
        // Creating the list which contains the
        // no. of books.
        List<Book> book = new ArrayList<Book>();
 
        // Adding books to List object
        // using standard add() method
        book.add(b1);
        book.add(b2);
        book.add(b3);
 
        // Creating an object of class 2
        Library library = new Library(book);
 
        // Calling method of class 2 and storing list of
        // books in List Here List is declared of type
        // Books(user-defined)
        List<Book> books
            = library.getListOfBooksInLibrary();
 
        // Iterating over for each loop
        for (Book bk : books) {
 
            // Print and display the title and author of
            // books inside List object
            System.out.println("Title : " + bk.title
                               + " and "
                               + " Author : " + bk.author);
        }
  }
}

// Java program to Illustrate Concept of Composition



// Class 1
// Helper class
// Book class
class Book {

	// Member variables of this class
	public String title;
	public String author;

	// Constructor of this class
	Book(String title, String author)
	{

		// This keyword refers top current instance
		this.title = title;
		this.author = author;
	}
}

// Class 2
// Helper class
// Library class contains list of books.
class Library {

	// Reference to refer to list of books.
	private final List<Book> books;

	// Constructor of this class
	Library(List<Book> books)
	{

		// This keyword refers to current instance itself
		this.books = books;
	}

	// Method of this class
	// Getting the list of books
	public List<Book> getListOfBooksInLibrary()
	{
		return books;
	}
}




