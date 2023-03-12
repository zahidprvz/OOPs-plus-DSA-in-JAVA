class MyBase {
    int x;

    MyBase() {
        System.out.println("I am a base class constructor");
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class MyDerived extends MyBase {
    int y;

    MyDerived() {
        System.out.println("I am derived class constructor");
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

}

public class ConstructorInheritance {
    public static void main(String[] args) {
        
        

    }
}
