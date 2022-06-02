import java.util.*;
import java.io.BufferedReader;
import java.io.*;
public class j_11650 {

    
    public static void main(String[] args) throws IOException{
       

      
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	



        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        // int[] x= new int[n];
        // int[] new_x= new int[n];
        // int[] y = new int[n];
        // int[] new_y= new int[n];
     

        // for(int i = 0; i < n; i++) {
        //     StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //     x[i] = Integer.parseInt(st.nextToken());
        //     new_x[i] = x[i];
        //     y[i] = Integer.parseInt(st.nextToken());

        // }
        // StringBuilder sb= new StringBuilder();
        // int length=1;
        // int y_index=0;
        // Arrays.sort(new_x);
        // for(int i=0;i<x.length-1;i++){
        //     if(new_x[i]==new_x[i+1]){
        //         length++;
        //     }
        //     else{
        //         int sy=0;
        //         int[] small_y = new int[length];
        //         for(int k=0;k<new_x.length;k++){
        //             if(x[k]==new_x[i]){
        //                 small_y[sy]=y[k];
        //                 sy++;
        //             }
        //         }
        //         Arrays.sort(small_y);
        //         for(int j=0;j<small_y.length;j++){
        //             new_y[y_index]=small_y[j];
        //             y_index++;
        //         }

        //         length=1;
        //     }
        // }

        // if(length==1){
        //     for(int k=0;k<new_x.length;k++){
        //         if(x[k]==new_x[new_x.length-1]){
        //             new_y[y_index]=y[k];
        //         }
        //     }
        // }
        // else {
        //     int sy=0;
        //         int[] small_y = new int[length];
        //         for(int k=0;k<new_x.length;k++){
        //             if(x[k]==new_x[new_x.length-1]){
        //                 small_y[sy]=y[k];
        //                 sy++;
        //             }
        //         }
        //         Arrays.sort(small_y);
        //         for(int j=0;j<small_y.length;j++){
        //             new_y[y_index]=small_y[j];
        //             y_index++;
        //         }
        // }

        // for(int i=0;i<x.length;i++){

        //     sb.append(new_x[i]).append(" ").append(new_y[i]).append("\n");
            
        // }
        // System.out.printf(sb.toString());
        // br.close();
    }
    
}

class Student {
 
	int age;			// 나이
	int classNumber;	// 학급
	
	Student(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
}