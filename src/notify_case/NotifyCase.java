package notify_case;

public interface NotifyCase {

    void onSnakeCaseFound(String text, String camelCase, String pascalCase) ;

    void onCamelCaseFound(String text, String snakeCase, String pascalCase);

    void onPascalCaseFound(String text, String snakeCase, String camelCase) ;

}
