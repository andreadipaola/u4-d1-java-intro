package it.epicode.be;

public class Test {

	public static void main(String[] args) {
		float x = 10;
		//Si consiglia di usare double perche si potrebbere avere problemi a causa di arrotondamenti dovuti a meccaniche interne di Java
		float y = 1.0;
		System.out.println(add(x,y));
		
	}
	public static float add(float a, float b) {
		return a + b;
	}

}
