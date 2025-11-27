package lab1;

public class Ellipse extends Rectangle {

    public int getArea() {

        return (int)(Math.PI * (super.getArea()/4));
    }

    public String toString() {

        return "Ellipse based on a " + super.toString();
    }

    Ellipse() {

        this.setSides(1);

    }

}
