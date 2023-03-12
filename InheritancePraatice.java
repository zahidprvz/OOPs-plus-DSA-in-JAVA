public class InheritancePraatice {

    class MyCircle {
        public int radius;
        public double area() {
            return this.radius * this.radius * Math.PI;
        }
    }

    class MyCylinder extends MyCircle {
        MyCylinder() {

        }
        public int height;
        public double volume() {
            return Math.PI * this.radius * this.radius * this.height;
        }
    }
    public static void main(String[] args) {
        //Problem#1

        
    }
}