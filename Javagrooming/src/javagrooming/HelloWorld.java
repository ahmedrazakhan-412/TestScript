package javagrooming;

public class HelloWorld {
	//	public static void main(String[] args) {
	//		 int i = 5; 
	//		 System.out.println(i++ + i-- );
	//		 System.out.println(--i + ++i );
	//		 System.out.println(i); 
	//		 }
//	public static void main(String[] args) {
//		for(int i=0;;)
//		{
//			System.out.println(i);
//		}
//	}
	
//	public static void main(String[] args) {
//		 String str = "Hello World";
//		 strFunc(str, 0);
//		 }
//		 public static void strFunc(String str, int i)
//		 {
//		 if(i==str.length())
//		 return;
//		 System.out.println(str.charAt(i));
//		 strFunc(str,i+1);
//		 }
	public static void main(String[] args) {
		 String str = "Hello World";
		 for(int i=0;;i++)
		 if(i==str.length())
		 break;
		 else if(str.charAt(i)!=' ')
		 System.out.print(str.charAt(i));
		 }
}
