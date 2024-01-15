public class Q5 {
    public static void main(String[] args) {
        System.out.println(multiply(3, -1));
    }
    public static int multiply(int x, int y){
        if (y == 0){//
            return 0;//Returns 0 when y is decremented to 0.
        }
        if (y > 0){
            y--;
            return x + multiply(x, y);//calls itself and adds that to x.
        }
            return -multiply(x, -y); //positive x * negative y is equal to -(negative x * positive y). This makes negative numbers work.
    }
}
