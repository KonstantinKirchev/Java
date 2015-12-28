import java.util.Locale;
import java.util.Scanner;

public class _04_TheSmallestOf3Numbers {

    public static void main(String[] args) {
	Locale.setDefault(Locale.ROOT);
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	double min = Math.min(a, Math.min(b, c));
	if (min % 1 == 0) {
	    System.out.println((int)min);
	}
	else {
	    System.out.println(min);
	}
    }
}
