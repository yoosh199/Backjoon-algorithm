import java.util.*;

public class j_1764 {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        int count=0;
        int N=in.nextInt();
        String[] n = new String[N];
        int M= in.nextInt();
        String[] m = new String[M];
        in.nextLine();
        for(int i=0;i<N;i++){
            n[i]=in.nextLine();
          
        }
        Arrays.sort(n);
        for(int i=0;i<N;i++){
            
            set.add(n[i]);
        }
        for(int i=0;i<M;i++){
            m[i]=in.nextLine();
        }
        Arrays.sort(m);

        for(int i=0;i<M;i++){
          
            if(set.contains(m[i])){
                count++;
                sb.append(m[i]).append("\n");
            }
        }

        System.out.println(count);
        System.out.printf(sb.toString());

        in.close();
    }
    
}
