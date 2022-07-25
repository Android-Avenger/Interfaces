package shapes;

public class Triangle extends Shape {

    float base;

    public Triangle(float base,float height) {
        super(height);
        this.base = base;
    }

    @Override
    public float getArea() {
        return  (1/2) * base * height;
    }

    @Override
    public float getBase() {
        return base;
    }

    @Override
    public void setBase(float base) {
        this.base = base;
    }
}
