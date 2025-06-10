public class max2 {
    
    public static void main(String[] args) {
        int [] arr ={22,33,4,5,60,678};
    System.out.println(maximum(arr));
    }

    public static int maximum(int[] arr){
        int max= Integer.MIN_VALUE;// -2^31
           //Integer.MAX_VALUE 2^31-1
        int i=0;
        while (i<arr.length) {
            if(arr[i]>max){
                max=arr[i];
            }



            
            i++;
            //max = Math.max(arr[i],max)
        }
      return max;
    }
}

