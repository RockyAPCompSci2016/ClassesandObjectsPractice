
public class Product {
	private String productName;
	private double productPrice;
	
public Product(String names, double prices)
{
	productName=names;
	productPrice=prices;
}
public String getName()
{
	return productName;
}
public double getPrice()
{
	return productPrice;
}
public double reducePricePercentage(double byPercent)
{
	productPrice=productPrice*(1.+((byPercent*-1.)/100.));
	return productPrice;
}
public double reducePriceFlat(double byAmount)
{
	productPrice=productPrice-byAmount;
	return productPrice;
}

}
