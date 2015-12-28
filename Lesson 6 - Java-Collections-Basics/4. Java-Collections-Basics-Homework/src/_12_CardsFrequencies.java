import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class _12_CardsFrequencies {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	String text = input.nextLine();
	List<String> list = Arrays.asList(text.split("\\W+"));

	LinkedHashSet<String> uniqueCards = new LinkedHashSet<String>(list);
	double freq = 0.0;
	String percent = "%";
	for (String word : uniqueCards) {
	    freq = Collections.frequency(list, word);
	    System.out.printf("%s -> %.2f%s", word, (freq / list.size()) * 100,
		    percent);
	    System.out.println();
	}
    }
}
