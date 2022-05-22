import java.util.Scanner;

public class j_1018 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int color=0;
        int color_w;
        int color_b;
        in.nextLine();
        String[] board = new String[n];
        for(int i=0;i<n;i++){
            board[i] = in.nextLine();
        }
        

        for(int row=0;row<m-7;row++){
            
            for(int column=0;column<n-7;column++){
                //row,column은 8x8 해야할 판의 시작점 
                color_b=0;
                color_w=0;
              
                //b먼저
                for(int j=column;j<column+8;j++){
                    for(int i=row;i<row+8;i++){
                        if((i+j)%2==0){
                            if(board[j].charAt(i)=='W'){
                                color_b++;
                            }
                        }
                        else {
                            if(board[j].charAt(i)=='B'){
                                color_b++;
                            }
                        }
                    }
                }

                //다음 w
                for(int j=column;j<column+8;j++){
                    for(int i=row;i<row+8;i++){
                        if((i+j)%2==0){
                            
                                if(board[j].charAt(i)=='B'){
                                    color_w++;
                                }
                            
                            
                        }
                        else {
                            if(board[j].charAt(i)=='W'){
                                color_w++;
                            }
                        }
                    }
                }
                if(row==0 && column==0){
                    if(color_b<color_w){
                        color=color_b;
                    }
                    else {
                        color=color_w;
                    }
                }
                else {
                    if(color>color_w){
                        color=color_w;
                    }
                    if(color>color_b){
                        color=color_b;
                    }
                }
               
            }


        
        }

        System.out.println(color);


        in.close();
    }
}
