import java.util.Scanner;

public class j_1002 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String output="";
        int testcase = in.nextInt();
        in.nextLine();
        String input="";
        String arr[] = new String[6];
        double distance;
        for(int i =0;i<testcase;i++){
            if(i>=1){
                output=output+"\n";
            }
            input = in.nextLine();
            arr = input.split(" ");
            distance =  Math.sqrt(Math.pow(Math.abs(Double.parseDouble(arr[0])-Double.parseDouble(arr[3])), 2)+Math.pow(Math.abs(Double.parseDouble(arr[1])-Double.parseDouble(arr[4])), 2));
            if(distance == 0){
                if(Double.parseDouble(arr[2])==Double.parseDouble(arr[5])){
                    output = output+"-1";
                }
                else {
                    output = output+"0";
                }
            }
            else {
                if(distance>Double.parseDouble(arr[2])+Double.parseDouble(arr[5])){
                    output = output+"0";
                }
                else if(distance==Double.parseDouble(arr[2])+Double.parseDouble(arr[5])){
                    output = output+"1";
                }
                else {
                    if(distance < Math.abs(Double.parseDouble(arr[2])-Double.parseDouble(arr[5]))){
                        output = output+"0";
                    }
                    else if(distance== Math.abs(Double.parseDouble(arr[2])-Double.parseDouble(arr[5]))){
                        output = output+"1";
                    }
                    else {
                        output = output+"2";
                    }
                }

            }
            
            
        }

        System.out.println(output);
        in.close();
    }

}
