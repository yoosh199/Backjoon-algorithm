import java.util.Scanner;

public class j_10989 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] counting = new int[n];
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            counting[i]=0;
        }

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
           counting[arr[i]-1]++;
        }

        for(int i=0;i<n-1;i++){
          
            counting[i+1] += counting[i];
        }

        //알고리즘 아이디어는 누적합을 계산해서 들어가 위치에 집어넣는것
        //ex 5 2 3 1 4 2 3 5 1 7 이면
        //   2 4 6 7 9 9 10 10 10 10 인데 7의 경우 10 즉 맨 뒤에 올수 밖에 없다 뒤에 8 9 10 인 10 10 10은 안쓰임
        for(int i=n-1;i>=0;i--){

            counting[arr[i]-1] -= 1;
            answer[counting[arr[i]-1]]= arr[i];
        }
        
        
        for(int i=0;i<n;i++){
          sb.append(answer[i]).append("\n");
        }
        System.out.printf(sb.toString());
        in.close();
    }
}
