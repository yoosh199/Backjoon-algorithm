
import java.util.Scanner;
import java.util.Arrays;

public class j_1065 {

    public static int an_arithmetical_progression(int num){
  
        int sum=0;
        if(num<100){
            return 1;
        }
        
        else{
            String string_num= Integer.toString(num);
            int[] equal = new int[string_num.length()-1];
            Arrays.fill(equal, 0);
            int interv = string_num.charAt(0)-string_num.charAt(1);
            equal[0]=1;
    
            for(int i=1;i<string_num.length()-1;i++){
                
                    if(string_num.charAt(i)-string_num.charAt(i+1)==interv){
                        equal[i]=1;
                    }
             
            }
            for(int i=0;i<equal.length;i++){
                sum += equal[i];
            }
            if(sum+1 == string_num.length()){
                return 1;
            }
            
            return 0;

        }
       
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int aap=0;

        for(int i=1;i<=num;i++){
            if(an_arithmetical_progression(i)==1){
                aap++;
            }
        }
     
        System.out.println(aap);

        in.close();

    }
    
}
