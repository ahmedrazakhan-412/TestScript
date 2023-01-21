package CollectionTopics;
import java.util.LinkedList;
public class LinkedListConcept {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList<>();
		for (int i = 0; i < 11; i++) {
			ll.add("bye");
		}
		ll.set(0,"hi");
		System.out.println(ll.hashCode());
		System.out.println(ll.get(0));
		System.out.println(ll.size());
	}
}
