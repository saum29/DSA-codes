import java.util.PriorityQueue;
import java.util.*;

public class prorityQueue {
    public static void main(String[] args) {
        int[] arr = { 1, 21, 57, 92, 13, 43, 22, 21, 6 };

        /*
         * PriorityQueue<Integer> pq = new PriorityQueue<>(); // default - Min PQ
         * 
         * for (int ele : arr)
         * pq.add(ele);
         * 
         * while (pq.size() != 0) {
         * System.out.println(pq.peek());
         * pq.remove();
         * }
         */

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // default - Min PQ

        for (int ele : arr)
            pq.add(ele);

        while (pq.size() != 0) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }

}
