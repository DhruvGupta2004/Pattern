package pattern;

import java.util.*;

public class hollow_rectangle {
    public static void main(String[]arg) {
        
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.println("rows");
            int rows = sc.nextInt();
            
            System.out.println("coloumn");
            int col = sc.nextInt();
            
            for(int i=1;i<=rows;i++){
                for(int j=1;j<=col;j++){
                    if(i==1 || j==1 || i==rows || j==col){
                        System.out.print("*");
                    }
                    
                    else{
                        System.out.print(" ");
                    }
            }
            System.out.print("\n");
        } 
        }
    }
}
