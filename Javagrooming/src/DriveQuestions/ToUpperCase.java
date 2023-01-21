package DriveQuestions;
public class ToUpperCase {
	public static void main(String[] args) {
		String s = "my name is sachin";
		String[] arr = s.split(" "); 
		System.out.println("The Given String '"+s+"' ");  
		System.out.print("name and sachin Has been converted into UpperCase : ");
		for (int i = 0; i < arr.length; i++) {
			if (i==1 || i==3) {
				String name = arr[i];
				System.out.print(name.toUpperCase()+" ");
			}else {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
