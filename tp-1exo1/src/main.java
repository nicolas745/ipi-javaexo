import static java.lang.Math.*;

public class main {

	public static void main(String[] args) {
		double som_nb = 0.0;
	System.out.println("list : ");
		for (int i=0;i<args.length;i++) {
			if(is_numeric(args[i])) {
				double nb= Double.parseDouble(args[i]);
				System.out.print(nb+", ");
				som_nb += nb;
			}else {
				System.out.println("error");
			}
		}
		System.out.println("\nla somme des nombre est "+som_nb+" et la moyenne est de "+ Math.ceil(som_nb/args.length));
	}
	private static boolean is_numeric(String nb) {
		try {
			@SuppressWarnings("unused")
			double d = Double.parseDouble(nb);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}