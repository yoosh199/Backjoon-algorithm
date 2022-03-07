import java.util.*;

public class j_2675 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testcase = in.nextInt();
        int[] r = new int[testcase];
        String[] s = new String[testcase];

        for(int i=0;i<testcase;i++){
            r[i] = in.nextInt();
            s[i] = in.nextLine();
        }

   

    
        
      
        for(int i=0;i<testcase;i++){

            for(int k=1;k<s[i].length();k++){ //문자열 받을때 공백도 포함되는거 같음
   
                for(int j=0;j<r[i];j++){ //여기는 그냥 반복
                    System.out.printf("%c",s[i].charAt(k));
     
                }
            }

            System.out.printf("\n");
         
        }


        



           
      


        in.close();
    }
    
}
