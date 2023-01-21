package javagrooming;
public class AsciiValue {
	public static void main(String[] args) {
		for (int i = 65; i <=90; i++) {
			System.out.println("The ascii value of "+(char)i+" is "+i);
		}
		for (char ch = 'a'; ch <='z'; ch++) {
			System.out.println("The ascii value of "+ch +" is "+(int)ch);
		}
		for (int i = 0; i <=255; i++) {
			System.out.println(i+" The Ascii Value is "+(char)i);
		}
	}
}
