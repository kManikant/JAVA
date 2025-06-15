public class book_allo {
    public static void main(String[] args) {
        int[] page={10,20,30,40};
        int stud=2;
        System.out.println(minimize(page,stud));
    }
    public static int minimize(int[] page,int stud){
        int lo=0;
        int hi=0;
        for(int i=0;i<page.length;i++){
            hi=hi+page[i];
        }
     int ans=0;
         while (lo<=hi) {
            int mid=(lo+hi)/2;
         if(isposbl(page, stud, mid)==true){
            ans=mid;
             hi=mid-1;
         }else{
            lo=mid+1;
         }
        }   
    return ans ;
    }

    public static boolean isposbl(int[] page,int stud,int mid){
      int read_pg=0;
      int stud_count=1;
      for(int i=0;i<page.length;i++){
        if(read_pg+page[i]<=mid){
            read_pg+=page[i];
        }else{
            stud_count++;
            read_pg=page[i];
        }
        if(stud_count>stud){
            return false;
        }
      }return true;
    }
}
