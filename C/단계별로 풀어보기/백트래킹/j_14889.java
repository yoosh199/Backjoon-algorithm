import java.io.*;
import java.util.*;

public class j_14889 {

    public static boolean[] visit;
    public static int N;

    public static int[][] football;
    public static int abs;
    public static int fisrt=0;
    public static int count=0;

    static void cal(){
        int st=0;
            int lk=0;
            
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(visit[i]&&visit[j]&&i!=j){
                        st+=football[i][j];
                    }

                    if(!visit[i]&&!visit[j]&&i!=j){
                        lk+=football[i][j];
                    }
                }

            }
            if (st-lk == 0) {
                System.out.println(0);
                System.exit(0);
            }
           
   
            if(fisrt==0){
                abs= Math.abs(st-lk);
                fisrt++;
            }
            else {
                if(abs>Math.abs(st-lk)){
                    abs=Math.abs(st-lk);
                }
            }
    }

    public static void makeTeam(int depth,int aa){
        if(aa == N/2){
           
           cal();
            return;
        }

        
        for(int i=depth;i<N;i++){
            if(!visit[i]){
                visit[i]=true;
        
                makeTeam(i+1,aa+1);
                visit[i]=false;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        // Scanner in = new Scanner(System.in);

        // N= in.nextInt();
        // visit= new boolean[N];
        // football = new int[N][N];
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		N = Integer.parseInt(br.readLine());
		football = new int[N][N];
		visit = new boolean[N];
    
 
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			for (int j = 0; j < N; j++) {
				football[i][j] = Integer.parseInt(st.nextToken());
			}
		}

    
        makeTeam(0,0);
        System.out.println(abs);
        br.close();
    }
    
}
