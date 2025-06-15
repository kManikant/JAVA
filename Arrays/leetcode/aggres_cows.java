import java.util.Arrays;
import java.util.Scanner;

public class aggres_cows {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int cows=sc.nextInt();
         int [] stall=new int[5];
         for(int i=0;i<stall.length;i++){
         stall[i]=sc.nextInt();
         }
      Arrays.sort(stall);
      System.out.println(dist(stall, cows));
    }

    public static boolean ispobl(int[] stall,int cows,int mid){
         int pos=stall[0];
         int cows_count=1;
         int i=1;
         while(i<stall.length){
            if(stall[i]-pos>=mid){
                cows_count++;
                pos=stall[i];
               
            }i++;
            if(cows_count==cows){
                return true;
            }
         }return false;

    }

    public static int dist(int[] stall,int cows){
        int lo=stall[0];
        int hi=stall[stall.length-1];
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
        if (ispobl(stall,cows,mid)){
            ans=mid;
            lo=mid+1;
        
        }
        else{
            hi=mid-1;
        }
        }
         return ans;
    }
}
