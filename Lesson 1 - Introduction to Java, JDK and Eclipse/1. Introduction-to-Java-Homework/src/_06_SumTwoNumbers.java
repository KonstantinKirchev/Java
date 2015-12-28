import java.util.Scanner;

public class _06_SumTwoNumbers {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int firstNum = input.nextInt();
	int secondNum = input.nextInt();
	int sum = firstNum + secondNum;
	System.out.println("sum = " + sum);
	input.close();
    }
}
