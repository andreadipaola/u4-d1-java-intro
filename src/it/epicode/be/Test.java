package it.epicode.be;

public class Test {

	public static void main(String[] args) {
		double x = 3.5;
		// Si consiglia di usare double perche si potrebbere avere problemi a causa di
		// arrotondamenti dovuti a meccaniche interne di Java
		// float y = 1.0;
		double y = 2.5;
		System.out.println(add(x, y));

	}

	public static double add(double a, double b) {
		return a + b;
	}

}
