package pattern;

import java.util.*;

public class tilt_rectangle {
    public static void main(String[]arg) {
      
        try(Scanner sc = new Scanner(System.in)){
          
            System.out.println("rows");
            int n = sc.nextInt();
          
            for(int i=1;i<=n;i++){
              
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
              
                //stars
                for(int j=1;j<=5;j++){
                    System.out.print("*");
                }
              
                System.out.println(); 
            }
        }
    }
}
