package javagrooming;
class ConstractorChaining1 {
	ConstractorChaining1(){
		System.out.println("onest ");
	}
}
class ConstractorChaining2 extends ConstractorChaining1{
	ConstractorChaining2(String a){
		super();
		System.out.println("1st ");
	}
}
class ConstractorChaining3 extends  ConstractorChaining2{
	ConstractorChaining3(String a){
		super("hi");
		System.out.println("2nd "+a);
	}
}
public class ConstractorChaining {
	public static void main(String[] args) {
		ConstractorChaining3 c = new ConstractorChaining3("Hello");
		System.out.println("3rd");
	}
}