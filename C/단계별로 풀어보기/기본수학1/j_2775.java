import java.io.*;
public class j_2775 {


    public static int func(int a, int b){

        if(a ==0){
            return b;
        }
        else if(b == 1){
            return 1;
        }
        else{
            return func(a-1,b)+func(a,b-1);
        }

    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String a = in.readLine();

        int testcase = Integer.parseInt(a);
        int people[] = new int[testcase];
        String two[] = new String[2];

        for(int i=0; i<testcase;i++){
            two[0]=in.readLine();
            two[1]= in.readLine();
            people[i]=func(Integer.parseInt(two[0]),Integer.parseInt(two[1]));
            

        }
        for(int i=0; i<testcase;i++){
            System.out.println(people[i]);
            

        }

     
        in.close();
    }
    
}
