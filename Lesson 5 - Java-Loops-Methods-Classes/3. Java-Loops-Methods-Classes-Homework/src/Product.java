import java.math.BigDecimal;

public class Product implements Comparable<Product> {
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
	this.name = name;
	this.price = price;
    }

    public String getProduct() {
	return name;
    }

    public void setProduct(String product) {
	this.name = product;
    }

    public BigDecimal getPrice() {
	return price;
    }

    public void setPrice(BigDecimal price) {
	this.price = price;
    }

    @Override
    public int compareTo(Product name) { // това е метод който сравнява 2 обекта.
					// Връща като стойност 0,1 или -1. 0 -
					// двата обекта са равни по даден
					// признак. -1 - Първият обект е преди
					// 2рият. 1- 2ри преди 1ви.
	
	return this.getPrice().compareTo(name.getPrice());
    }

}
