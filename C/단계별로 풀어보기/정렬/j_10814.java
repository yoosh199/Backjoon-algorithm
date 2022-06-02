import java.util.*;

public class j_10814 {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String[][] arr = new String[N][3];        
        in.nextLine();
        String a;
        String[] b;
        for(int i=0;i<N;i++){
            a=in.nextLine();
            b=a.split(" ");
            arr[i][0]=b[0];
            arr[i][1]=b[1];
            arr[i][2]=Integer.toString(i);
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            
            @Override
            public int compare(String[] e1,String[] e2){

                if(Integer.parseInt(e1[0])==Integer.parseInt(e2[0])){

                    return Integer.parseInt(e1[2])-Integer.parseInt(e2[2]);
                }
                else {
                    return Integer.parseInt(e1[0])-Integer.parseInt(e2[0]);
                }
          
            }

        });
        for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}

        in.close();
    }
}
