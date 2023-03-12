class Animal {
    String type;
    int weight;
    String color;

    public void Run() {
        System.out.println("Can Run");
    }

    public void Speak() {
        System.out.println("Can Speak");
    }
}

class Dog extends Animal {
    int legs;
    
    public void Bark() {
        System.out.println("DOg can bark!");
    }
}

public class InheritanceQuizDog {
    public static void main(String[] args) {
        Animal an = new Animal();
        Dog dg = new Dog();

        dg.type = "German";
        dg.color = "White";
        dg.weight = 8;

        System.out.println(dg.type);
        System.out.println(dg.color);
        System.out.println(dg.weight);
        dg.Run();
        dg.Speak();
        dg.Bark();
    }
}
