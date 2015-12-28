import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

	String input = scan.nextLine();
	Pattern p = Pattern.compile(
		"\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",
		Pattern.CASE_INSENSITIVE);
	Matcher matcher = p.matcher(input);
	ArrayList<String> emails = new ArrayList<String>();

	while (matcher.find()) {
	    emails.add(matcher.group());
	}
	//Collections.sort(emails);
	for (String string : emails) {
	    System.out.println(string);
	}
    }
}
