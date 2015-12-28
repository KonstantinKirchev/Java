import java.util.Scanner;

public class _01_RectangleArea {

    public static void main(String[] args) {

	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int firstNum = input.nextInt();
	int secondNum = input.nextInt();
	int area = firstNum * secondNum;
	System.out.println(area);
    }
}
