import java.util.ArrayList;

public class add_no {
    public static void main(String[] args) {
        int [] arr={2,3};
        int[] arr1={2,3,4};
         add(arr, arr1);
    }
    public static void add(int[] arr, int[] arr1){
       
        ArrayList <Integer>ll=new ArrayList<>();
        int carry=0;
        int i=arr.length-1;
        int j=arr1.length-1;
        while(i>=0&&j>=0){
            int sum=arr[i]+arr1[j]+carry;
            ll.add(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        while(i>=0){
             int sum=arr[i]+carry;
             ll.add(sum%10);
             carry=sum/10;
             i--;
        }
        while(j>=0){
            int sum=arr1[j]+carry;
            ll.add(sum%10);
            carry=sum/10;
            j--;
        }
        if(carry>0){
            ll.add(carry);
        }
        for(int k=ll.size()-1;k>=0;k--){
            System.out.print(ll.get(k)+" ");

        }
    }
}
