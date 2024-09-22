import java.util.*;
public class startriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=0; row<n; row++){
            for(int col=0; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
