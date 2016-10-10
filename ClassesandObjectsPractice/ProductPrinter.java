
public class ProductPrinter {

	public static void main(String[] args) {
		Product product1= new Product("Toaster1", 29.95);
		System.out.println(product1.getName());
		System.out.println(product1.getPrice());
		product1.reducePricePercentage(.15);
		System.out.println(product1.getPrice());
	}

}
