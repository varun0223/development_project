package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		
		priorityQueue.offer(3);
		priorityQueue.offer(7);
		priorityQueue.offer(8);
		priorityQueue.offer(10);
		
		System.out.println("Priority Queue: " + priorityQueue);
		
		System.out.println("Peek: " + priorityQueue.peek());
		
		System.out.println("Removed: " + priorityQueue.poll());
		System.out.println("Removed: " + priorityQueue.poll());
		
		System.out.println("Priority Queue after removals: " + priorityQueue);
		

	}

}
