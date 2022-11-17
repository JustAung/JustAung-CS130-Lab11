package Lab_11;

public class Publisher {
String name;
String city;
String publisherID;
Author author;
Book book;
Publisher(String name, String city, String publisherID, Author author, Book book){
	this.name=name;
	this.city=city;
	this.publisherID=publisherID;
	this.author=author;
	this.book=book;
}
public static void main(String[] args) {
	Author author = new Author("Aung", "Something Avenue", 18);
	Book book = new Book("CS 101", 20);
	Publisher p = new Publisher("Bellarmine", "Louisville", "Publisher-1", author, book);
	System.out.println("------Publisher Details------");
	System.out.println("Publisher Name: "+p.name);
	System.out.println("Publisher city: "+p.city);
	System.out.println("Publisher ID: "+p.publisherID);
	
	System.out.println("------Author Details------");
	System.out.println("Author Name: "+author.name);
	System.out.println("Author Address: "+author.address);
	System.out.println("Author age: "+author.age);
	
	System.out.println("------Book Details------");
	System.out.println("Book Name: "+book.name);
	System.out.println("Book Price: "+book.price);
}
}
