package chain_methods;

public class Calculate {

    public static void main(String[] args) {

        Calculator.startFrom(0)
                .incrementByOne()
                .add(4)
                .divide(2)
                .subtract(1)
                .multiply(6)
                .add(7)
                .result()
        ;
    }

}
