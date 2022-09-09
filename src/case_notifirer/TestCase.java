package case_notifirer;

public class TestCase {

    public void testCase(String text,NotifyCase notifyCase) {

        if (text.equals(text.toLowerCase()) && text.contains("_")) {
            snakeToPascalAndCamel(text, notifyCase);

        } else if (Character.isUpperCase(text.charAt(0)) && text.chars().anyMatch(Character::isLowerCase)) {
            pascalToSnake_caseAndCamelCase(text, notifyCase);

        } else if (Character.isLowerCase(text.charAt(0)) && text.chars().anyMatch(Character::isUpperCase)) {
            camelToSnakeAndPascalCase(text, notifyCase);
        }

    }

    public static void camelToSnakeAndPascalCase(String text, NotifyCase cn) {

        String snake_case = "";
        char c = text.charAt(0);
        snake_case = snake_case + Character.toLowerCase(c);

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                snake_case = snake_case + '_';
                snake_case = snake_case + Character.toLowerCase(ch);
            } else {
                snake_case = snake_case + ch;
            }
        }
        String pascalCase = text.substring(0, 1).toUpperCase() + text.substring(1);
        cn.onCamelCaseFound(text, snake_case, pascalCase);
    }

    public static void pascalToSnake_caseAndCamelCase(String text, NotifyCase cn) {

        String snake_case = "";
        char c = text.charAt(0);
        snake_case = snake_case + Character.toLowerCase(c);

        for (int i = 1; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                snake_case = snake_case + "_";
                snake_case = snake_case + Character.toLowerCase(ch);
            } else {
                snake_case = snake_case + ch;
            }
        }
        String camelCase = text.substring(0, 1).toLowerCase() + text.substring(1);
        cn.onPascalCaseFound(text, snake_case, camelCase);
    }


    public static void snakeToPascalAndCamel(String snakeCase, NotifyCase cn) {

        StringBuilder camelCase = new StringBuilder(snakeCase);

        for (int i = 1; i < camelCase.length(); i++) {

            if (camelCase.charAt(i) == '_') {
                camelCase.deleteCharAt(i);
                camelCase.replace(i, i + 1, String.valueOf(Character.toUpperCase(camelCase.charAt(i))));
            }
        }
        String pascalCase = camelCase.substring(0, 1).toUpperCase() + camelCase.substring(1);
        cn.onSnakeCaseFound(snakeCase, camelCase.toString(), pascalCase);
    }

}
