import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;


public class _09_ListOfProducts {
    public static void main(String[] args) {
	try {
	    BufferedReader reader = new BufferedReader(new FileReader(
		    "_09_input.txt"));
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

	    BufferedWriter writer = new BufferedWriter(new FileWriter(
		    "_09_output.txt"));

	    for (Product product : productList) {
		writer.write(product.getPrice() + " "
			+ product.getProduct());
		writer.newLine();
	    }

	    reader.close();
	    writer.close();

	} catch (Exception ex) {
	    System.out.println("Error!");
	}
    }
}