

public class MethodOverloading {
    static void foo() {
        System.out.println("Good morning");
    }
    static void foo(int a) {
        System.out.println("Good morning " + a + " bro");
    }
    static void foo(int a, int b) {
        System.out.println("Good morining " + a + " and " + b + " times");
    }
    public static void main(String[] args) {
        //Method Overloading
        foo();
        foo(300);   //Arguments are actual! & Parameters are unknown!
        foo(300, 400);
    }
}
