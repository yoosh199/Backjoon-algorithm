import java.io.*;

public class j_10757 {
//앞에 0으로 채우기!!
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        String[] two_integer=input.split(" ");
        int n=1;
        int x;
        int next = 0; //1 올림인지 아닌지
        int first_integer_length = two_integer[0].length();
        int second_interger_length = two_integer[1].length();
        String output="";
        int max;

        if(first_integer_length>second_interger_length){
            for(int i=0;i<first_integer_length-second_interger_length;i++){
                two_integer[1]="0"+two_integer[1];
            }
            max=first_integer_length;
        }
        else if(first_integer_length<second_interger_length){
            for(int i=0;i<second_interger_length-first_integer_length;i++){
                two_integer[0]="0"+two_integer[0];
            }
            max=second_interger_length;
        }
        else{
            max = second_interger_length;
        }
        
        while(n<=max){
       
            if(next==1){
                x= (int)two_integer[0].charAt(max-n)-48+(int)two_integer[1].charAt(max-n)-48+1;
           
                if(x>=10){
                 
                    output=Integer.toString(x%10)+output;
                    next=1;
                }
                else{
                    output=Integer.toString(x)+output;
                    next=0;
                }

            }
            else{
                x= (int)two_integer[0].charAt(max-n)-48+(int)two_integer[1].charAt(max-n)-48;
                if(x>=10){
                    output=Integer.toString(x%10)+output;
                    next=1;
                }
                else{
                    output=Integer.toString(x)+output;
                    next=0;
                }
          
            
            }
            n++;

        }
        if(next==1){
            output = "1"+output;
        }
    
        System.out.println(output);
       

        in.close();
    }
    
}
