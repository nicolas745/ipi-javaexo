package exos_streams_collections_exo2;

import java.util.Arrays;
import java.util.List;

public class main {
	private static List<Annimal> annimals = Arrays.asList(
			new Annimal("ours","Rrr",200,"blanc"),
			new Annimal("chien","woff",120,"noir"),
			new Annimal("chat","miou",30,"gris"));
	private static Annimal minanimal;
	private static Annimal maxanimal;
	public static void main(String[] args) {
		minanimal = annimals.get(0);
		maxanimal = annimals.get(0);
		annimals.forEach(annimal -> {
			if(annimal.getTail()<minanimal.getTail()) {
				minanimal = annimal;
			}
			if(annimal.getTail()>maxanimal.getTail()) {
				maxanimal = annimal;
			}
		});
		System.out.println("l'animal le plus grand :" + maxanimal.getnom());
		System.out.println("l'animal le plus petit :" + minanimal.getnom());
	}

}
