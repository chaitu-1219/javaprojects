package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class calculatorapp extends Application {

    private TextField display;
    private double num1 = 0;
    private String operator = "";
    private boolean start = true;

    @Override
    public void start(Stage primaryStage) {
        display = new TextField();
        display.setEditable(false);
        display.setStyle("-fx-font-size: 18px;");
        display.setPrefHeight(50);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(5);
        grid.setHgap(5);

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        int row = 1, col = 0;
        for (String text : buttons) {
            Button button = new Button(text);
            button.setPrefSize(60, 60);
            button.setStyle("-fx-font-size: 16px;");
            button.setOnAction(e -> handleButtonClick(text));
            grid.add(button, col, row);
            col++;
            if (col > 3) {
                col = 0;
                row++;
            }
        }

        grid.add(display, 0, 0, 4, 1);

        Scene scene = new Scene(grid, 260, 300);
        primaryStage.setTitle("JavaFX Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(String text) {
        switch (text) {
            case "C":
                display.clear();
                operator = "";
                num1 = 0;
                start = true;
                break;

            case "+":
            case "-":
            case "*":
            case "/":
                if (!display.getText().isEmpty()) {
                    num1 = Double.parseDouble(display.getText());
                    operator = text;
                    display.clear();
                }
                break;

            case "=":
                if (!operator.isEmpty() && !display.getText().isEmpty()) {
                    double num2 = Double.parseDouble(display.getText());
                    double result = calculate(num1, num2, operator);
                    display.setText(String.valueOf(result));
                    operator = "";
                    start = true;
                }
                break;

            default: // digits
                if (start) {
                    display.clear();
                    start = false;
                }
                display.appendText(text);
                break;
        }
    }

    private double calculate(double a, double b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> b != 0 ? a / b : 0;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        launch(args);
    }
}