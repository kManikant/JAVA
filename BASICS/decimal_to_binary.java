public class decimal_to_binary {
    public static void main(String[] args) {
        int a=9;//base 10
        int sum=0;
        int mul=1;
        while(a>0){
             int rem =a%2;//base 2
             sum = sum + rem *mul;
             mul = mul*10;
             a=a/2;
        }System.out.println(sum);
    }
}
