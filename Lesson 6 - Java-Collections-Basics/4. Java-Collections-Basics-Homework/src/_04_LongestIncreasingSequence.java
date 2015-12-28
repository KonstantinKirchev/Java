import java.util.ArrayList;
import java.util.Scanner;

public class _04_LongestIncreasingSequence {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	String[] str = input.nextLine().split(" ");
	int[] number = new int[str.length];
	for (int i = 0; i < str.length; i++) {
	    number[i] = Integer.parseInt(str[i]);
	}
	ArrayList<Integer> listNumbers = new ArrayList<>();
	ArrayList<Integer> longestListNumbers = new ArrayList<>();
	listNumbers.add(number[0]);
	for (int i = 1; i < number.length; i++) {
	    if (number[i] > number[i - 1]) {
		listNumbers.add(number[i]);
	    }
	    if (listNumbers.size() > longestListNumbers.size()) {
		longestListNumbers.clear();
		longestListNumbers.addAll(listNumbers);
	    }
	    if (number[i] == number[i - 1]) {
		for (Integer integer : listNumbers) {
		    System.out.print(integer + " ");
		}
		System.out.println();
		listNumbers.clear();
		listNumbers.add(number[i]);
	    }
	    if (number[i] < number[i - 1]) {
		for (Integer integer : listNumbers) {
		    System.out.print(integer + " ");
		}
		System.out.println();
		listNumbers.clear();
		listNumbers.add(number[i]);
	    }
	}
	for (Integer integer : listNumbers) {
	    System.out.print(integer + " ");
	}
	System.out.println();
	System.out.print("Longest: ");
	for (Integer integer : longestListNumbers) {
	    System.out.print(integer + " ");
	}
    }
}
