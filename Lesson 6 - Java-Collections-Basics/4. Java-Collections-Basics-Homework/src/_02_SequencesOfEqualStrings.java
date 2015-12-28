import java.util.Scanner;

public class _02_SequencesOfEqualStrings {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	String[] str = input.nextLine().split(" ");
	System.out.print(str[0]);
	for (int i = 1; i < str.length; i++) {
	    if (str[i].equals(str[i - 1])) {
		System.out.print(" " + str[i]);
	    } else {
		System.out.println();
		System.out.print(str[i]);
	    }
	}
    }
}
