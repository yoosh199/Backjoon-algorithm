import java.util.*;

public class j_2108 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum=0;
        int mode=1;
        int temp=1;
        int cur=0;
        int second=1; //최빈값이 2번째로 작은
   
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
      

        for(int i=0;i<n;i++){
            if(i==n-1){
                if(mode==temp){

                    System.out.println("-------------");
                    System.out.println(second);
                    if(second==2){
                        cur=i;
                        second++;
                    }
                    if(second==1){
                        second++;
                    }

                    
                }
                if(mode<temp){
                    mode=temp;
                    cur=i;
                    second=2;
                }
            }
            else {
               
                if(arr[i]==arr[i+1]){
                  
                    temp++;
                }
                else {
                    
                    if(mode==temp){
                        // System.out.printf("i : %d , mode: %d, temp: %d, count%d \n", i, mode,temp,count);
                        if(second==2){
                            cur=i;
                            second++;
                        }
                        if(second==1){
                            // System.out.println("38*************");
                            second++;
                        }

                        
                    }
                    if(mode<temp){
                        mode=temp;
                        cur=i;
                        second=2;
                    }
                    temp=1;
                }
            }
            
        }
        System.out.println(Math.round((float)sum/(float)n));
        System.out.println(arr[n/2]);
        System.out.println(arr[cur]);
        System.out.println(arr[n-1]-arr[0]);

        in.close();
    }
}
