import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		char[] chars= "1b".toCharArray();
		List<Integer> nbs = new ArrayList<Integer>();
		nbs.add(23);
		nbs.add(132);
		nbs.add(42);
		nbs.add(5);
		nbs.add(19);
		System.out.println(get_alpha_H(chars));;
	}

	private static char get_alpha_H(char[] chars) {
		char res = Character.toUpperCase(chars[0]);
		for(int i=0;i<chars.length;i++) {
			char lettre = Character.toUpperCase(chars[i]);
			if(Character.isAlphabetic(lettre)) {
				if(res<lettre) {
					res = lettre;
				}
			}
		}
		return res;
	}
}