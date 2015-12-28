import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class _10_OrderOfProducts {
    public static void main(String[] args) {
	try {
	    BufferedReader reader = new BufferedReader(new FileReader(
		    "Products.txt"));
	    String line = reader.readLine();

	    ArrayList<Product> productList = new ArrayList<Product>();

	    while (line != null) {
		String[] splitLine = line.split(" ");
		String name = splitLine[0];
		BigDecimal price = new BigDecimal(splitLine[1]);
		Product currentProduct = new Product(name, price);
		productList.add(currentProduct);
		line = reader.readLine();
	    }
	    Collections.sort(productList);
	    @SuppressWarnings("resource")
	    BufferedReader reader1 = new BufferedReader(new FileReader(
		    "Order.txt"));
	    String line1 = reader1.readLine();

	    ArrayList<Order> productList1 = new ArrayList<Order>();

	    while (line1 != null) {
		String[] splitLine = line1.split(" ");
		BigDecimal quantity = new BigDecimal(splitLine[0]);
		String product = splitLine[1];
		Order currentProduct = new Order(product, quantity);
		productList1.add(currentProduct);
		line1 = reader1.readLine();
	    }
	    Collections.sort(productList1);
	    BigDecimal totalPrice = BigDecimal.ZERO;

	    for (Order row : productList1) {
		for (Product product : productList) {

		    if (row.getProduct().equals(product.getProduct())) {

			BigDecimal multiply = row.getQuantity().multiply(
				product.getPrice());
			totalPrice = totalPrice.add(multiply);
		    }
		}
	    }

	    BufferedWriter writer = new BufferedWriter(new FileWriter(
		    "_10_output.txt"));

	    writer.write(totalPrice.toString());

	    reader.close();
	    writer.close();

	} catch (Exception ex) {
	    System.out.println("Error!");
	}
    }
}