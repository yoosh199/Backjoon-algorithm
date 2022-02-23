import java.util.*;

public class j_10809 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
     
        char[] alpa = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] counter = new int[alpa.length];

        for(int i=0;i<counter.length;i++){
            counter[i]=-1;
        }

        for(int i=0;i<a.length();i++){


            for(int j=0;j<alpa.length;j++){
                if(a.charAt(i)==alpa[j]){
                    if(counter[j]== -1){
                        counter[j]=i;
                    }
                   
                }
            }
            
        }

        for(int i=0;i<counter.length;i++){
            System.out.printf("%d ", counter[i]);
        }

        in.close();

    }
}
