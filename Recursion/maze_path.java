public class maze_path {
    public static void main(String[] args) {
        int m=4; //row
        int n=5; //col
        printpaths(0,0,m-1,n-1,"");
    }
    public static void printpaths(int cc,int cr,int er,int ec,String ans){
        //base case//
      if(cr==er&&cc==ec){
        System.out.println(ans);
        return;
      }
        if(cr>er||cc>ec){
            return;
        }
       printpaths(cr, cc+1, er, ec, ans+'H');
       printpaths(cr+1, cc, er, ec, ans+'V');
    }
}
