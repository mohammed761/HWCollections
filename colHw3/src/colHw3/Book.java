package colHw3;

public class Book<T> {
    private String title;
    private String author;
    private double price;
    private int yearPublished;
    private T id;
	public Book(T id) {
		if(id instanceof Integer) {
			this.yearPublished = (int) id;
		}
		else if(id instanceof Double) {
			this.price = (double) id;
		}
		else {
			String[] parts = splitStringByWord((String)id, "by");
			this.title=parts[0];
			this.author=parts[1];
		}
		
		
	}
	   public static String[] splitStringByWord(String text, String word) {
	        
	        String lowerText = text.toLowerCase();
	        String lowerWord = word.toLowerCase();


	        int index = lowerText.indexOf(lowerWord);

	        if (index == -1) {
	            return new String[]{text, ""};
	        }

	        String beforeWord = text.substring(0, index).trim();
	        String afterWord = text.substring(index + word.length()).trim();

	        return new String[]{beforeWord, afterWord};
	    }
	   
	public Book(String title, String author, Double price, int yearPublished) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.yearPublished = yearPublished;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	public Book() {
	}
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Year Published: " + yearPublished);
    }
    
    
    public static void main(String[] args) {
        // Create Book instances
        Book<String> book1 = new Book<>("Harry potter and the philosopher's stone, by J.K. Rowling");
        Book<Integer> book2 = new Book<>(1984);

 

        // Display book details
        System.out.println("Book 1 Details:");
        book1.display();

        System.out.println("Book 2 Details:");
        book2.display();
    }
}

