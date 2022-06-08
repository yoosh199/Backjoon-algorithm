import java.util.*;

public class j_1269 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        int count=0;
        int N=in.nextInt();
        
        int M= in.nextInt();
        in.nextLine();
        String n=in.nextLine();
        String m=in.nextLine();
        String[] nn;
        String[] mm;
        
        nn=n.split(" ");
        mm=m.split(" ");
        for(int i=0;i<N;i++){
            set.add(nn[i]);
        }
        for(int i=0;i<M;i++){
            if(set.contains(mm[i])){
                count++;
            }
        }

        System.out.println(M+N-2*count);
        in.close();
    }
}
