import java.io.InputStream;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double som_nb = 0.0;
	System.out.println("list : ");
		for (int i=0;i<10;i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("chosi un nombre");
			try {
				double nb = scanner.nextDouble();
				som_nb += nb;
			} catch (Exception e) {
				System.out.println("ce n'est pas un nombre");
				i--;
			}
			
		}
		System.out.println("\nla somme des nombre est "+som_nb+" et la moyenne est de "+ Math.ceil(som_nb/10));
	}

}