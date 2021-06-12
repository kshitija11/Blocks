
public class Flipkart {

	static String productType;
	static double productPrice;
	
	static void details() {
		
		System.out.println("Product Type: "+productType);
		System.out.println("Product Price: "+productPrice);
	}
	
	static
	{
		System.out.println("Welcome to Flipkart");
		Flipkart.productType=Vendor.product;
		Flipkart.productPrice=Vendor.price;
	}
	
}
