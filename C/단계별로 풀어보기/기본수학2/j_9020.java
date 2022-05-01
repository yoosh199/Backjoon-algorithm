import java.util.*;

public class j_9020 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testcase = in.nextInt();
        int arr[] = new int[testcase];
        Boolean arr1[];
        int a,b;
        
        for(int i=0;i<testcase;i++){
            arr[i]= in.nextInt();
        }

        for(int i=0;i<testcase;i++){
             a=1;
             b=1;
             //-------------------------------- 밑에 에라토스의 체
            arr1 = new Boolean[arr[i]+1];

            for(int k=2;k<=arr[i];k++){
                arr1[k]=true;
            }
            arr1[0]= false;
            arr1[1]= false;

            for(int j=2;j*j<=arr[i];j++){
                if(arr1[j]==true){
                    for(int z=j*j;z <= arr[i];z=z+j){
                        arr1[z]=false;
                    }
                }

            }
            //-------------------------------------------- 두개 더해서 구하는 거니까 중간까지만해도됨.
            // 14 = 2+12 에서 12는 소수 아니여서 탈락 14=3+11 (o), 14= 7+7 (o) 이럴땐 두개 곱해서 큰걸루
            for(int s=2;s+s<=arr[i];s++){
                if((arr1[s]==true)&&(arr1[arr[i]-s]==true)){
                    if(a*b<s*(arr[i]-s)){
                        a=s;
                        b=arr[i]-s; 
                    }
                   
                }
            }
            System.out.println(a+" "+b);
        }


  


        in.close();
    }
    
}
