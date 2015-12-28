import java.math.BigDecimal;

public class Order implements Comparable<Order> {
    private BigDecimal quantity;
    private String product;

    public Order(String product, BigDecimal quantity) {
	this.product = product;
	this.quantity = quantity;
    }

    public String getProduct() {
	return product;
    }

    public void setProduct(String product) {
	this.product = product;
    }

    public BigDecimal getQuantity() {
	return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
	this.quantity = quantity;
    }

    @Override
    public int compareTo(Order product) { // това е метод който сравнява 2 обекта.
					// Връща като стойност 0,1 или -1. 0 -
					// двата обекта са равни по даден
					// признак. -1 - Първият обект е преди
					// 2рият. 1- 2ри преди 1ви.
	
	return this.getQuantity().compareTo(product.getQuantity());
    }
}
