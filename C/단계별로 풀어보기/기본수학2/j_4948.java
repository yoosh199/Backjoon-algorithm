import java.util.*;


public class j_4948 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<Boolean> primeList;
        int n;
        int count;
        while(true){
            count=0;
            n = scan.nextInt();

            if(n==0)break;
            primeList = new ArrayList<Boolean>(2*n+1);
            primeList.add(false);
            primeList.add(false);
            for(int i=2; i<=2*n; i++ )
                primeList.add(i, true);

            for(int i=2; (i*i)<=2*n; i++){
                if(primeList.get(i)){
                    for(int j = i*i; j<=2*n; j+=i) primeList.set(j, false);
             
                }
            }
 
            for(int i=n+1; i<=2*n; i++){
                if(primeList.get(i) == true){
                    count++;
                    
               
                }
            }
            sb.append(count).append("\n");


        }

        System.out.print(sb.toString());
        scan.close();
    }
    
}
