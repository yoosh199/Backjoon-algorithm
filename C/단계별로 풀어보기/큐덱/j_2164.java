import java.util.*;


public class j_2164 {
    public static void main(String[] args){
    
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        Queue<Integer> q = new LinkedList<>();
        

        for(int i=1;i<=N;i++){
            q.add(i);
        }

        while(q.size()>1){
            
            
                q.poll();

                q.add(q.poll());
            
            
        }

        System.out.println(q.poll());
        in.close();
    }
}
