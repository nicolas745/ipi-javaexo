package exo3.stringtolocaldatetab;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
	public static void main(String[] args) {
		String list[] = {"2023-221-14"};
		LocalDate[] localdate = stringToLocalDateTab(list); 
	}
	public static LocalDate[] stringToLocalDateTab(String[] list) {
		LocalDate[] res = new LocalDate[list.length];
		for(int i=0;i<res.length;i++) {
			int[] chiffre =extractNumbers(list[i]);
			res[i] =  LocalDate.of(chiffre[0], chiffre[1], chiffre[2]);
		}
		return res;
	}
    public static int[] extractNumbers(String input) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            numbers.add(number);
        }
        int[] result = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            result[i] = numbers.get(i);
        }

        return result;
    }
	
} 
