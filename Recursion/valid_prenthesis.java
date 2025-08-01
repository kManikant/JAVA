public class valid_prenthesis {
    public static void main(String[] args) {
        int n=3;
        print(n,0,0,"");
    }
    public static void print(int n,int open,int close,String ans){
        //base case//
        if(open==n&&close==n){
            System.out.print(ans+" ");
        }
        //recursive calls//
        if(open<n){
            print(n, open+1, close, ans+"(");
        }
        if(close<open){
            print(n, open, close+1, ans+")");
        }
    }
}
