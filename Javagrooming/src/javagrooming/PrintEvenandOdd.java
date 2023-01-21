package javagrooming;
public class PrintEvenandOdd {
	public static void main(String[] args) {
		int Even =0;
		int Odd =0;
		System.out.println("Odd Numbers   Even Numbers");
		for (int i = 1; i <= 10; i++) {
			if (i%2==1) {
				System.out.print(i+"                    ");
			}
				if (i%2==0) {
				System.out.println(i);
			}
		}
	}
}
