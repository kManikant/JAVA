public class compare {
    public static void main(String[] args) {
        
        String s1=new String("wwbe");
        String s2=new String("wwe");
        System.out.println(compare_lexi(s1,s2));
    }
            // comare in lixical/dictionary order 
    public static int compare_lexi(String s1,String s2){
        if (s1==s2) {  // for  string pool condition
            return 0; // 0 vlue dentoes s1 = s2 
        }
        for(int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i); // -ve value denotes s1<s2 , 
                                                  // +ve value denotes s1>s2
            }
        }
     return s1.length()-s2.length();
    }
}
