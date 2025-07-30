
public class sub_sequence {
    public static void main(String[] args) {
        String ques = "abc";
        printseq(ques, "");
    }

    public static void printseq(String ques, String ans) {
        // BASE CASE//
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        char ch = ques.charAt(0);
        printseq(ques.substring(1), ans);
        printseq(ques.substring(1), ans + ch);

    }
}
