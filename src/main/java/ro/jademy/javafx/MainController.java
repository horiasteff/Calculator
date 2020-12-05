package ro.jademy.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label result;
    private float number1 = 0;
    private String operator = "";
    private boolean start = true;
    private Model model = new Model();

    @FXML
    private void processNumbers(ActionEvent event) {
        if (start) {
            result.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        result.setText(result.getText() + value);
    }

    @FXML
    private void processOperators(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (!value.equals("=")) {
            if (!operator.isEmpty()) {
                return;
            }
            operator = value;
            number1 = Long.parseLong(result.getText());
            result.setText("");
        } else {
            if (operator.isEmpty()) {
                return;
            }
            float number2 = Long.parseLong(result.getText());
            float output = model.calculate(number1, number2, operator);
            result.setText(String.valueOf(output));

            operator = "";
            start = true;
        }

    }
}
