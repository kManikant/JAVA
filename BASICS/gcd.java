import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int dd = t.nextInt();
        int dv = t.nextInt();

        // for(;dd%dv!=0;){
        //        int rem =dd%dv;          using for loop
        //        dd=dv;
        //        dv=rem;
        // }System.out.println(dv);

        while(dd%dv !=0){
            int rem = dd%dv;
            dd = dv;
            dv = rem;
        }
        System.out.println(dv);
    }
}
