import java.util.Scanner;

public class p13 {
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
                System.out.print("\t");
                i++;
            }
            //star
            int j=1;
            int var=1;
            while(j<=star){
                System.out.print(var +"\t");
                var++;
                j++;
            }
            row++;
            System.out.println();
            space--;
            star+=2;
        } 
    }
}
