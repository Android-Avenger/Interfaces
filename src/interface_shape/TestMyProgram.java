package interface_shape;

public class TestMyProgram {

    public static void main(String[] args) {

        AreaCalculation calculation = new AreaCalculation();

        RegularShapesEventListener regularShapesEventListener = new RegularShapesEventListener() {
            @Override
            public void onRectangleAreaCalculation(float area) {
                System.out.println("Rectangle : " +area);
            }

            @Override
            public void onSquareAreaCalculation(float area) {
                System.out.println("Square : " + area);
            }

            @Override
            public void onTriangleAreaCalculation(double area) {
                System.out.println("Triangle : " + area);
            }
        };

        ComplexShapeEventListener complexShapeEventListener = new ComplexShapeEventListener() {
            @Override
            public void onParallelogramAreaCalculation(float area) {
                System.out.println("Parallelogram : " +area);
            }

            @Override
            public void onTrapezoidAreaCalculation(double area) {
                System.out.println("Trapezoid : " + area);
            }

            @Override
            public void onRhombusAreaCalculation(double area) {
                System.out.println("Rhombus : " + area);
            }
        };

        calculation.ParallelogramArea(6,8,complexShapeEventListener);
        calculation.RhombusArea(19,18,complexShapeEventListener);
        calculation.TrapezoidArea(7,12,6,complexShapeEventListener);

        calculation.SquareArea(8,regularShapesEventListener);
        calculation.TriangleArea(8,9,regularShapesEventListener);
        calculation.RectangleArea(16,8,regularShapesEventListener);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
