import java.util.*;

public class j_4949 {
    static int fun(String a){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='('||a.charAt(i)=='['){
                stack.push(a.charAt(i));
            }


            if(a.charAt(i)==')'){
                if(stack.empty()||stack.peek()!='('){
                    return 0;
                }
                else{
                    stack.pop();
                }
                
               
                
            }

            if(a.charAt(i)==']'){
                if(stack.empty()||stack.peek()!='['){
                    return 0;
                }
                else{
                    stack.pop();
                }
                
                
            }

        }


        if(stack.empty()){
            return 1;
        }
        else {
            return 0;
        }


    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
    
        String a;
     
        while(true){
            a=in.nextLine();
            if(a.equals(".")){
                break;
            }


            if(fun(a)==1){
                sb.append("yes").append("\n");
            }
            else {
                sb.append("no").append("\n");
            }
        }

        System.out.printf(sb.toString());
        in.close();
    }
}
