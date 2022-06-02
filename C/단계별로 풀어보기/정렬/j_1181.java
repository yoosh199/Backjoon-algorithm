import java.util.*;


public class j_1181 {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);

        
        int N = in.nextInt();
        in.nextLine();
        String[] arr= new String[N];
        for(int i =0;i<N;i++){
            arr[i]=in.nextLine();
        }
       
        Arrays.sort(arr, new Comparator<String>() {
            
            @Override
            public int compare(String e1,String e2){
                    if(e1.length()==e2.length()){
                        for(int i=0;i<e1.length();i++){
                            if(e1.charAt(i)<e2.charAt(i)){
                                return -1;
                            }
                            if(e1.charAt(i)>e2.charAt(i)){
                                return 1;
                            }
                        }
                        return 0;
                    }
                    else{
                        return e1.length()-e2.length();
                    }
                    
                
                
            }
        });


        for(int i=0;i<N;i++){
            if(i>0){
                if(arr[i-1].equals(arr[i])){

                }
                else{
                    System.out.println(arr[i]);
                }
            }
            else {
                System.out.println(arr[i]);
            }
            
        }
        in.close();
    }
}
