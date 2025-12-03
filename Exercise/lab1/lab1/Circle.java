package lab1;

/**
 * Circle class. Provides a concrete implementation based on the {@link Shape} class.
 *
 * @author mdixon
 */
public class Circle extends Shape {

    private int radius;// The radius of the circle

    /**
     * Gets the radius of the circle.
     *
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {

        return (int)(Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Radius of circle is " + radius + ", " + super.toString();
    }

    //Constructor
    Circle() {
        // call super-class constructor with number of sides for this shape, i.e. 1
        super(1);
    }

}
