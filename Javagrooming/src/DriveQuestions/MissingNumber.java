package DriveQuestions;
import java.util.ArrayList;
public class MissingNumber {
	public static void main(String[] args){
		int[] arr = {2,6,10};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int n : arr) {
			al.add(n);
		}
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) {
			if (al.contains(i)) {
			}
			else
			System.out.println("The Number : "+i+" is Missing");			
			}
		}
	}
}