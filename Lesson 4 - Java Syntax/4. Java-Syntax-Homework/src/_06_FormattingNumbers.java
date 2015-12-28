import java.util.Locale;
import java.util.Scanner;

public class _06_FormattingNumbers {

    public static void main(String[] args) {
	Locale.setDefault(Locale.ROOT);
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	String binString = Integer.toBinaryString(a);
	while (binString.length() < 10) {
	    binString = "0" + binString;
	}
	double b = input.nextDouble();
	double c = input.nextDouble();
	System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|", Integer.toHexString(a)
		.toUpperCase(), binString, b, c);
    }
}
