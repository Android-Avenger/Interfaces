package shapes;

public class Rectangle extends Shape {

    float length;

    public Rectangle(float length, float width ){
        super(width);
        this.length = length;
    }

    @Override
    public float getArea() {
        return  width*length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
