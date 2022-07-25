package interface_practice_day_two;

public class MyRunner implements SomeEvents {
    public void runProgram() {

        EventEmitter emitter = new EventEmitter();

        emitter.emitEvent(this);
    }

    @Override
    public void eventOne(int a) {
        System.out.println(a);
    }
}
