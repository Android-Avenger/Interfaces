package interface_practice;

public class MyProgram {

    public static void main(String[] args) {

        CalculatorEventListener eventListener = new CalculatorEventListener() {
            @Override
            public void onAdditionResult(int result) {
                System.out.println("Addition Result Found: " + result);
            }

            @Override
            public void onSubtractionResult(int result) {
                System.out.println("Subtraction Result Found: " + result);
            }

            @Override
            public void onMultiplicationResult(int result) {
                System.out.println("Multiplication Result Found: " + result);
            }

            @Override
            public void onDivisionResult(int result) {
                System.out.println("Division Result Found: " + result);
            }
        };

        TestEventBroadcaster eventBroadcaster = new TestEventBroadcaster();

        System.out.println("Program has been started!");

        System.out.println("Multiplication Request has been made!");
        eventBroadcaster.multiply(5, 6, eventListener);

        System.out.println("Division Request has been made!");
        eventBroadcaster.divide(5, 6, eventListener);

        System.out.println("Subtraction Request has been made!");
        eventBroadcaster.subtract(5, 6, eventListener);

        System.out.println("Addition Request has been made!");
        eventBroadcaster.add(5, 6, eventListener);

//        try {
//            Thread.sleep(5000);
//        } catch (Exception e) {
//
//        }
    }

}
