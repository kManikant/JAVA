public class allsubstring {
    public static void main(String[] args) {
        String str="madam";
        substring(str);    
    }
    public static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            else{
                i++;
                j--;
            }
        }return true;
    }
    public static void substring(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String  str1=str.substring(i, j);
                if(palindrome(str1)){
                    System.out.println(str1);  // printing substring that are palindronme
                  count++;
                }     
            }
        }System.out.println(count);
    }
    
}
