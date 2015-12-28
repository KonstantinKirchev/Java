import java.util.Scanner;

public class _06_CountSpecifiedWord {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	String[] str = input.nextLine().split("\\W+");
	String word = input.nextLine();
	int count = 0;
	for (int i = 0; i < str.length; i++) {
	    if (str[i].equalsIgnoreCase(word)) {
		count++;
	    }
	}
	System.out.println(count);
    }
}
