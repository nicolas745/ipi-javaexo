
public class Voiture {
	private String marque;
	private double tail;
	public Voiture(String Marque, double tail) {
		this.marque = Marque;
		this.tail = tail;
	}
	public double gettaill() {
		return this.tail;
	}
	public String getnome() {
		return this.marque;
	}


}
