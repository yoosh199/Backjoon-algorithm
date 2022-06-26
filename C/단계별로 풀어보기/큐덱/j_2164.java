import java.util.*;


public class j_2164 {
    public static void main(String[] args){
    
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        Queue<Integer> q = new LinkedList<>();
        int th =1;

        for(int i=1;i<=N;i++){
            q.add(i);
        }

        while(true){
            
            if(th==1){
                q.poll();

                th=0;
            }
            else {
                if(q.size()==1){
                    break;
                }
                q.add(q.poll());
                th=1;
            }
        }

        System.out.println(q.poll());
        in.close();
    }
}
