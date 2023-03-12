import java.util.Scanner;

class AverageThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = average(a, b, c);
        System.out.print(res);
        sc.close();
        }
        static int average(int x, int y, int z) {
            return ((x+y+z)/3);
    }
}