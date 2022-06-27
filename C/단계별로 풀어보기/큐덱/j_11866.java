import java.util.*;

public class j_11866 {
    public static void main(String[] args){
    
		Scanner in = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = in.nextInt();
        int K = in.nextInt();
        StringBuilder sb = new StringBuilder();
        int count=1;
        sb.append("<");

        for(int i=1;i<=N;i++){
            q.offer(i);
        }

        while(q.size()>1){
          
            if(count%K==0){
                sb.append(q.poll()).append(", ");
                count=1;
            }
            else {
                q.offer(q.poll());
                count++;
            }

        }
        sb.append(q.poll()).append(">");

        System.out.printf(sb.toString());
        in.close();
    }
}
