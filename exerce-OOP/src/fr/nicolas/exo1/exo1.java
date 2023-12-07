package fr.nicolas.exo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {
		String chain = "abcdefg";
		chain=reversestring(chain);
		System.out.println(chain);
		pyramide(5);
		System.out.println(somme(1,100));
		Scanner scanner = new Scanner(System.in);
		System.out.print("Veuillez entrer un nombre : ");
		String userInput = scanner.nextLine();
		System.out.println(userInput +" is paire? "+ispaire(Integer.parseInt(userInput)));
		game();
	}
	
	public static String reversestring(String chaine) {
		List<Character> newlist = new ArrayList();
		for (Character character : chaine.toCharArray()) {
			newlist.add(0, character);
		}
		StringBuilder stringBuilder = new StringBuilder(newlist.size());
		for (char c : newlist) {
            stringBuilder.append(c);
        }
		return stringBuilder.toString();
	}
	public static void pyramide(int hauteur) {
		for(int i=0;i<hauteur;i++) {
			for(int i2 = hauteur;i2>i;i2--) {
				System.out.print(" ");
			}
			System.out.print("/");
			for(int i2 = 0;i2<i;i2++) {
				System.out.print("  ");
			}
			System.out.println("\\");
		}
	}
	public static float somme(float i1, float i2) {
		return (i2-i1+1)*(i1+i2)/2;
	}
	public static boolean ispaire(int nb) {
		return nb%2==0;
	}
	public static void game() {
		System.out.println("trouve le nombre");
		Random random = new Random();
		int nbordi = random.nextInt(100);
		play(nbordi);
	}
	public static void play(int i) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Veuillez entrer un nombre : ");
		String userInput = scanner.nextLine();
		int userint = Integer.parseInt(userInput);
		if(i==userint) {
			System.out.println("tu a gagnier");
		}else if(i<userint){
			System.out.println("trop grand");
			play(i);
		}else {
			System.out.println("trop petit");
			play(i);
		}
	}
}
