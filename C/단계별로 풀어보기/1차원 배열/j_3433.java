import java.util.Scanner;


public class j_3433 {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        int c= in.nextInt();//testcase갯수
        int[] exams;//시험 점수들
        int sum; //점수합계
        float medium;//평균
        int over_medium;//평균이상인 학생들 수
        float [] percent =new float[c];//평균이상 비율
        
        int[] n = new int[c];
        for(int k=0;k<c;k++){
            sum=0;
            over_medium=0;
            medium=0;
            n[k] = in.nextInt();
            exams = new int[n[k]]; // malloc 안하고 여기서 할당
          
            for(int i=0;i<n[k];i++){
               
                exams[i]= in.nextInt();
            }
            
            for(int i=0;i<n[k];i++){
               sum= exams[i]+sum;
            }

            medium = (float)sum/(float)n[k];
            for(int i=0;i<n[k];i++){
                if(exams[i]>medium){
                    over_medium++;
                }
             }
            percent[k]=(float)over_medium/(float)n[k];
            

        }

        for(int k=0;k<c;k++){
            System.out.printf("%.3f%%\n",percent[k]*100);
        }
      
        
    
        

        in.close();
        
    }
}