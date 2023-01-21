package DriveQuestions;

public class SampleLowerCase {

	public static void main(String[] args) {
		String[] arr = {"Hi","bYe","tAta","kOthi"};
		String a ="";
		for(int i=0; i<arr.length; i++) {
			String s = arr[i];
			for (int j = 0; j<s.length(); j++) {
				char ch = s.charAt(j);
				if (Character.isLowerCase(ch)) {
					a=a+ch;
				}
			}
		}
		System.out.println("lower case : "+a);
	}
}
