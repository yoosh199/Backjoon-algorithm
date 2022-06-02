import java.util.*;

public class j_11651 {
    public static void main(String[] args){
    
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[][] arr = new int[N][2];

        for(int i=0;i<N;i++){
            arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            
            @Override
            public int compare(int[] e1,int[] e2){
                if(e1[1]==e2[1]){
                    return e1[0]-e2[0];
                }   
                else {
                    return e1[1]-e2[1];
                }
            }
        });

        for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}

        in.close();
    }
}
