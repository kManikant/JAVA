import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
       
        int count =0;
         int i=2;
        while(i<n-1){
            if(n%i==0){
                count++;
                if(count==1){
                    System.out.println(" not prime");
                    return;
                }
                }i++;
            }
            System.out.println("prime");
            
        }
            
        
        }
        
    

