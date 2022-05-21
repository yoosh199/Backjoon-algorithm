import java.util.Scanner;

public class j_2798 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String nm_input = in.nextLine();
        String cards_input = in.nextLine();
        
        String[] nm = nm_input.split(" ");
        String[] cards =cards_input.split(" ");
        
        
        int answer = 0;
        int a =Integer.parseInt(nm[0]);
        if(a<4){
            // System.out.println("up");
            if(Integer.parseInt(nm[1])>=(Integer.parseInt(cards[0]) +Integer.parseInt(cards[1])+Integer.parseInt(cards[2]))){
                answer=Integer.parseInt(cards[0]) +Integer.parseInt(cards[1])+Integer.parseInt(cards[2]);
            }
            
        }
        else{
            // System.out.println("down");
            for(int i1=0;i1< Integer.parseInt(nm[0]) ;i1++){
                for(int i2=0;i2< Integer.parseInt(nm[0]) ;i2++){
                    for(int i3=0;i3< Integer.parseInt(nm[0]) ;i3++){
                     
                        if(i1!=i2 && i2!=i3 && i1 != i3&& Integer.parseInt(cards[i1]) +Integer.parseInt(cards[i2])+Integer.parseInt(cards[i3])<=Integer.parseInt(nm[1])){
                            // System.out.printf("%d %d %d\n",i1,i2,i3);
                            // System.out.println(Integer.parseInt(cards[i1]) +Integer.parseInt(cards[i2])+Integer.parseInt(cards[i3]));
                            if(Integer.parseInt(nm[1])-answer>Integer.parseInt(nm[1])-(Integer.parseInt(cards[i1]) +Integer.parseInt(cards[i2])+Integer.parseInt(cards[i3]))){
                                answer =Integer.parseInt(cards[i1]) +Integer.parseInt(cards[i2])+Integer.parseInt(cards[i3]);
                            }
                        }
                    }
                }
            }

        }
        


        System.out.println(answer);
        
        in.close();
    }
}
