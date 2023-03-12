

class NewCircle {
    static double pi = 3;
    private double radius;

    public void setNewRadius(double r) {
        radius = r*r*pi;
    }

    public double getNewRadius() {
        return radius;
    }
}

public class CircleArea {
    public static void main(String[] args) {
        NewCircle an = new NewCircle();

        an.setNewRadius(2.4);
        System.out.println(an.getNewRadius());
    }
}
