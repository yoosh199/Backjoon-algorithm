import java.util.*;
public class j_eratos {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Boolean arr[] = new Boolean[n+1];

        if(n<=1) return;
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<=n;i++){
            arr[i]=true;
        }
   

        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*2;j<=n;j=j+i){//여기서 생각해보면 i*i까지 다 검사되어있음
                    arr[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(arr[i]) System.out.println(i);
        }

        in.close();
    }
    
}
