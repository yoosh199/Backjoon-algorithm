import java.util.*;

public class j_10828 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    
        Stack<Integer> stack = new Stack<>();
     
        StringBuilder sb=new StringBuilder();
        int N = in.nextInt();
        in.nextLine();
        for(int i=0;i<N;i++){
            String a= in.nextLine();
            if(a.length()==3){
                if(a.charAt(0)=='p'){
                    //pop
                    try {
                        sb.append(stack.pop()).append("\n");
                   }catch(EmptyStackException e){
                    sb.append(-1).append("\n");
                    }
                    
                    

                }
                else {
                    //top
                    
                    try {
                        sb.append(stack.peek()).append("\n");
                   }catch(EmptyStackException e){
                       sb.append(-1).append("\n");
                       }  
                    
                }
            }
            if(a.length()==4){
                //size
                sb.append(stack.size()).append("\n");
                
            }
            if(a.length()>=5){
                if(a.charAt(0)=='p'){
                    //push
                    String[] aa=a.split(" ");
                    stack.push(Integer.parseInt(aa[1]));
         
                }
                else {
                    //empty
                    if(stack.empty()){
                        sb.append(1).append("\n");
                    }
                    else {
                        sb.append(0).append("\n");
                    }
         
                    
                    
                }
            }
            
        }

        System.out.printf(sb.toString());
        in.close();
    }
}