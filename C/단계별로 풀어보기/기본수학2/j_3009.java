import java.util.Scanner;

public class j_3009 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //3개의 점들을 각각 뺏을때 0이 아닌 점을들을 더해서 나누기 2한것이 중심점
        int x1= in.nextInt();
        int y1= in.nextInt();
        int x2= in.nextInt();
        int y2= in.nextInt();
        int x3= in.nextInt();
        int y3= in.nextInt();
        
        float center_x=0;
        float center_y=0;
        if(x1-x2 !=0&& y1-y2!=0){
            center_x=((float)x1+(float)x2)/2;
            center_y=((float)y1+(float)y2)/2;
        }
        if(x1-x3 !=0&& y1-y3!=0){
            center_x=((float)x1+(float)x3)/2;
            center_y=((float)y1+(float)y3)/2;
        }
        if(x3-x2 !=0&& y3-y2!=0){
            
            center_x=((float)x3+(float)x2)/2;
            center_y=((float)y3+(float)y2)/2;
        }
        
        
        System.out.printf("%d %d",(int)(center_x-((float)x1+(float)x2+(float)x3-3*center_x)),(int)(center_y-((float)y1+(float)y2+(float)y3-3*center_y)));

        in.close();

    }
    
}
