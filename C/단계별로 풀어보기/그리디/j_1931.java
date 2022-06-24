import java.util.*;

public class j_1931 {
	static int arr[][];
	static int max= -1;
	static int N;
	static int count=0;
	static void find(int start,int index){
		
		if(index==N){
			
			return;
		}
		// arr[i][1] 이 가장작은거 찾기
		
		
		for(int i=index+1;i<N;i++){
			if(arr[i][0]>=start){
				count++;
				find(arr[i][1], i);
				break;
			}
		}

	


	}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        N = in.nextInt();
        arr = new int[N][2];
        for(int i = 0; i < N; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			} else {
				return e1[1] - e2[1];
			}
		});

		
		
		count++;
		find(arr[0][1],0);

		System.out.println(count);
        in.close();
    }
}
