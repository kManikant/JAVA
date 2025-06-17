import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        System.out.println(posbl(str));
    }
    public static boolean posbl(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            else{
                i++;
                j--;
            }
        }return true;


    }
}
