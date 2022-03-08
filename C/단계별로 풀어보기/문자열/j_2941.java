import java.util.*;
public class j_2941 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
     
        for(int i=0;i<croatia.length;i++){
           
            text = text.replace(croatia[i], "/");

        }
       
    
    
        System.out.println(text.length());
        

     

        in.close();
    }
    
}
