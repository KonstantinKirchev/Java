import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	String[] words = input.nextLine().toLowerCase().split("\\W+");
	SortedSet<String> uniqueWords = new TreeSet<String>();
	for (String word : words) {
	    uniqueWords.add(word);
	}
	for (String word : uniqueWords) {
	    System.out.print(word + " ");
	}
    }
}
