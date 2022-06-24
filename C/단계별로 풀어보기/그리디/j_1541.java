import java.util.*;

public class j_1541 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum=0;
        String a =in.nextLine();
        String[] minus = a.split("-");

        for(int i=0;i<minus.length;i++){
            String[] plus = minus[i].split("\\+");
          

            for(int j=0;j<plus.length;j++){
     
                if(i==0){
                    sum+=Integer.parseInt(plus[j]);
                }
                else {
                    sum-=Integer.parseInt(plus[j]);
                }
             
            }
        }

        System.out.println(sum);
        in.close();
    }
}
