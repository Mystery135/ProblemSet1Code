public class Q4 {
    public static void main(String[] args) {
        stringPrinter("Hello world!");
    }
    public static void stringPrinter(String s) {
        if (s.isEmpty()){return;}
        System.out.println(s.charAt(0));
        s = s.substring(1);
        stringPrinter(s);
    }
}