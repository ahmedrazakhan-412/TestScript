package DriveQuestions;
public class ReverseStringLastWord {
	public static void main(String[] args) {
		String s = "my name is avaj";
		String[] arr = s.split(" "); 
		System.out.println("The Given String '"+s+"' ");  
		System.out.print("avaj Has been converted into Reverse : ");
		for (int i = 0; i < arr.length; i++) {
			if (i==3) {
				String avaj = arr[i];
				for (int j = avaj.length()-1; j >=0 ; j--) {
					System.out.print(avaj.charAt(j));
				}
			}else {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
