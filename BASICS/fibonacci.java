import java.util.Scanner;

public class fibonacci {//zero base index
 public static void main(String[] args) {
    Scanner t=new Scanner(System.in);
    int n= t.nextInt();
    int a=0,b=1;
    int i=1;
    while(i<=n){
        System.out.print(a+",");
        int c=a+b;
        a =b;
        b=c;
        i++;
        
    }System.out.print(a);
 }   
}
