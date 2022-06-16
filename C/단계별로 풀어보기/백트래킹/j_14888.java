import java.util.*;

public class j_14888 { 

    public static int max=0;
    public static int min=0;
    public static int[] four = new int[4];
    public static int[] arr;
    public static int N;
    public static int a=0;
    public static void calculator(int depth,int sum){
        if(depth==N-1){
            if(a==0){
                max=sum;
                min=sum;
                a++;
            }
            else {
                if(max<sum)max=sum;
                if(min>sum)min=sum;
            }
           
            
            return;
        }


        for(int i=0;i<4;i++){
            if(four[i]>0){
                if(i==0){
                
                    four[i]--;
                    calculator(depth+1, sum+arr[depth+1]);
                    four[i]++;
                }
                if(i==1){
                    four[i]--;
                    calculator(depth+1, sum-arr[depth+1]);
                    four[i]++;
                }
                if(i==2){
                    
                    four[i]--;
                    calculator(depth+1, sum*arr[depth+1]);
                    four[i]++;
                }
                if(i==3){
                    
                    four[i]--;
                    calculator(depth+1, sum/arr[depth+1]);
                    four[i]++;
                }

               
            }
        }
        

        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        arr=  new int[N];
        
        for(int i=0;i<N;i++){
            arr[i]= in.nextInt();
        }
        for(int i=0;i<4;i++){
            four[i]= in.nextInt();
        }
    
        calculator(0, arr[0]);

        System.out.println(max);
        System.out.println(min);
        in.close();
    }
}
