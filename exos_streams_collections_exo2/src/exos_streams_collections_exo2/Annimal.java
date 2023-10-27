package exos_streams_collections_exo2;

public class Annimal {

	private String non;
	private String cris;
	private int taill;
	private String couleur;

	public Annimal(String nom, String cris, int taill, String couleur) {
		this.non = nom;
		this.cris = cris;
		this.taill = taill;
		this.couleur = couleur;
	}

	public double getTail() {
		return this.taill;
	}

	public String getnom() {
		return this.non;
	}
	
}
