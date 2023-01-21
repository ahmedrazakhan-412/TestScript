package javagrooming;
public class StringSwap {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		str1 = str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		System.out.println("str2 = World after swap is : "+str2);
		str1=str1.substring(str2.length());
		System.out.println("str1 = Hello after swap is : "+str1);
	}
}
