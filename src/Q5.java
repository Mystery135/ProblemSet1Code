public class Q5 {
    public static void main(String[] args) {
        System.out.println(multiply(3, -1));;
    }
    public static int multiply(int x, int y){
        if (y == 0){
            return 0;
        }
        if (y > 0){
            y--;
            return x + multiply(x, y);
        }
            return -multiply(x, -y);        //positive x * negative y is equal to -(negative x * positive y).
    }
}
