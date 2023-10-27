import java.util.Arrays;
import java.util.Collection;

public class main {
	private static Collection<Voiture> collection = Arrays.asList(
			new Voiture("Toyta",100.0),
			new Voiture("Cytroen", 200));
	public static void main(String[] args) {
		Voiture select = collection.stream().min((v1,v2) -> Double.compare(v1.gettaill(), v1.gettaill())).get();
		System.out.println("la voiture "+select.getnome()+ " a la tail de "+ select.gettaill());
		
	}

}
