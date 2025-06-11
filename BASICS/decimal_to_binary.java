public class decimal_to_binary {
    public static void main(String[] args) {
        int a=127;//base 10
        int sum=0;
        int mul=1;         
                                
        while(a>0){
             int rem =a%2;//base 2         //if binary to decimal   int rem =a%10;
             sum = sum + rem *mul;
             mul = mul*10;                // mul =mul*2
             a=a/2;                      // a=a/10
        }System.out.println(sum);


        int i =428;
        byte b = (byte)(128);      //type caste
        b= (byte)i;
        System.out.println(b);
    }
}
 