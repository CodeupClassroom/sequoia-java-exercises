package shapes;

public class Square extends Quadrilateral implements Measurable {
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void setLength(double side) {
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
        this.side = side;
    }
}
