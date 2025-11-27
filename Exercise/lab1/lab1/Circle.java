package lab1;

public class Circle extends Shape {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getArea() {

        return (int)(Math.PI * radius * radius);
    }

    public String toString() {
        return "Radius of circle is " + radius + ", " + super.toString();
    }

    Circle() {
        super(1);
    }

}
