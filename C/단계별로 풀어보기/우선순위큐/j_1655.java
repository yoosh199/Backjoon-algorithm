import java.util.*;

public class j_1655 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (minHeap.size() == maxHeap.size()) {
                maxHeap.add(a);
            } else {
                minHeap.add(a);
            }

            if (!maxHeap.isEmpty() && !minHeap.isEmpty()) {
                if (maxHeap.peek() > minHeap.peek()) {
                    int maxt = maxHeap.poll();
                    int mint = minHeap.poll();
                    maxHeap.add(mint);
                    minHeap.add(maxt);
                }
            }
            sb.append(maxHeap.peek()).append("\n");
        }

        System.out.println(sb.toString());
        in.close();
    }

}
