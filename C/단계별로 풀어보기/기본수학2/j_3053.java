import java.util.Scanner;

public class j_3053 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double r = in.nextDouble();

        System.out.println(String.format("%.6f", Math.PI*r*r)); 
        System.out.println(String.format("%.6f", 2*r*r)); 
        in.close();
    }

}
