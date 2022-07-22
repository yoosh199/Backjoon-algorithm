import java.util.*;

public class j_1927 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a == 0) {
                if (q.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(q.poll()).append("\n");
                }
            } else {
                q.add(a);
            }
        }

        System.out.println(sb.toString());

        in.close();
    }

}
