package javagrooming;
public class remove_duplitcate_string_array {
	public static void main(String[] args) {
		String arr[] = {"Hi","Bye","Hello","Hi","Hello","Hi","Bye"};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					arr[j]="OhhYess";
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			if (arr[k]!="OhhYess") {
				System.out.println(arr[k]);
			}
		}
	}
}
