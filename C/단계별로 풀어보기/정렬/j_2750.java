import java.util.Scanner;

public class j_2750 {
    void insertionSort(int[] arr)
{

   for(int index = 1 ; index < arr.length ; index++){

      int temp = arr[index];
      int aux = index - 1;

      while( (aux >= 0) && ( arr[aux] > temp ) ) {

         arr[aux + 1] = arr[aux];
         aux--;
      }
      arr[aux + 1] = temp;
   }
}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] new_arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int min;
        int location;
        for(int i=0;i<n;i++){
            min=arr[i];
            location=i;
            for(int j=0;j<n;j++){
                if(min>arr[j] && arr[j]!=Integer.MAX_VALUE){
                    min=arr[j];
                    location=j;
                }
            }
            new_arr[i]=min;
            arr[location]=Integer.MAX_VALUE;
    
        }

        for(int i=0;i<n;i++){
            System.out.println(new_arr[i]);
        }

        in.close();


    }
}