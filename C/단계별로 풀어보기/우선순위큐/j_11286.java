import java.util.*;

public class j_11286 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if (abs1 == abs2)
                return o1 > o2 ? 1 : -1;
            return abs1 - abs2;
        });
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
