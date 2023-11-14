package exo1.arrayindexoutofboundsexception;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<String> e = new ArrayList<String>();
		e.add("test");
		e.add("12");
		for (int i = 0; i <= e.size(); i++) {
			System.out.println(e.get(i));
		}
	}

}
