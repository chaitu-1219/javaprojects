package abc;
import java.util.*;
public class heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> minheap=new PriorityQueue<>();
		minheap.add(25);
		minheap.add(10);
		minheap.add(20);
		minheap.add(15);
		System.out.println("Min Heap Outut:");
		while(!minheap.isEmpty()) {
			System.out.println(minheap.poll());
		}
		PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections
				.reverseOrder());
		maxheap.add(25);
		maxheap.add(10);
		maxheap.add(20);
		maxheap.add(15);
		System.out.println("Max Heap Outut:");
		while(!maxheap.isEmpty()) {
			System.out.println(maxheap.poll());
		}

	}

}
