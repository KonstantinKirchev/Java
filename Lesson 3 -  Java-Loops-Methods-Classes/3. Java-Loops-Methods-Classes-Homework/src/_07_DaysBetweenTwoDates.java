import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class _07_DaysBetweenTwoDates {

    public static void main(String[] args) {
	SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	String startDate = input.nextLine();
	String endDate = input.nextLine();
	try {
	    Date date1 = myFormat.parse(startDate);
	    Date date2 = myFormat.parse(endDate);
	    long diff = date2.getTime() - date1.getTime();
	    System.out.println(TimeUnit.DAYS.convert(diff,
		    TimeUnit.MILLISECONDS));
	} catch (ParseException e) {
	    e.printStackTrace();
	}
    }
}
