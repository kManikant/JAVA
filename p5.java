import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int star =1;
        int space =n-1;
        int row =1;
        while(row<=n){
            //space
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            row++;
            System.out.println();
            space--;
            star+=2;
        } 
    }
}
