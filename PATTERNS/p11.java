import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter odd positive integer");
        int n = sc.nextInt();
        if(n==0 || n%2==0){
            System.out.println("enter valid integer");
            return;
        }
        int space1= n/2; //left space
        int space2= -1;// middle space
        int row =1;
        while (row<=n) {
            //space
            int i=1;
            while (i<=space1) {
                System.out.print("  ");
                i++;
            }
            //star
            System.out.print("* ");
            // btw space
            int j=1;
            while (j<=space2) {
                System.out.print("  ");
                j++;
            }
            //star
            if(row>=2 && row<n)
            {
                System.out.print("* ");
            }
            
            //mirror
            if(row<=n/2){
                space1--;
                space2+=2;
            }else{
                space1++;
                space2-=2;
            }
            row++;
            System.out.println();
        }
    }
}
