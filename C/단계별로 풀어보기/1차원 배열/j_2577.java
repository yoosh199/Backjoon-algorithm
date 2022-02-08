import java.util.Scanner;


public class j_2577 {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        int[] arr = new int[10]; 
        for(int k=0;k<arr.length;k++){
            arr[k]=0;
        }
        int a = in.nextInt();
      
        int b = in.nextInt();
      
        int c =in.nextInt();

        if(a>=100&&a<1000&&b>=100&&b<1000&&c>=100&&c<1000){
            int abc= a*b*c;
            while(abc >0){
                arr[abc%10]++;
                abc=abc/10;
                
            }
           
            for(int i=0;i<10;i++){
                System.out.printf("%d\n",arr[i]);
            }
        }
        
    
        

        in.close();
        
    }
}