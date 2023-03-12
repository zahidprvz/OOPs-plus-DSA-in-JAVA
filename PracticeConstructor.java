class Cylinder {
    private int radius;
    private int height;

    public int getradius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getheight() {
        return height;
    }

    public void setheight(int h) {
        height = h;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

}

public class PracticeConstructor {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(9,12);

        // V = pi * r*r * h
        // A = 2 * pi * r * h + 2 * pi * r*r
        
        /* 

        myCylinder.setRadius(9);
        myCylinder.setheight(12);

        //Problem#1
        System.out.println(myCylinder.getheight());
        System.out.println(myCylinder.getradius());

        //Problem#2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        */

        //Problem#3
        //System.out.println(myCylinder.surfaceArea());
        //System.out.println(myCylinder.volume());

    }
}
