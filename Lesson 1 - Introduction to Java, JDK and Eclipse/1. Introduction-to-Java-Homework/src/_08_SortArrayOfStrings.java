import java.util.Arrays;
import java.util.Scanner;

public class _08_SortArrayOfStrings {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	input.nextLine();
	String[] cities = new String[n];
	for (int i = 0; i < n; i++) {
	    cities[i] = input.nextLine();
	}

	Arrays.sort(cities);
	System.out.println();
	for (String city : cities) {
	    System.out.println(city);
	}
	input.close();
    }
}
