import java.util.Scanner;

public class j_1193 {
  
    
    public static int sum(int x, int y, int z, int w){
    
        return x+y+z+w;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int count_right=0;
        int count_down =0;
        int count_rightup=0;
        int count_leftdown=0;
        int multiple = 1;

        int x=1;
        int y=1;
       
        
        

        while(true){
          if(count_right == 0){
            if(sum(count_right,count_down,count_rightup,count_leftdown)+1==input){
                break;
            }
              y++;
              count_right++;
              
          }
          else{
              if(count_right>count_down){
                if(sum(count_right,count_down,count_rightup,count_leftdown)+1==input){
                    break;
                }
                for(int i=0;i<multiple;i++){
                    x++;
                    y--;
                    count_leftdown++;
                    if(sum(count_right,count_down,count_rightup,count_leftdown)+1==input){
                        break;
                    }
                }
                if(sum(count_right,count_down,count_rightup,count_leftdown)+1==input){
                    break;
                }
                multiple++;
                count_down++;
                x++;

                
                if(sum(count_right,count_down,count_rightup,count_leftdown)+1==input){
                    
                    break;
                }
              }
              else if(count_right==count_down){
                if(sum(count_right,count_down,count_rightup,count_leftdown)+1==input){
                    break;
                }
                for(int i=0;i<multiple;i++){
                    x--;
                    y++;
                    count_rightup++;
                    if(sum(count_right,count_down,count_rightup,count_leftdown)+1==input){
                        break;
                    }
                }
                if(sum(count_right,count_down,count_rightup,count_leftdown)+1==input){
                    break;
                }
                multiple++;
                count_right++;
                y++;
                if(sum(count_right,count_down,count_rightup,count_leftdown)+1==input){
                    break;
                }
              }
          }
        }
        

        System.out.printf("%d/%d", x, y);

        in.close();
    }
    
}
