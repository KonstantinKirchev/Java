import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int start = input.nextInt();
	int end = input.nextInt();
	for (int i = start; i <= end; i++) {
	    int digit1 = i % 10;
	    int digit2 = (i / 10) % 10;
	    int digit3 = (i / 100) % 10;

	    if (digit1 == digit3) {
		if (digit1 == 0 && digit3 == 0) {
		    continue;
		}
		System.out.printf("%d%d%d ", digit3, digit2, digit1);
	    }
	    if (digit2 == 0 && digit3 == 0) {
		System.out.print(digit1 + " ");
	    }
	    if (digit1 == digit2) {
		if (digit3 != 0) {
		    continue;
		}
		System.out.printf("%d%d ", digit2, digit1);
	    }
	}
    }
}
