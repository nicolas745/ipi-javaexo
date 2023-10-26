import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		char[] chars= "erd".toCharArray();
		List<Integer> nbs = new ArrayList<Integer>();
		nbs.add(23);
		nbs.add(132);
		nbs.add(42);
		nbs.add(-5);
		nbs.add(19);
		System.out.println("léttre la plus haute : "+get_alpha_high(chars));
		System.out.println("le nombre max : "+get_nb_max(nbs));
		System.out.println("le nombre min : "+get_nb_min(nbs));
		System.out.println("le lettre existe : "+is_chars(chars,'a'));
	}

	private static boolean is_chars(char[] chars, char c) {
		for(char ch : chars) {
			if(Character.toUpperCase(ch) == Character.toUpperCase(c)) {
				return true;
			}
		}
		return false;
	}

	private static int get_nb_min(List<Integer> nbs) {
		int res = nbs.get(0);
		for( int nb : nbs) {
			if(res>nb) {
				res = nb;
			}
		}
		return res;
	}

	private static int get_nb_max(List<Integer> nbs) {
		int res = nbs.get(0);
		for( int nb : nbs) {
			if(res<nb) {
				res = nb;
			}
		}
		return res;
	}

	private static char get_alpha_high(char[] chars) {
		char res = Character.toUpperCase(chars[0]);
		for(int i=0;i<chars.length;i++) {
			char lettre = Character.toUpperCase(chars[i]);
			if(Character.isAlphabetic(lettre)) {
				if(res<lettre) {
					res = lettre;
				}
			}
		}
		if(Character.isAlphabetic(res)) {
			return res;
		}else {
			System.out.print("error il y a pas de ");
			return 0;
		}
	}
}