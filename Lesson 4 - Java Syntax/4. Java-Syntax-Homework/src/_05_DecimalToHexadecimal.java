import java.util.Locale;
import java.util.Scanner;

public class _05_DecimalToHexadecimal {

    public static void main(String[] args) {
	Locale.setDefault(Locale.ROOT);
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	System.out.println(Integer.toHexString(number).toUpperCase());
    }
}
