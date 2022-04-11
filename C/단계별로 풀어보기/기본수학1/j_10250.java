import java.io.*;
public class j_10250 {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));



        String a = in.readLine();
       
        int testcase = Integer.parseInt(a);


        String arr[]= new String[testcase];
        int rooms[] = new int[testcase];
        int h,w,n;
        for(int i=0;i<testcase;i++){
            arr[i]=in.readLine();
        }

        for(int i=0;i<testcase;i++){

            String[] arr1=arr[i].split(" ");//?되나
            h = Integer.parseInt(arr1[0]);
            w = Integer.parseInt(arr1[1]);
            n = Integer.parseInt(arr1[2]);

            if(n%h == 0){
                rooms[i]= (h)*100+n/h;
            }
            else{
                rooms[i]= (n%h)*100+n/h+1;
            }
      
  
        }

        
        for(int i=0;i<testcase;i++){
            System.out.println(rooms[i]);
        }


        in.close();
    }
    
}
