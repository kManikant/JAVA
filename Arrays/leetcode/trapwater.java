public class trapwater {
    public static void main(String[] args) {
        int arr[]={12,3,7};
        System.out.println(watertrap(arr));
    }
    public static int watertrap(int [] arr){
        //left max arr
        int n= arr.length;    
        int []left=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
               left[i]=Math.max(left[i-1],arr[i]);
        }
     
        //right max arr
        int []right=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        //sum of water
       int sum=0;
       for(int i=0;i<n;i++){
        sum=sum+Math.min(left[i],right[i])-arr[i];
       }return sum;
    }
}
