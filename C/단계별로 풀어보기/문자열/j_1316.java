import java.util.*;

public class j_1316 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testcase = in.nextInt();
        String[] input = new String[testcase];
   
        
        
        int[] input_value = new int[testcase];

 
        int sum = 0;
        int count;
        in.nextLine();
        for(int i=0;i<testcase;i++){
          
            input[i]= in.nextLine();
    
            input_value[i]=1;
        }

      
        for(int i=0;i<testcase;i++){
            count=0;
        
            for(int j=0;j<input[i].length()-1;j++){
      
             
                if(input[i].charAt(j) != input[i].charAt(j+1)){
                    
                    count++;
                    
                    String temp= input[i].replace(Character.toString(input[i].charAt(j)), "");
                    if(input[i].length()-temp.length() != count){
                        input_value[i]=0;
                    }
                    count=0;
                }
                else {
                    count++;
                }
            }
         
        }
        for(int i=0;i<testcase;i++){
            sum += input_value[i];
        }

        System.out.println(sum);
       in.close();

    }
    
}
