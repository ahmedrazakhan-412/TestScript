package CollectionTopics;
import java.util.PriorityQueue;
public class PriorityConcept {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		//System.out.println(p.isEmpty());
		p.add(1);
		p.add(0);
		p.add(2);
		p.add(3);
		System.out.println(p.poll());
		System.out.print(p+"");
		//p.poll();
//				for (Integer integer : p) {
//					System.out.println(integer);
//				}

//		System.out.println(p.isEmpty());
//		System.out.println(p.size());

	}

}
