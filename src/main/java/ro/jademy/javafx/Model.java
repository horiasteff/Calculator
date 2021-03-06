package ro.jademy.javafx;

import java.io.Serializable;

public class Model {

    protected Serializable calculate(float number1, float number2, String operator) {

        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) {
                    return new ArithmeticException();
                } else {
                    return number1 / number2;
                }
            default:
                return 0;
        }
    }
}
