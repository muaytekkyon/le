import java.util.ArrayList;

interface Item {
	public void checkout();
		//search for ISBN number, find it, and then remove it from the Array List
	public void returnItem();
		//add ISBN number back to Array List
	public boolean isAvailable();
		//check for ISBN number, see if it is in the Array List
		//each book should have title, author, and ISBN number affiliated with it!	
	}
	
 class Book implements Item{
		public String title;
		public String author;
		public String ISBN;
		public boolean isCheckedOut;
			//check for ISBN number, see if it is in the Array List; this should be updated by the book class when checked out and when returned!
			public Book(String title, String author, String ISBN) {
				this.title = title;
				this.author = author;
				this.ISBN = ISBN;
				this.isCheckedOut = false;
		}
			public void checkout() {
				this.isCheckedOut = true;
			}
			public void returnItem() {
				this.isCheckedOut = false;
			}
			public boolean isAvailable() {
				return !isCheckedOut;		
			}
	
	 class Library {
		
		ArrayList<Book> LibraryBooks = new ArrayList<Book>();
		
		//add book(title, ISBN number, author to Array List
		public void addBook(Book Book) {
			LibraryBooks.add(Book);
			
		}
		public Book findBook(String ISBN) {
			//find book based on ISBN
			for(Book book: LibraryBooks) {
				if(book.ISBN.equals(ISBN)) {
					return book;
				}
			}
			return null;
				
		}
		public void checkoutBook(String ISBN) {
			//find book based on ISBN, remove it; make sure it is marked as removed!
			Book book = findBook(ISBN);
			if (book != null && !book.isCheckedOut) {
				book.checkout();
			}
			else
				System.out.println("This book is not available!");
				
			
				
		}
		public void returnBook(String ISBN) {
			//add ISBN number back to the array
			Book book = findBook(ISBN);
			if (book != null && book.isCheckedOut) {
				book.returnItem();
			}
			else
				System.out.println("This book is not available!");
				
		}
		
		
}
	

		
	}

