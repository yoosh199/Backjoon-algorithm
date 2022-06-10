import java.util.Scanner;

public class j_1004 {

    public static void main(String[] args){       
        Scanner in = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        int test = in.nextInt();
        in.nextLine();
        int arrival_x= 0;
        int arrival_y= 0;
        int departure_x= 0;
        int departure_y= 0;
        String arr_dep;
        int n=0;
        int count=0;
        int flag=0;
        String planets;
        for(int i=0;i<test;i++){
           
            count=0;
            arr_dep=in.nextLine();
            String[] arr_dep1 = arr_dep.split(" ");
            departure_x=Integer.parseInt(arr_dep1[0]);
            departure_y=Integer.parseInt(arr_dep1[1]);
            arrival_x=Integer.parseInt(arr_dep1[2]);
            arrival_y=Integer.parseInt(arr_dep1[3]);

            //행성 n
            n= in.nextInt();    
            in.nextLine();
            for(int j=0;j<n;j++){
                flag=0;
                planets=in.nextLine();
                String[] planet = planets.split(" ");
                if(((departure_x-Integer.parseInt(planet[0]))*(departure_x-Integer.parseInt(planet[0]))+(departure_y-Integer.parseInt(planet[1]))*(departure_y-Integer.parseInt(planet[1])))<=Integer.parseInt(planet[2])*Integer.parseInt(planet[2])){
                    count++;
                    flag++;
                }
                if(((arrival_x-Integer.parseInt(planet[0]))*(arrival_x-Integer.parseInt(planet[0]))+(arrival_y-Integer.parseInt(planet[1]))*(arrival_y-Integer.parseInt(planet[1])))<=Integer.parseInt(planet[2])*Integer.parseInt(planet[2])){
                    count++;
                    flag++;
                }
                if(flag==2){
                    count=count-2;
                }
            }
            sb.append(count).append("\n");

        }
        System.out.printf(sb.toString());
        
        in.close();
    }
}
