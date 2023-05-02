package it.epicode.be;
import java.lang.Math;

public class Esercizio4 {
	public static void main(String[] args) {
		double x = 12.5;
		double y = 7.5;
		double z = 9.5;
		int w = 7;
		System.out.println(RectanglePerimeter(x,y));
		System.out.println(EvenAndOdd(w));
		System.out.println(TriangleArea(x,y,z));
		
	}
	public static double RectanglePerimeter(double a, double b) {
		return 2*a + 2*b;	
	}
	public static int EvenAndOdd(int a) {
		if(a%2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	public static double TriangleArea(double a, double b, double c) {
		double p = (a + b + c)/2;	
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
	}
}
