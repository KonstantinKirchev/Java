import java.util.Scanner;

public class _07_CountOfBitsOne {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	String num = Integer.toBinaryString(number);
	while (num.length()<16) {
	    num = "0" + num;
	}
	System.out.println(num);
	int counter = 0;
	while (number != 0) {
	    int diff = number - 1;
	    number &= diff;
	    counter++;
	}
	
	System.out.println(counter);
    }
}
