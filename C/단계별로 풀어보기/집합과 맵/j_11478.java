import java.util.*;

public class j_11478 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
        TreeSet<String> tree = new TreeSet<String>();
        String input = in.nextLine();
        int length=1;

        String a="";
        while(input.length()-length>=0){
          
            for(int i=0;i<input.length()+1-length;i++){
                a=input.substring(i, i+length);
                tree.add(a);
         
            }
            
            length++;   
            
        }
       
        System.out.println(tree.size());

        in.close();
    }
}
