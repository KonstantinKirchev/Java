import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _11_MostFrequentWord {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	String text = input.nextLine();
	List<String> list = Arrays.asList(text.toLowerCase().split("\\W+"));

	Set<String> uniqueWords = new TreeSet<String>(list);
	int maxFreq = 0;
	String maxWord = "";
	int freq = 0;
	for (String word : uniqueWords) {
	    freq = Collections.frequency(list, word);
	    if (freq > maxFreq) {
		maxFreq = freq;
		maxWord = word;
	    }
	}
	System.out.println(maxWord + " -> " + maxFreq + " times");
	for (String word : uniqueWords) {
	    freq = Collections.frequency(list, word);
	    if (freq == maxFreq) {
		if (word.equals(maxWord)) {
		    continue;
		}
		System.out.println(word + " -> " + maxFreq + " times");
	    }
	}
    }
}
