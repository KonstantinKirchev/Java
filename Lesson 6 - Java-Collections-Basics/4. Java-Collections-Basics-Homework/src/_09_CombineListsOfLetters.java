import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListsOfLetters {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	String str1 = input.nextLine();
	String str2 = input.nextLine();
	ArrayList<Character> firstList = new ArrayList<Character>();
	for (char c : str1.toCharArray()) {
	    firstList.add(c);
	}
	ArrayList<Character> secondList = new ArrayList<Character>();
	for (char c : str2.toCharArray()) {
	    secondList.add(c);
	}
	for (Character character : firstList) {
	    System.out.print(character);
	}
	System.out.print(" ");
	ArrayList<Character> unionList = new ArrayList<>();
	unionList.addAll(secondList);
	unionList.removeAll(firstList);

	for (Character character : unionList) {
	    System.out.print(character + " ");
	}
    }
}
