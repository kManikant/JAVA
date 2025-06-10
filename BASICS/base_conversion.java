import java.util.Scanner;

public class base_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sb = sc.nextInt();
        int db = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Dectoany(n,sb,db));
    }


    public static int anytoDec(int n,int sb){
        int sum=0;
        int mul=1;
        while(n>0){
            int rem =n%10;
            sum=sum+rem*mul;
            mul=mul*sb;
            n=n/10;
        }
        return sum;
    }

    public static int Dectoany(int n , int sb ,int db){
        int b=anytoDec(n,sb);
        System.out.println(b);
        int sum=0;
        int mul=1;
        while(b>0){
            int rem=b%db;
            sum=sum+rem*mul;
            mul=mul*10;
            b=b/db;
        }return sum;
    }
}
