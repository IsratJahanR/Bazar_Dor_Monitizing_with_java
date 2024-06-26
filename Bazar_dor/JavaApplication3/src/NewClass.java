
class Shapes {

    static double area = 0;

    public double area() {
        System.out.println("Shapes area = " + area);
        return area;
    }

    public void area(int r) {
        System.out.println("Circle area = " + 3.14 * r * r);
        area = 3.14 * r * r;
    }

    public void area(double b, double h) {
        System.out.println("Triangle area=" + 0.5 * b * h);
        area = 0.5 * b * h;
    }

    public void area(int l, int b) {
        System.out.println("Rectangle area=" + l * b);
        area = l * b;
    }

}

class Main {

    public static void main(String[] args) {
        Shapes myShape = new Shapes();  // Create a Shapes object

        myShape.area();
        myShape.area(6, 2);
        double area=myShape.area();
        myShape.area(6.0, 1.2);
        myShape.area(5);
        System.out.println("This is the final area : "+area);
        

    }
}
