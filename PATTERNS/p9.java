import java.util.*;
public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int row=1;
        int space = n-1;
        int star =n;
        while (row<=2*n-1) {
            //space
            int i =1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }
           //mirror 
           if(row<n){
            
            space--;
            star--;
           }else{
            
            space++;
            star++;
           }
           row++;
           System.out.println();

            
        }

    }
}
