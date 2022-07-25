package shapes;

public class Shape {

    int height;
    float width;
    float base;

    public Shape() {
    }
    public Shape(float width){
        this.width = width;
    }

    public Shape(int height) {
        this.height = height;
    }

    public Shape(int height, float width) {
        this.height = height;
        this.width = width;
    }

    public Shape(int height, float width, float base) {
        this.height = height;
        this.width = width;
        this.base = base;
    }

    public float getArea(){
        return 0;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
