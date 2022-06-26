import java.util.*;

public class j_9012 {
    static int YES=1;
    static int NO=0;

    static int fun(String a){
        Stack<Character> stack = new Stack<>();
        for(int j=0;j<a.length();j++){
               
            if(a.charAt(j)=='('){
                stack.push(a.charAt(j));
            }
            else {
                if(stack.empty()){
                    
                    return NO;
                }
                stack.pop();
            }

        }
        if(stack.empty()){
            return YES;
        }
        else {
            return NO;
        }
       

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        
        Stack<Character> temp = new Stack<>();
        int N = in.nextInt();
        in.nextLine();
     
        for(int i=0;i<N;i++){
            String a = in.nextLine();
            if(fun(a)==1){
                sb.append("YES").append("\n");
            }
            else {
                sb.append("NO").append("\n");
            }
            
            
                
        }
                
            
        System.out.printf(sb.toString());
        in.close();
    }
}
