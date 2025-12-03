package lab1;

/**
 * Ellipse class. Provides a concrete implementation of an ellipse based on the {@link Rectangle} class.
 *
 * @author mdixon
 */
public class Ellipse extends Rectangle {

    // No additional attributes required

    @Override
    public int getArea() {

        return (int)(Math.PI * (super.getArea()/4));
    }

    @Override
    public String toString() {

        return "Ellipse based on a " + super.toString();
    }

    //Constructor
    Ellipse() {
        // need to use set sides, since inherited constructor will set the sides to '4'
        this.setSides(1);

    }

}
