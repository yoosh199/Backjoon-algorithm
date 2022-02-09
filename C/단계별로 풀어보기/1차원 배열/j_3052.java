import java.util.Scanner;

public class j_3052 {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        
        int[] arr = new int[10]; 
        int dif=0;

        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            arr[i]= arr[i]%42;
        }

        for(int k=0;k<42;k++){
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]==k){
                    dif++;
                    break;
                }
            }
          
        }

        System.out.print(dif);

     

        in.close();
        
    }
}
