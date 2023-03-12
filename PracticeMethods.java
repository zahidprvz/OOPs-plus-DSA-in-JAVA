public class PracticeMethods {
    
    //Problem#1
    static void table(int n) {
        for(int i=1; i<=10; i++) {
            System.out.format("%d x %d = %d\n" , n , i , n*i);
        }
    }

    //Problem#2
    static void pattern1(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Problem#3
    static int sumRec(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n + sumRec(n-1);
        }
    }

    //Problem#4
    static void pattern2(int n) {
        for(int i=0; i<n; i++) {        //Loop for rows
            for(int j=n; j>i; j--) {    //Loop for columns
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Problem#5
    static int fib(int n) {
        if(n == 1 || n == 2) {
            return n-1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    //Problem#6
    static int av = 0;
    static int average(int...arr) {
        for(int a:arr) {
            av += a; 
        }
        return av/arr.length;
    }

    //Problem#7
    static void patterRecursion(int n) {
        if(n>0) {
            patterRecursion(n-1);
            for(int i=0; i<n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //table(7);
        //pattern1(4);
        //int c = sumRec(3);
        //System.out.println(c);
        //pattern2(5);
        //int result = fib(5);
        //System.out.println(result);
        //System.out.println(average(3,4,5));
        patterRecursion(4);
    }
}
