public class hanoi {
    public static void main(String[] args) {
        int n=3;
        moves(n,"A","B","C");
    }
    public static void moves(int n,String src,String help,String dest){
              //base condition//
              if(n==0){
                return;
              }
              moves(n-1, src, dest, help);
              System.out.println("Move "+ n +" th disc from " +src+" to "+dest);
              moves(n-1, help, src, dest);
    }
}
