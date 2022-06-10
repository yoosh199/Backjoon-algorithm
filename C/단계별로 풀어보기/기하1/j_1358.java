import java.util.Scanner;

public class j_1358 {
    public static void main(String[] args){       
        Scanner in = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();

        String input = in.nextLine();
        String[] data = input.split(" ");
    
        Double W = Double.parseDouble(data[0]);
        Double H = Double.parseDouble(data[1]);
        Double X = Double.parseDouble(data[2]);
        Double Y = Double.parseDouble(data[3]);
        Double P = Double.parseDouble(data[4]);
        
        int count=0;
        for(int i=0;i<P;i++){
           
            String a= in.nextLine();
            String[] aa = a.split(" ");
            Double x= Double.parseDouble(aa[0]);
            Double y= Double.parseDouble(aa[1]);

            if(Math.pow(X-x, 2)+Math.pow(Y+H/2-y, 2)<=H*H/4){
                count++;
            }
            else if(Math.pow(X+W-x, 2)+Math.pow(Y+H/2-y, 2)<=H*H/4){
                count++;
            }
            else if(x>=X && x<=X+W && y>=Y && y<=Y+H){
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
