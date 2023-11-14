package exo2.numberformatexception;



public class main {

	public static void main(String[] args) {
		String[] e = {"min","max"};
		int[] i = convertStringTabToIntTab(e);

	}
	public static int[] convertStringTabToIntTab(String[] list) {
		int[] e = new int[list.length];
		for(int i=0;i<e.length;i++) {
			e[i] = Integer.valueOf(list[i]);
		}
		return e;
	}
}
