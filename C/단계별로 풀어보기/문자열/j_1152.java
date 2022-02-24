import java.util.*;

public class j_1152 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String[] split_input = input.split(" ");
        int count= split_input.length;

        for(int i=0;i<split_input.length;i++){
         // == 는 주소값 비교 equals 는 내용 비교
            if(split_input[i].equals("")){
               
                count--;
            }
        }

        System.out.println(count);

        in.close();
    }
    
}
