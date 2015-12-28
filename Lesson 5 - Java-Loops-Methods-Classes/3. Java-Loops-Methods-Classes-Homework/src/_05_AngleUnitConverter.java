import java.util.Locale;
import java.util.Scanner;

public class _05_AngleUnitConverter
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		for (int i = 0; i < count; i++)
		{
			double number = input.nextDouble();
			String measure = input.next();
			switch (measure)
			{
				case "deg":
					double rad = convertDegToRad(number);
					System.out.printf("%.6f rad%n",rad);
					break;
				case "rad":
					double deg = convertRadToDeg(number);
					System.out.printf("%.6f deg%n",deg);
					break;

			}
		}
	}

	private static double convertRadToDeg(double number)
	{
		number *= 180 / Math.PI;
		return number;
	}

	private static double convertDegToRad(double number)
	{
		number *= Math.PI / 180;
		return number;
	}
}
