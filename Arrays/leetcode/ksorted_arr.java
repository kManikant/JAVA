public class ksorted_arr {

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int k =3;
        rotate(arr, k);

       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    
    public static void rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
       reverse(arr, n-k, n-1);// last kth elements
       reverse(arr, 0, n-k-1);// from start to before k element i.e n-k element
       reverse(arr, 0, n-1);// whole array

    }
    public static void reverse(int[] arr,int i,int j){
           while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
           }
    }
}