package it.epicode.be;
import java.util.Scanner; 

public class Esercizio3 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Scrivi qualcosa!");
	String prima = in.nextLine();
	System.out.println("Ancora un po'!!");
	String seconda = in.nextLine();
	System.out.println("Ci sei quasi!!!");
	String terza = in.nextLine();
	System.out.println("Ecco qui!!! " + prima + " " +  seconda + " " + terza);
	in.close(); 
}
}
