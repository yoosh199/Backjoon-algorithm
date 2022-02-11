import java.util.Scanner;

public class j_8958 {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

    
       //예외처리 해야함
        

        int testcase= in.nextInt();
       
        String[] arr= new String[testcase];
        int[] sum = new int[testcase];
            for(int i=0;i<testcase;i++){
                arr[i]= in.next();
            
                sum[i]=0;
            }
            int contin=0;
            for(int i=0;i<testcase;i++){
                contin=0;
    
                for(int k=0;k<arr[i].length();k++){
                    if(arr[i].charAt(k)=='O'){
                        contin++;
                        sum[i]= sum[i]+contin;
                    }
                    else {
                        contin=0;
                    }
                }
            }
            for(int i=0;i<testcase;i++){
                System.out.println(sum[i]);
            }

        
      
  

        in.close();
        
    }
}
