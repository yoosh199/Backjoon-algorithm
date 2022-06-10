import java.util.Scanner;

public class j_2477{
    

    public static void main(String[] args){

       
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dir = new int[6];
        int[] m = new int[6];
        int max_col=0;
        int max_col_num=-1;
        int max_row=0;
        int max_row_num=-1;
        in.nextLine();
        String a="";
        
        for(int i=0;i<6;i++){
            a=in.nextLine();
            String[] b = a.split(" ");
            
            dir[i]= Integer.parseInt(b[0]);
            m[i]= Integer.parseInt(b[1]);
        }
        for(int i=0;i<6;i++){
            if(dir[i]==1 || dir[i]==2){
                if(m[i]>max_col){
                    max_col=m[i];
                    max_col_num=i;
                }
            }
            if(dir[i]==3 || dir[i]==4){
                if(m[i]>max_row){
                    max_row=m[i];
                    max_row_num=i;
                }
            }
        }
        
       
        System.out.println(n*(max_col*max_row-(max_row-Math.min(m[(max_col_num-1+6)%6], m[(max_col_num+1+6)%6]))*(max_col-Math.min(m[(max_row_num-1+6)%6], m[(max_row_num+1+6)%6]))));        



        in.close();
    }
}