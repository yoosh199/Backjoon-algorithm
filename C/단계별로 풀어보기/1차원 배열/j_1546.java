import java.util.Scanner;


public class j_1546 {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        float a = in.nextInt();
        float max=0;
        float sum=0;
        
        float[] arr = new float[(int)a]; 
        for(int k=0;k<a;k++){
            arr[k]=in.nextFloat();
            if(arr[k]>max){
                max=arr[k];
            }
        }
       
        for(int k=0;k<a;k++){
            sum = sum + (arr[k]/max)*100;
        
        }
        
        System.out.printf("%f\n", sum/a);
  
        

        in.close();
        
    }
}