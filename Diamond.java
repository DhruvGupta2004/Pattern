package pattern;

import java.util.*;
public class Diamond {
    public static void main(String[]arg) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("rows");
            int n = sc.nextInt();
            //upper
            for(int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                //1 half
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println(); 
            }
            //lower
            for(int i=n;i>=1;i--){
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }    
        }
    }
}