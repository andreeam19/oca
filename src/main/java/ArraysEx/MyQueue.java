package ArraysEx;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
       // Queue<String> queue=new PriorityQueue<>(Collections.reverseOrder());
//
//        queue.offer("B");
//        queue.offer("C");
//        queue.offer("A");
//        queue.offer("F");
//        queue.offer("D");
//
//        while(!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }
        Queue<String>queue=new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        //System.out.println(queue.isEmpty());
        System.out.println(queue.contains("Chad"));
       // System.out.println(queue.peek());
//        queue.poll();
//        queue.poll();
//        queue.poll();
//        queue.poll();
//        queue.poll();

        System.out.println(queue);

    }
}
