package javagrooming;

public class Sample {
	int a1=10;
	Sample(){
		//System.out.println(a);
		System.out.println("Hi  I am Constructor");
		
	}
	public static void main(String[] args) {
		//System.out.println("I am Before sample");
		
		System.out.println("Hi  I am Main Method");
	}

	static {
		Sample s = new Sample();
		System.out.println("Hi  I am S B");
		System.out.println(s.a1);
		

	}
	{
		System.out.println("Hi  I am N S B");
		System.out.println(a1);
	}
}
