import java.util.Scanner;

public class j_2292 {

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int start = 1;
        int sum = start;
        int room = 1;
        while(input> sum){ // input <= sum 이 되는구간이 그 외각 껍질의 갯수
          
            sum+= start*6; // 1,6,12,18 순으로 계속 증가함
            start++;
            room++;
            
        }

        System.out.println(room);


        in.close();
    }
    
}
