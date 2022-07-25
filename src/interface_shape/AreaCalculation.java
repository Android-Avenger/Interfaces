package interface_shape;

public class AreaCalculation {

    public void SquareArea(
            int height,
            RegularShapesEventListener slR ) {

        float area = height * height;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        slR.onSquareAreaCalculation(area);
    }


    public void RectangleArea(
            int width,
            int height,
            RegularShapesEventListener slR ) {

        float area = width * height;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        slR.onRectangleAreaCalculation(area);
    }


    public void TriangleArea(
            int base,
            int height,
            RegularShapesEventListener slR) {

        double area = 0.5 * base * height;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        slR.onTriangleAreaCalculation(area);
    }


    public void ParallelogramArea(
            int base,
            int height,
            ComplexShapeEventListener slC){

        float area = base * height ;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        slC.onParallelogramAreaCalculation(area);
    }


    public void RhombusArea(
            int d1,
            int d2,
            ComplexShapeEventListener slC) {

        double area = 0.5 * (d1 * d2) ;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        slC.onRhombusAreaCalculation(area);
    }


    public void TrapezoidArea(
            int b,
            int a,
            int h,
            ComplexShapeEventListener slC) {

        double area = 0.5 * ( a + b) * h ;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        slC.onTrapezoidAreaCalculation(area);
    }
}
