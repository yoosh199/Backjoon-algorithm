import java.util.*;

public class j_11047 {
    static int N,K;
    static int money[];
    static int count=0;
    static void find(int cost,int depth){
        if(cost==0){
            return;
        }
        if(depth==0){
            count+=cost;
            return;
        }
        if(cost/money[depth]>=1){
            count+=cost/money[depth];
            cost=cost%money[depth];
        }
        find(cost, depth-1);

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        K = in.nextInt();
        
        money = new int[N];
        for(int i=0;i<N;i++){
            money[i]=in.nextInt();
        }

        find(K,N-1);
        System.out.println(count);

        in.close();
    }
}