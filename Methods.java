import java.util.Scanner;

class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = smallest(a, b, c);
        System.out.print(res);
        sc.close();
    }
    static int smallest(int x, int y, int z) {
       if(x<y && x<z) {
        return x;
       }else if(y<x && y<z) {
        return y;
       }else
        return z;
    }
}