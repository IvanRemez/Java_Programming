package day40_Collections2;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>(); // Random order, NO null values
      // ^^ Parent (Reference)     // ^^ Child (Object)

        queue.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue.addAll(Arrays.asList(10, 200, 300, 40, 90));
        // queue.addAll(Arrays.asList(null, null, null));

        System.out.println(queue);

        int num1 = queue.poll(); // --> FIFO

        System.out.println(queue);

        queue.poll();   // removes 1st element each time
        queue.poll();
        queue.poll();

        System.out.println(queue);

        // System.out.println(queue.get(4)); // NO get() method in PriorityQueue

        System.out.println("---------------------------------------------------");

        Queue<Integer> queue1 = new ArrayDeque<>(); // Insertion order, NO null values
      // ^^ Parent (Reference)     // ^^ Child (Object)

        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(queue1);

        queue1.poll();

        System.out.println(queue1);

        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();  // all elements processed out

        System.out.println(queue1);

        // System.out.println(queue.get(4)); // NO get() method in ArrayDeque

        System.out.println("---------------------------------------------------");

        Queue<Integer> queue2 = new LinkedList<>();
      // ^^ Parent (Reference)     // ^^ Child (Object)

        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(null, null, null));     // null accepted

        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);

        System.out.println(((LinkedList)queue2).get(4));
        // LinkedList unlike Queue DOES have get() method
        // so down casting to LinkedList allows us to use it

        System.out.println("---------------------------------------------------");

        List<Integer> list = new LinkedList<>();
      // ^^ Parent (Reference)     // ^^ Child (Object)

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list.get(1));

        System.out.println(list);

        ((LinkedList)list).poll();
        // Again LinkedList (Object) has poll() method unlike List (Reference)
        // so down casting to LinkedList allows us to use it

        System.out.println(list);

        // ((Stack)list).pop();    // LIFO
        // ClassCastException - No IS A relation b/w LinkedList and Stack

    }
}
