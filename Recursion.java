public class Recursion {
    static int factorial(int n) {
        // factorial(n) = n * n-1 * ... 1
        //factorial(5) = 5 * 4 * 3 * 2 * 1
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of factorial 'n' is: " + factorial(x));
    }
}
