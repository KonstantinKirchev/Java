import java.util.Scanner;

public class _02_Generate3LetterWords {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	String[] letters = input.nextLine().split("");
	for (int i = 0; i < letters.length; i++) {
	    for (int j = 0; j < letters.length; j++) {
		for (int j2 = 0; j2 < letters.length; j2++) {
		    System.out.print(letters[i] + letters[j] + letters[j2] + " ");
		}
	    }
	}
    }
}
