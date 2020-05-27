____Book Class____

public class Book {
  
	int stockNumber;
	String author;
	String title;
	double price;
	int totalPages;
  
	public int getStockNumber() {
	return stockNumber;
	}
  
	public void setStockNumber(int stockNumber) {
	this.stockNumber = stockNumber;
	}
  
	public String getAuthor() {
	return author;
	}
  
	public void setAuthor(String author) {
	this.author = author;
	}
  
	public String getTitle() {
	return title;
	}
  
	public void setTitle(String title) {
	this.title = title;
	}
  
	public double getPrice() {
	return price;
	}
  
	public void setPrice(double price) {
	this.price = price;
	}
  
	public int getTotalPages() {
	return totalPages;
	}
  
	public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
	}
  
	public Book() {
	super();
	}
  
	public Book(int stockNumber, String author, String title, double price, int pages) {
	super();
      
	this.stockNumber = stockNumber;
	this.author = author;
	this.title = title;
	this.price = price;
	this.totalPages = totalPages;
	}
}

____Array of Books____

import java.util.Scanner;

public class ArrayOfBooks {
  
  public static void main(String[] args) {

       Book[] books = new Book[3];
       Scanner reader = new Scanner(System.in);
    
       String author = "";
       String title = "";
       int totalPages = 0;
       int stockNumber = 0;
       double price = 0;
    
       for (int i = 0; i < books.length; i++) {
         
           System.out.print("Enter Book's Author: ");
           author = reader.nextLine();
         
           System.out.print("Enter Book's Title: ");
           title = reader.nextLine();
         
           System.out.print("Enter Total Number of pages: ");
           totalPages = Integer.parseInt(reader.nextLine());
         
           System.out.print("Enter Quantity in Stock: ");
           stockNumber = Integer.parseInt(reader.nextLine());
         
           System.out.print("Enter Book's Price: $");
           price = Double.parseDouble(reader.nextLine());
         
           Book bookArray = new Book ();

           bookArray.setAuthor(author);
           bookArray.setTitle(title);
           bookArray.setTotalPages(totalPages);
           books[i] = bookArray;
           System.out.println();
       }
    
       reader.close();
       for (int i = 0; i < books.length; i++) {
         
           Book book = books[i];

           System.out.println("Book Details:");
           System.out.println("Author: " + book.getAuthor());
           System.out.println("Title: " + book.getTitle());
           System.out.println("Number of pages: " + book.getTotalPages());
           System.out.println("Stock Number: " + book.getStockNumber());
           System.out.println("Price: $" + book.getPrice());
           System.out.println();
       }
   }
}