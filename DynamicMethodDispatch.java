class Phone {
    public void greet() {
        System.out.println("Good Morning");
    }

    public void name() {
        System.out.println("My name is Java");
    }
}

class Smartphone extends Phone {
    public void welcome() {
        System.out.println("Welcome");
    }

    public void name() {
        System.out.println("My name is Java in class two");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
    Phone obj = new Smartphone();
    obj.name();
    
    }
}
