public class Compare {
    public static String str1="Waliya";
    public static String str2="Waliya";
    public static String str3="waliya";
    public static void main(String[] args){
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));//case insensitive
    }
}