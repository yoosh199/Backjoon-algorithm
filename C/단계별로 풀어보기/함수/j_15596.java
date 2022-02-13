public class j_15596 {
    public static long sum(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }

        return sum;
    }
    
    public static void main(String[] args) {

     
        int[] aaa={1,2,3,4,5,6,7,8,123,123,123,45};
      
        
        System.out.printf("%d",sum(aaa));
        
    }
}
