package it.epicode.be;
import java.util.Arrays;

public class Esercizio2 {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		String[] array = new String[] {"Hello","My","Name","is","Andrea"};
		String word = "First";
		int pos = 2;
		System.out.println(multiply(x,y));
		System.out.println(concat(word,x));
		System.out.println(Arrays.toString(insertInArray(array, word,
	            pos)));
	}
	public static int multiply(int a, int b) {
		return  a * b;
	}
	public static String concat(String string, int a) {
		return string + a;
	}
	public static String[] insertInArray(String[] stringArray, String string, int position) {
		String[] resultArray = new String[stringArray.length + 1];
		int i;
		for(i = 0; i < resultArray.length; i++) {
			if(i < position && i < stringArray.length)
				resultArray[i]= stringArray[i];
			else if(i == position) {
				resultArray[i]=string;
			}
			else {
				resultArray[i]=stringArray[i-1];
			}
		}
		return (resultArray);
	}
}
