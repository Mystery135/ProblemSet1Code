public class Q4 {
    public static void main(String[] args) {
        stringPrinter("Hello world!");
    }
    public static void stringPrinter(String s) {
        if (s.isEmpty()){return;}//Returns if there is nothing left
        System.out.println(s.charAt(0));//Prints the first character of s
        s = s.substring(1);//Makes a new string without the first character
        stringPrinter(s);//calls itself
    }
}