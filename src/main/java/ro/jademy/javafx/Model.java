package ro.jademy.javafx;

public class Model {

    protected float calculate(float number1, float number2, String operator) {

        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) {
                    return 0;
                } else {
                    return number1 / number2;
                }
            default:
                return 0;
        }
    }
}
