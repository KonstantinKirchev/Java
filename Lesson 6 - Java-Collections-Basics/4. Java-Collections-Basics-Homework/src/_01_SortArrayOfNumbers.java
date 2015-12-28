import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	int count = input.nextInt();
	int[] number = new int[count];
	for (int i = 0; i < count; i++) {
	    number[i] = input.nextInt();
	}
	Arrays.sort(number);
	for (int num : number) {
	    System.out.print(num + " ");
	}
    }
}
