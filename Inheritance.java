class Base {
    int x;

    public int getX() {
        System.out.println("I am in Base and setting x");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        System.out.println("THis is Derived class and I am setting Y");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class Inheritance {
    public static void main(String[] args) {
    
    //Creating object of Base class
    Base b = new Base();
    
    b.setX(4);
    System.out.println(b.getX());

    //Creating object of Derived class
    Derived d = new Derived();
    d.setY(43);
    System.out.println(d.getY());

    }
}
