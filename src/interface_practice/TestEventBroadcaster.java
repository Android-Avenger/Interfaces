package interface_practice;

public class TestEventBroadcaster {

    public void add(
       int value1,
       int value2,
       CalculatorEventListener cb
    ) {
        int sum = value1 + value2;
        try {
            Thread.sleep(1500);
        } catch (Exception e) {

        }
        cb.onAdditionResult(sum);
    }

    public void subtract(
            int value1,
            int value2,
            CalculatorEventListener cb
    ) {
        cb.onSubtractionResult(value1 - value2);
    }


    public void multiply(
            int value1,
            int value2,
            CalculatorEventListener cb
    ) {
        cb.onAdditionResult(value1 * value2);
    }

    public void divide(
            int value1,
            int value2,
            CalculatorEventListener cb
    ) {
        cb.onAdditionResult(value1 / value2);
    }
}
