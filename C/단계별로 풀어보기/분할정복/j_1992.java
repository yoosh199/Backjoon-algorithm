import java.util.*;

public class j_1992 {
    static int arr[][];
    static StringBuilder sb = new StringBuilder();

    
    static boolean check(int row,int col, int size){
        
        int color = arr[row][col];

        for(int i=row;i<row+size;i++){
            for(int j=col;j<col+size;j++){
                if(arr[i][j]!=color){
                    return false;
                }
            }
        }

        return true;
    }

    static void zip(int row, int col , int size){
        
        if(check(row, col, size)){
            sb.append(arr[row][col]);
        
            return;
        }

        int newSize = size/2;
       
        sb.append("(");
        zip(row, col, newSize);		
    

    
		zip(row, col + newSize, newSize);	
     

		zip(row + newSize, col, newSize);	
    

		zip(row + newSize, col + newSize, newSize);	
        sb.append(")");	
 	
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        arr = new int[N][N];
        for(int i=0;i<N;i++){
            String s = in.nextLine();
            for(int j=0;j<N;j++){
                
                arr[i][j]= Character.getNumericValue(s.charAt(j));
             
            }
         
        }
        zip(0,0,N);
        System.out.println(sb.toString());
        in.close();
    }
}
