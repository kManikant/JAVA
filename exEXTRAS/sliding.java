public class sliding {
    public static void main(String[] args){
      int [] arr= {2,3,4,5};
      int k=2;
      System.out.println(max_sum(arr,k));
    }
    public static int max_sum(int[] arr,int k){
            int sum=0;
            int ans=0;
           //for 1st window
           for(int i=0;i<k;i++){
            sum=sum+arr[i];
           } 
           ans=sum;

           //remaining window
           for(int i=k;i<arr.length;i++){
            sum=sum+arr[i];//sum grow
            sum=sum-arr[i-k];// removing in itial index elem
            ans=Math.max(ans, sum);
           }
        return ans;
    }
}
