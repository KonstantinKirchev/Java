import java.util.Scanner;

public class _07_CountSubstringOccurrences {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	String text = scanner.nextLine().toLowerCase();
	String subString = scanner.next().toLowerCase();
	int count = count(text, subString);
	System.out.println(count);
    }

    public static int count(final String string, final String substring) {
	int count = 0;
	int idx = 0;

	while ((idx = string.indexOf(substring, idx)) != -1) {
	    idx++;
	    count++;
	}
	return count;
    }
}
//Scanner in = new Scanner(System.in);
//String text = in.nextLine().toLowerCase();
//String word = in.nextLine();
//int count = 0;
//Pattern patern = Pattern.compile(word);
//Matcher m = patern.matcher(text);
//while (m.find()){
//    count++;
//    int startPosition = m.start();
//    System.out.print(startPosition);
//    m.region(startPosition+1,text.length());
//}
//
//System.out.println(count);