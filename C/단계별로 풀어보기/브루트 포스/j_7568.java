import java.util.Scanner;

public class j_7568 {

    public static class Body {
        public int x;
        public int y;

        public void setBody(int x,int y){
            this.x=x;
            this.y=y;
        }

       

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        in.nextLine();
        String input="";
        int count;

        Body[] body = new Body[n];
    
        for(int i=0;i<n;i++){
            input=in.nextLine();
            String[] arr = input.split(" ");

            body[i] = new Body();
            body[i].setBody(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            

        }

        for(int i=0;i<n;i++){
            if(i>0){
                System.out.printf(" ");
            }
            count=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(body[i].x<body[j].x &&body[i].y<body[j].y ){
                        count++;
                    }
                }
                
            }
            // if(i==n-1){
            //     System.out.printf("%d",count+1);
            // }
            // else{
            //     System.out.printf("%d ",count+1);
            // }
            System.out.printf("%d",count+1);
        }


        in.close();
    }
    
}
