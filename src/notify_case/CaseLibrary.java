package notify_case;

public class CaseLibrary implements NotifyCase {

    public void runProgram(TestCase tc, String text){

        tc.testCase(text,this);

    }

    @Override
    public void onSnakeCaseFound(String text, String camelCase, String pascalCase) {

        System.out.println(text);
        System.out.println(camelCase);
        System.out.println(pascalCase);
    }

    @Override
    public void onCamelCaseFound(String text, String snakeCase, String pascalCase) {
        System.out.println(text);
        System.out.println(snakeCase);
        System.out.println(pascalCase);
    }

    @Override
    public void onPascalCaseFound(String text, String snakeCase, String camelCase) {
        System.out.println(text);
        System.out.println(camelCase);
        System.out.println(snakeCase);
    }
}
