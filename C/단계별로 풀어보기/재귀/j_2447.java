import java.util.Scanner;

public class j_2447 {

    public static char[][] three_star(int n,char arr[][],int length){
       
     
     
        if(n>=3){
            
            for(int i=0;i<length;i++){
                for(int j=0;j<length;j++){
                    
                    if((float)(i%n)/(float)n>=((float)1/(float)3) && (float)(i%n)/(float)n<((float)2/(float)3) && (float)(j%n)/(float)n>=((float)1/(float)3) && (float)(j%n)/(float)n<((float)2/(float)3)){
                        
                        arr[i][j]=' ';
                    }
                    
                }
            }
            
        }
        else {
            return arr;
        }
        
        return three_star(n/3,arr,length);
       
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char arr[][] = new char[n][n];
        StringBuilder br = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='*';
            }
        }
        arr =three_star(n,arr,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                br.append(arr[i][j]);
            }
            br.append("\n");
        }
        System.out.print(br.toString());

        in.close();
    }
}
