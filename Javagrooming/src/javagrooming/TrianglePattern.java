package javagrooming;
import java.util.Scanner;
public class TrianglePattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number to print no of * pattern lines :  ");
		int size = sc.nextInt();  
		int i, j;  
		for (i = 0; i < size + 1; i++) {
			for (j = size+i; j >size ; j--) {  
				System.out.print("*");  
			}  
			System.out.println();  
		}  
	}
}
