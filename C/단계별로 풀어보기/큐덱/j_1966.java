import java.util.*;

public class j_1966 {
    public static void main(String[] args){
    
		Scanner in = new Scanner(System.in);
        HashSet<Integer> set =new HashSet<Integer>();
        
        int t = in.nextInt();
        int N,M;
        Integer arr[];
        int cursor;
        StringBuilder sb = new StringBuilder();
        int m;
        for(int i=0;i<t;i++){
            int print = 0;
            N = in.nextInt();
            M = in.nextInt();
            arr = new Integer[N];
            cursor = M;
            Queue<Integer> q = new LinkedList<>();
            for(int j=0;j<N;j++){
                m=in.nextInt();
                set.add(m);
                q.offer(m);
                arr[j]=m;
            }
            Arrays.sort(arr, Collections.reverseOrder());

            int index=0;
            while(true){
                if(q.isEmpty()){
                    break;
                }
                else{
                    if(q.peek()==arr[index]){
                        if(cursor==0){
                            print++;
                            break;
                        }
                        q.poll();
                        print++;
                        cursor--;
                        index++;
                    }
                    else {
                        q.offer(q.poll());
                        cursor--;
                        if(cursor<0){
                            cursor=q.size()-1;//맨뒤로
                        }
                    }
                }
                
            }

            sb.append(print).append("\n");
        }

        System.out.printf(sb.toString());
       

    
        in.close();
    }
}
