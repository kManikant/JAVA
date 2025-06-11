public class selectionsort {
    public static void main(String[] args) {
        int arr[]={2,35,-3,7,4,5};

    sort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }

    public static void sort(int[] arr){
         for(int i=0;i<arr.length;i++){
            int min = i;
        for(int j=i+1 ; j<arr.length ; j++){
           if(arr[j]<arr[min]){
             min = j;
           } 
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min]=temp;
         }
        
    }

}

