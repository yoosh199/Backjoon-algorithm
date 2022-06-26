import java.util.*;

public class j_10773 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    
        Stack<Integer> stack = new Stack<>();
     
        StringBuilder sb=new StringBuilder();
        int sum=0;
        int N = in.nextInt();
        for(int i=0;i<N;i++){
            int a = in.nextInt();
            if(a==0){
                stack.pop();
            }
            else{
                stack.push(a);
            }
        }

        int size= stack.size();
        if(stack.size()==0){

        }
        else {
            for(int i=0;i<size;i++){
                sum+=stack.pop();
               
            }
        }
        System.out.println(sum);

        in.close();
    }
}
