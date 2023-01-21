package DriveQuestions;
import java.util.Arrays;
public class ElementIsPresent {
	public static void main(String[] args){
		int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
		System.out.println("Array: "+Arrays.toString(arr));
		for (int element : arr) {
			if (element == 7) {
				System.out.println("The " +element+ " no is present in the given Array");
				break;
			}
		}
	}
}

