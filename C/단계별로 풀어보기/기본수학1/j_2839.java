import java.io.*;

public class j_2839 {//그리디 알고리즘
    

    public static int greedy(int n){
        int five = 0;
        int three = 0;
        int x = 0; // 0 일때 5 씩 빼고, 1일때 3씩 뺀다.
    
        while(true){
            if(n<0){
               
                x=1;
                five--;
                three++;
                n=n+5-3;
                if(five<0){//경우의수 없음
                    five=-1;
                    three=0;
                    break;
                }
                
            }
            else if(n>0 && x==1){//n이 1이상일경우 3씩 빼준다
                three++;
                n=n-3;
            }
            if(n==0){
                break;
            }
            if(x==0){
                five++;
                n= n-5;
            }
           
            

        }
        
        
        return five+three;
    }

    

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String a = in.readLine();
        int n=Integer.parseInt(a);


        


        System.out.println(greedy(n));
        in.close();
    } 
    
}
