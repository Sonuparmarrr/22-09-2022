package exercises4.inheritanceinterface.bll;

public class Book {
	private String isbn;
	private String name;
	private String Author;
	private double price;
	private int qty=0;


public Book() {
	this.setIsbn(isbn);
	this.setName(name);
	this.setAuthor(Author);
	this.setPrice(price);	
}
public Book(String isbn, String name, String Author,double price,int qty) {
	this.setIsbn(isbn);
	this.setName(name);
	this.setAuthor(Author);
	this.setPrice(price);
	this.setQty(qty);
	
}

		public int getQty() {
			return qty;
}
		public void setQty(int qty) {
			this.qty = qty;
}
		public double getPrice() {
			return price;
}
		public void setPrice(double price) {
			this.price = price;
}
		public String getIsbn() {
			return isbn;
}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
}
		public String getName() {
			return name;
}
		public void setName(String name) {
			this.name = name;
}
		public String getAuthor() {
			return Author;
}
		public void setAuthor(String author) {
			Author = author;
}
		@Override
		public String toString() {
			return"Book[isbn:-"+isbn+",name:-"+name+ ", author:- ["+Author+"],price:-" +price+",qty:-"+qty+"]";
		}

}