import java.util.Scanner;

public class j_4153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        String a="";
        String num[];
        int t;
        while(true){
            a = in.nextLine();
            num = a.split(" ");

            if(num[0].equals("0")) break;
            t=0;
            for(int i=0;i<3;i++){
                if(Integer.parseInt(num[i%3])*Integer.parseInt(num[i%3])==(Integer.parseInt(num[(i+1)%3])*Integer.parseInt(num[(i+1)%3])+Integer.parseInt(num[(i+2)%3])*Integer.parseInt(num[(i+2)%3]))){
                    sb.append("right").append("\n");
                    t=1;
                }
               
            }
            if(t==0){
                sb.append("wrong").append("\n");
            }
            
          
        
            
        }
        System.out.printf(sb.toString());
        in.close();
    }
}
