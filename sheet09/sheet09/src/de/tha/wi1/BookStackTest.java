package de.tha.wi1;

public class BookStackTest {

	public static void main(String[] args) {
		
		System.out.println("Creating Books and Author...");
		Author rowling = new Author("Joanne Kathleen", "Rowling");

		Book b1 = new Book("Harry Potter and the Philosopher's Stone", rowling, 1997);
		Book b2 = new Book("Harry Potter and the Chamber of Secrets", rowling, 1998);
		Book b3 = new Book("Harry Potter and the Prisoner of Azkaban", rowling, 1999);
		Book b4 = new Book("Harry Potter and the Goblet of Fire", rowling, 2000);
		Book b5 = new Book("Harry Potter and the Order of the Phoenix", rowling, 2003);
		Book b6 = new Book("Harry Potter and the Half-Blood Prince", rowling, 2005);
		Book b7 = new Book("Harry Potter and the Deathly Hallows", rowling, 2007);

		System.out.println("Creating BookStack...");
		BookStack books = new BookStack(3);

		System.out.println("Calling isEmpty() on BookStack: " + books.isEmpty()); // true

		books.push(b1);
		System.out.println("Calling isEmpty() on BookStack: " + books.isEmpty()); // false
		System.out.println();

		books.push(b2);
		books.push(b3);
		System.out.println("Top of the stack: " + books.top());
		System.out.println();
		
		System.out.println("Add other books unsorted...");
		books.push(b7);
		books.push(b4);
		books.push(b5);
		books.push(b6);

		System.out.println("Unsorted:\n" + books);

		System.out.println("Sorted by Year:\n" + books.getSortedByYear());
		
		System.out.println("Sorted by Title:\n" + books.getSortedByTitle());

		System.out.println("Top of the stack: " + books.top());

		while (!books.isEmpty()) {
			books.pop();
		}

		System.out.println("Calling isEmpty() on Stack: " + books.isEmpty());


	}

}
