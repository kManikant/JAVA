import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =1;
        int star =n/2+1; //due to vertical mirror
        int space=-1;
        while (row<=n) {
            //star
            int i=1;
            while (i<=star) {
                System.out.print("* ");
                i++;
                
            }
            //space
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
             //star due to vertical mirror
            int k=1;
            if(row==1||row==n){
                k=2;
            }
            while (k<=star) {
                System.out.print("* ");
                k++;
                
            }
            
           //mirror
           if (row<=n/2) {
            star--;
            space+=2;
           }else{
            star++;
            space-=2;
           }
           row++;
           System.out.println();
        }
    }
}
