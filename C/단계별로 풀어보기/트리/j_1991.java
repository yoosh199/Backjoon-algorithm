import java.util.*;

class Node1 implements Comparable<Node1> {
    public int left;
    public int right;

    public Node1(int left, int right) {

        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(Node1 o) {
        return left - o.left;
    }
}

public class j_1991 {

    static StringBuilder sb = new StringBuilder();
    static boolean visit[];
    static ArrayList<Node1> list[];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        list = new ArrayList[N];
        in.nextLine();
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {

            String input = in.nextLine();
            int start = input.charAt(0);
            int left = input.charAt(2);
            int right = input.charAt(4);

            list[start - 65].add(new Node1(left - 65, right - 65));

        }
        preorder(0);
        Arrays.fill(visit, false);
        sb.append("\n");
        inorder(0);
        Arrays.fill(visit, false);
        sb.append("\n");
        postorder(0);

        System.out.println(sb.toString());
        in.close();
    }

    static void preorder(int start) {
        if (start < 0) {
            return;
        }
        if (!visit[start]) {
            visit[start] = true;

            sb.append((char) (start + 65));

            for (Node1 node : list[start]) {
                preorder(node.left);
                preorder(node.right);
            }

        }

    }

    static void inorder(int start) {
        if (start < 0) {
            return;
        }
        if (!visit[start]) {

            for (Node1 node : list[start]) {
                inorder(node.left);

            }
            visit[start] = true;

            sb.append((char) (start + 65));
            for (Node1 node : list[start]) {

                inorder(node.right);
            }
        }
    }

    static void postorder(int start) {
        if (start < 0) {
            return;
        }
        if (!visit[start]) {

            for (Node1 node : list[start]) {
                postorder(node.left);
                postorder(node.right);
            }
            visit[start] = true;

            sb.append((char) (start + 65));
        }
    }
}
