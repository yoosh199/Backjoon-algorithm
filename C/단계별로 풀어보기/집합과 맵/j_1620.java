import java.util.*;;

public class j_1620 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
        HashMap<String,String> num_name = new HashMap<String,String>();
        

        int N=in.nextInt();
        String[] n = new String[N];
        int M= in.nextInt();
        String[] m = new String[M];
        in.nextLine();
        for(int i=0;i<N;i++){
            n[i]=in.nextLine();
            num_name.put(Integer.toString(i+1), n[i]);
            num_name.put( n[i],Integer.toString(i+1));
        }
        for(int i=0;i<M;i++){
            m[i]=in.nextLine();

            sb.append(num_name.get(m[i])).append("\n");
            
        }

        System.out.printf(sb.toString());

        in.close();
    }
}
