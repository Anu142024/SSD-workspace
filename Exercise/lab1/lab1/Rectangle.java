package lab1;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {

        return width * height;
    }

    public String toString() {
        return "Rectangle with a width of " + width + ", a height of " + height + ", " + super.toString();
    }

    Rectangle() {

        super(4);
    }
}
