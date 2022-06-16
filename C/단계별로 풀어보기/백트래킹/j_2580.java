import java.util.*;

public class j_2580 {
    public static int N=0;
    public static int map[][]=new int[9][9];
    
    public static void validation(int row, int col){
        int count=0;
        int sum=0;
        for(int i=0;i<9;i++){
            sum+=map[row][i];
            if( map[row][i]==0){
                count++;
                
            }
        }
        if(count==1){
            map[row][col]=45-sum;
            N--;
            return;
        }
        count=0;
        sum=0;
        for(int i=0;i<9;i++){
            sum+=map[i][col];
            if( map[i][col]==0){
                count++;
                
            }
        }
        if(count==1){
            map[row][col]=45-sum;
            N--;
            return;
        }
        count=0;
        sum=0;
        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){
                sum+=map[3*(row%3)+i][3*(col%3)+j];
                if( map[3*(row%3)+i][3*(col%3)+j]==0){
                    count++;
                }
            }
        }
        if(count==1){
            map[row][col]=45-sum;
            N--;
            return;
        }
        return;
    }
    
    public static void sdocu(int row, int col){
        if(N==0){
            return;
        }

        if(map[row][col]==0){
            validation(row, col);
            if(col==8){
                sdocu((row+1)%9, 0);
            }
            else {
                sdocu(row%9, (col+1)%9);
            }
        }
        else {
            if(col==8){
                sdocu((row+1)%9, 0);
            }
            else {
                sdocu(row%9, (col+1)%9);
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				map[i][j] = in.nextInt();
                if(map[i][j]==0){
                    N++;
                }
			}
		}
     
        sdocu(0, 0);
        for(int i=0;i<9;i++){
            
            for(int j=0;j<9;j++){
                sb.append(map[i][j]).append(" ");
            
            }
            sb.append("\n");
        }
        System.out.printf(sb.toString());
 
    }
  
}
