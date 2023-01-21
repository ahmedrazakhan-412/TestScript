package DriveQuestions;
import java.util.ArrayList;
public class ConvertUpperCase {
	public static void main(String[] args) { 
		String s = "my name is sachin";
		String[] arr = s.split(" ");    
		String name = arr[1];
		String sachin = arr[3];
		String nameUpperCase = name.toUpperCase();
		String sachinUpperCase = sachin.toUpperCase();
		ArrayList<String> al = new ArrayList<String>();
		al.add(arr[0]);
		al.add(nameUpperCase);
		al.add(arr[2]);
		al.add(sachinUpperCase);
		System.out.println("The Given String '"+s+"' ");  
		System.out.print("name and sachin Has been converted into UpperCase : ");
		for (String a : al) {
			System.out.print(a+" ");
		}
	}
}