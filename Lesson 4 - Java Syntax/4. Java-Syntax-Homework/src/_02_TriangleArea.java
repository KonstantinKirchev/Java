import java.util.Scanner;

public class _02_TriangleArea {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int ax = input.nextInt();
	int ay = input.nextInt();
	int bx = input.nextInt();
	int by = input.nextInt();
	int cx = input.nextInt();
	int cy = input.nextInt();
	int area = (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2;
	System.out.println(Math.abs(area));
    }
}
