import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class _05_PrintTheCurrentDateAndTime {
    public static void main(String[] args) {
	LocalDateTime currentDate = LocalDateTime.now();
	System.out.println(currentDate);

	DateFormat dateNow = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Calendar cal = Calendar.getInstance();
	System.out.println(dateNow.format(cal.getTime()));
    }
}
