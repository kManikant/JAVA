import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum =rem +sum;
            n= n/10;
        }System.out.println(sum);
    }
}
