public class basic {
    public static void main(String[] args) {
        String str="hello"; // get space in string pool. 
        String str1= new String("hello");// outside string pool
        String str2="hello";// can not get new space in string pool, it points str i.e address of str= adrs of str2  
        String str3=new String("hello");// it will get new space outside string pool
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        String s1="g5y";
        String s2="hji";
        System.out.println(s1+s2);
        s1=s1.concat(str3);
        System.out.println(s1);

        System.out.println(str==str1); // == compares address in case of non primitive
        System.out.println(str==str2);
        System.out.println(str1==str3);

        System.out.println(s1.equals(s2));// it will compare content of string
         // s1=g5yhello due to concatenating
        System.out.println(s1.substring(2));// from index 2 to all string
        System.out.println(s1.substring(0, 2));//from 0 to 1 g5 2nd index  excluded
        System.out.println(s1.substring(0, 3));//from 0 to 2 g5y 3rd index excluded
    }
}
