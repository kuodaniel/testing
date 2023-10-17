package tests.practice;
import java.util.*;


public class PriorityQueuePrac {
    public static void main (String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
 
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
 
        System.out.println("Initial PriorityQueue " + pq);
          // using the method
        pq.remove("Geeks");
        System.out.println("After Remove - " + pq);
        System.out.println("Poll Method - " + pq.poll());
        System.out.println("Final PriorityQueue - " + pq);



    }
}

class Pair {

    private int score;
    private String name;
    public Pair(int score, String name) {
        this.score = score;
        this.name = name;
    }


}
