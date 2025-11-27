package lab1;

abstract class Shape {

    private int sides;

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    abstract public int getArea();

    public String toString() {

        return "the number of sides is " + sides + " and it's area is " + getArea();
    }

    Shape(int sides) {

        this.sides = sides;

    }
}
