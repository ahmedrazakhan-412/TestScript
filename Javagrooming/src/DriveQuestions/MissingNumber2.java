package DriveQuestions;
public class MissingNumber2 {
	public static void main(String[] args) {
		int[] arr = {4,6,10};
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		for (int i = 2; i <= 10; i+=2) {
			sum1=sum1+i;
		}
		int missingNumber = sum1-sum;
		System.out.println(missingNumber);
	}
}
