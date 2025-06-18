import java.util.*;
public class arraylist {
    public static void main(String[] args) {
         ArrayList<Integer> ll= new ArrayList<>();
         // intially capacity of arraylist by default is of 10 size, it means " (10) " default value inside bracket. we can change this value
         // for adding 11th element it increase its capacity by 1.5times of initial array
         // it make new arraylist at different location by copying intial array's content,then increases its capacity
         
         ll.add(3);
         ll.add(5);
         ll.add(34);
         System.out.println(ll);
         System.out.println(ll.size());
         ll.add(2,45);// add :- it insert element at given index by increasing size of list
         ll.add(3,24);// index range of add 0 to size
         ll.set(0, 98);// set:- it update element at given index
         System.out.println(ll);
        //  Collections.sort(ll);
         System.out.println(ll.remove(0));
         System.out.println(ll);
         System.out.println(ll.size());
         // index range of get  0 to size-1
         System.out.println(ll.get(3));

         // for each loop :- it print value untill list become empty
         for(int v:ll){
            System.out.print(v+" ");
         }


    }
}
