import java.util.ArrayList;
import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

	String[] str = input.nextLine().split(" ");
	ArrayList<String> list = new ArrayList<>();
	ArrayList<String> longestList = new ArrayList<>();
	list.add(str[0]);
	for (int i = 1; i < str.length; i++) {
	    if (str[i].contains(str[i - 1])) {
		list.add(str[i]);
	    }
	    if (list.size() > longestList.size()) {
		longestList.clear();
		longestList.addAll(list);
	    }
	    if (str[i].contains(str[i - 1]) == false) {
		list.clear();
		list.add(str[i]);
	    }
	}
	if (longestList.size() == 0) {
	    for (String string : list) {
		System.out.print(string);
	    }
	}
	for (String string : longestList) {
	    System.out.print(string + " ");
	}
    }
}
