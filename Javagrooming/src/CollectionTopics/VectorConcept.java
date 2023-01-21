package CollectionTopics;
import java.util.Vector;
public class VectorConcept {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		for (int i = 0; i < 41; i++) {
			v.add("bye");
		}
		v.set(0,"hi");
		System.out.println(v.get(0));
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
}
