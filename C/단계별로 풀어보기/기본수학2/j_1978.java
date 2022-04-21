import java.util.Scanner;

public class j_1978 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int x = 0;//갯수
        int j=2;

        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        
        
        for(int i=0;i<n;i++){
            if(arr[i]==1){
            }
            else {
            
                for(j=2;j<arr[i];j++){
                    if(arr[i]%j==0){
                        break;
                    }
                }
                if(j==arr[i]){
                    x++;
                }
            }

        }


        System.out.println(x);
        in.close();
    }
    
}
