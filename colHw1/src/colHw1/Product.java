package colHw1;

public class Product {
	private String name;
	private double price;
	private static final double VAT = 0.17;
	public Product() {

	}
	public Product(String name, double price) {

		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static double getVat() {
		return VAT;
	}
	
	public double getPriceIncludingVat() {
		return this.price+this.price*this.VAT;
	}
    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Price including VAT: " + getPriceIncludingVat());
    }
       public static void main(String[] args) {
            Product product = new Product("Laptop", 1000.00);

            product.display();
        }
    }
	


