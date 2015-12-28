import java.util.Scanner;

public class _08_CountOfEqualBitPairs {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	String num = Integer.toBinaryString(number);
	System.out.println(num);
	int counter = 0;

	for (int i = 0; i < num.length(); i++) {
	    if (number == 0) {
		break;
	    }
	    int bits = (number >> i) & 3;
	    if (bits == 0 || bits == 3) {
		counter++;
	    }
	}
	System.out.println(counter);
    }
}
