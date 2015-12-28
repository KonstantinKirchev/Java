import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class _08_SumNumbersFromATextFile {

    public static void main(String[] args) {
	try {
	    FileInputStream fstream = new FileInputStream("_08_Input.txt");
	    BufferedReader br = new BufferedReader(new InputStreamReader(
		    fstream));
	    String strLine;
	    int sum = 0;
	    // Read File Line By Line
	    while ((strLine = br.readLine()) != null) {
		try {
		    sum += Integer.valueOf(strLine);
		} catch (NumberFormatException e) {
		    continue;
		}
		// Print the content on the console
		System.out.println(strLine);

	    }
	    System.out.println("\nSum: " + sum);

	    // Close the input stream
	    fstream.close();
	} catch (Exception e) {// Catch exception if any
	    System.out.println("Error");
	}
    }
}
