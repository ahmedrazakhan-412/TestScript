package javagrooming;
import java.util.HashMap;
import java.util.Map;
public class HashMapConcept {
	public static void main(String[] args) {
		String[] arr = {"Hi", "Hello", "Hi","Bye","Hello","Hi"};
		Map<String,Integer> m = new HashMap<String, Integer>();
		for (String a : arr) {
			if (!m.containsKey(a)) {
				m.put(a, 1);
			}
			else {
				int count = m.get(a);
				m.put(a, count+1);
			}
		}
		System.out.println("Given String No.of Occurance");
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key+"             "+val);
		}
		System.out.println("\nGiven String is unique");
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			int count = m.get(key);
			if (count==1) {
				System.out.println(key+"              "+val);
			}
		}
		System.out.println("\nGiven String are duplicate");
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			int count = m.get(key);
			if (count>1) {
				System.out.println(key+"             "+val);
			}
		}
	}
}
