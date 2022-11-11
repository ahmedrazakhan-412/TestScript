package javagrooming;

public class FactroialReturn {
	public static int fact() {
		int fact = 1;
		int no = 7;
		for (int i = no; i >= 1; i--) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println("The factroial of 7 is : "+fact());
	}
}
