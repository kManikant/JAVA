public class lengthwise_substrng {
    public static void main(String[] args) {
        String str="lkm";
        lengthwise(str);
    }
    public static void lengthwise(String str){
        for(int len=1;len<=str.length();len++){
            for(int j=len;j<=str.length();j++){
                int i=j-len;
                System.out.println(str.substring(i, j));
            }
        }
    }
}
