package case_notifirer;

public class MyProgram {
    public static void main(String[] args) {

        TestCase testCase = new TestCase();
        CaseLibrary caseLibrary = new CaseLibrary();
        caseLibrary.runProgram(testCase, "snake_ase" );
    }
}
