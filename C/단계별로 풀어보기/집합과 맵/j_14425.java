import java.util.*;;
public class j_14425 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count=0;
        String[] n= new String[N];
        int M= in.nextInt();
        String[] m= new String[M];
        in.nextLine();
        for(int i=0;i<N;i++){
            n[i]=in.nextLine();
        }
        for(int i=0;i<M;i++){
            m[i]=in.nextLine();
        }


        HashSet<String> hash= new HashSet<String>();
        for(int i=0;i<N;i++){
            hash.add(n[i]);
        } 

        for(int i=0;i<M;i++){
            if(hash.contains(m[i])){
                count++;
            }
    
        } 
        System.out.println(count);

        in.close();
    }
}
