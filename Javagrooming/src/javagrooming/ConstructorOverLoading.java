package javagrooming;

public class ConstructorOverLoading {
	ConstructorOverLoading(){
		System.out.println("1st");
	}
	ConstructorOverLoading(int a){
		System.out.println("2nd "+a);
	}
	ConstructorOverLoading(String a){
		this(85);
		System.out.println("3rd "+a);
	}
	ConstructorOverLoading(int a,String b){
		this("Hello");
		System.out.println("4th "+a+" "+b);
	}
	ConstructorOverLoading(String b,int c){
		this(50, "Bye");
		System.out.println("5th "+b+"  "+c);
	}
	public static void main(String[] args) {
		ConstructorOverLoading cov = new ConstructorOverLoading("Hi", 20);
	}
}
