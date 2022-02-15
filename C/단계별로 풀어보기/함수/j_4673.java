public class j_4673 {
    public static int d(int n){
        int dn=n;
        while(n>0){
           
            dn=dn+n%10;
            n=n/10;

        }
      

        return dn;
    }
    
    public static void main(String[] args) {

        int[] arr = new int[10001];

        arr[0]=0;
        for(int i=1;i<10001;i++){
            arr[i]=i;
        }
        for(int i=1;i<10001;i++){
            if(d(i)<=10000){
                arr[d(i)]=0;
            }
        
        }

        for(int i=1;i<10001;i++){
            if(arr[i] != 0){
                System.out.printf("%d\n",arr[i]);
            }
        }
        
      
        
        
        
    }
}
