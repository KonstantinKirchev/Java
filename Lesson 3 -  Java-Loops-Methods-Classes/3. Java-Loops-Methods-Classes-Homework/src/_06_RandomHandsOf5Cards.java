import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOf5Cards {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int numberOfHands = input.nextInt();

	String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
		"Q", "K", "A" };
	String[] suits = { "\u2660", "\u2665", "\u2666", "\u2663" };

	for (int i = 0; i < numberOfHands; i++) {
	    HashSet<String> hand = new HashSet<String>();
	    while (hand.size() < 5) {
		String face = faces[new Random().nextInt(13)];
		String suit = suits[new Random().nextInt(4)];

		hand.add(face + suit);
	    }
	    for (String card : hand) {
		System.out.print(card + " ");
	    }
	    System.out.println();
	}
    }
}
