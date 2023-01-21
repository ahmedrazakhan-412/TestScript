package javagrooming;

public class SeparateAll {
	public static void separate() {
		String a ="";
		String b ="";
		String c ="";
		String d ="";
		String str = "#m@e12@#24th";
		for (int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				a=a+ch;
			} else if (Character.isLowerCase(ch)) {
				b=b+ch;
			} else if (Character.isDigit(ch)) {
				c=c+ch;
			} else {
				d=d+ch;
			}
		}if(0==a.length()) {
		}
		else if(1==a.length()) {
			System.out.print("\nThe Upper Case alphabet present in the entered Stirng is : "+a);
		}
		else 
			System.out.print("\nThe Upper Case alphabets present in the entered Stirng are : "+a);
		if(0==b.length()) {
		}
		else if(1==b.length()) {
			System.out.print("\nThe Lower Case alphabet present in the entered Stirng is : "+b);
		}
		else
			System.out.print("\nThe Lower Case alphabets present in the entered Stirng are : "+b);
		if(0==c.length()) {
		}
		else if(1==c.length()) {
			System.out.print("\nThe Number present in the entered Stirng is : "+c);
		}
		else
			System.out.print("\nThe Numbers present in the entered Stirng are : "+c);
		if(0==d.length()) {
		}
		else if(1==d.length()) {
			System.out.print("\nThe Special character present in the entered Stirng is : "+d);
		}
		else
			System.out.print("\nThe Special characters present in the entered Stirng are : "+d);
	}	

	public static void main(String[] args) {
		separate();
	}

}
