import java.util.*;

public class j_1157 {
    

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int[] count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int max=0;
        int same=0;
        int location = -1;

        char[] small = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        input = input.toUpperCase();
        
        for(int i=0;i<input.length();i++){

            for(int j=0;j<small.length;j++){
                if(input.charAt(i)==small[j]){
                    count[j]++;
                }
            }
       
        }

        for(int j=0;j<count.length;j++){

            if(max==count[j]&&max >0){
               
                same = 1;
            }
            if(max<count[j]){
                same=0;
                max=count[j];
                location= j;
            }

         
        }

        if(same ==1){
            System.out.printf("?");
        }
        else {
            System.out.println(small[location]);
        }

        in.close();

    }
}
