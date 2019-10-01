public class Circle {

double radius;

public Circle() {
    radius = 3;
}
public Circle(double radius) {
    this.radius = radius;
}
public double getRadius() {
    return radius;
}

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
    return radius*radius*Math.PI;
}
public double getCircumference () {
    return radius*2*Math.PI;
}
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
