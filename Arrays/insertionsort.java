public class insertionsort {

    //insertion means inserting picked element at its correct position in already sorted array
    public static void main(String[] args) {
        int arr[]={2,87,9,77};
        sort(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){ //i starts from 1 bcz leftmost element is sorted
            int picked = arr[i]; //picked means element to be placed in already sorted part of array
           int j = i-1;
           while (j>=0 && arr[j]>picked) {
              arr[j+1]=arr[j];
              j--;
           }
           arr[j+1]=picked;
           
               
        }
       

    }
}
