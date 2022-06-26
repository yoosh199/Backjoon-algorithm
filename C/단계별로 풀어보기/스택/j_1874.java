import java.util.*;

public class j_1874 {
    
    static StringBuilder sb = new StringBuilder();
    static int func(int N, int[] arr){
        


        Stack<Integer> stack = new Stack<>();
        int num=1;
        int index=0;
        while(true){
            if(stack.empty()){
                if(num>N){
                    return 1;
                }
                stack.push(num);
                sb.append("+").append("\n");
                num++;
            }
            else {
                if(stack.peek()!=arr[index]){
                    if(num>N){
                        return 0;
                    }
                    stack.push(num);
                    sb.append("+").append("\n");
                    num++;
                }
                else {
                    stack.pop();
                    index++;
                    sb.append("-").append("\n");
                }
            }

            

        }
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N=in.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }

        if(func(N, arr)==1){
            System.out.printf(sb.toString());
        }
        else {
            System.out.println("NO");
        }
        
       

        


















        in.close();
    }
}
