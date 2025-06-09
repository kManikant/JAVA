public class armstrong {

    public static void main(String[] args) {
        int n= 371;
        System.out.println(digits(n));
        System.out.println(result(n));
    }
    public static int digits(int n){
      int x =n;
      int count =0;
      while(x>0){
        x=x/10;
        count++;}
      return count;
    }

    public static boolean result(int n){
        int p=n;
        int d = digits(n); // n becomes zero after counting digits
          int sum=0;
          while(p>0){
            int rem=p%10;
            sum = (int)(sum + Math.pow(rem, d));
            p=p/10;
          }
          if (sum==n) {
            return true;
          }else{
            return false;
          }

        
    }
}