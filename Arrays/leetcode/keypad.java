public class keypad {
    static String[] code={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String ques="23";
        printans(ques,"");
    }
    public static void printans(String ques,String ans){

        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
              char ch=ques.charAt(0);//2
              String press=code[ch-48];//abc
              for(int i=0;i<press.length();i++){
                     printans(ques.substring(1), ans+press.charAt(i));
              }
    }
}
