import java.util.Scanner;

public class _05_CountAllWords {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	String[] str = input.nextLine().split("\\W+");
	int count = 0;
	for (int i = 0; i < str.length; i++) {
	    count++;
	}
	System.out.println(count);
    }
}
