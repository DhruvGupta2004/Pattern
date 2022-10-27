package pattern;

import java.util.*;
public class palindrome_number_traingle {
    public static void main(String[]arg) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("rows");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                //1 half
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                //2 half
                // if it start with 1 the the centre line print twice !!
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println(); 
            }
        }
    }
}