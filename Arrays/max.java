public class max {
    public static void main(String[] args) {
        int [] arr ={22,33,4,5,60,678};
    System.out.println(maximum(arr));
    }

    public static int maximum(int[] arr){
        int max= arr[0];
        int i=1;
        while (i<arr.length) {
            if(arr[i]>max){
                max=arr[i];
                      }i++;
        }
      return max;
    }
}
