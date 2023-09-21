package com.example.demo1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FunctionCalculator extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        Label Task28 = new Label("Задание №28");
        Task28.setAlignment(Pos.CENTER);

        // Создаем компоненты интерфейса
        Label xLabel = new Label("Введите x:");
        TextField xTextField = new TextField();

        Label yLabel = new Label("Введите y:");
        TextField yTextField = new TextField();

        Button calculateButton = new Button("Вычислить");
        Label resultLabel = new Label("Результат:");

        calculateButton.setOnAction(event -> {

            try {
                double x = Double.parseDouble(xTextField.getText());
                double y = Double.parseDouble(yTextField.getText());
                double z = Math.asin(x + y);
                resultLabel.setText("Результат: " + z);
            }
            catch (NumberFormatException e) {
                resultLabel.setText("Ошибка ввода");
            }
        });



        Label Task1 = new Label("Задание №1");
        Task1.setAlignment(Pos.CENTER);

        Label a_Label = new Label("Сторона A:");
        TextField a_TextField = new TextField();

        Label b_Label = new Label("Сторона B:");
        TextField b_TextField = new TextField();

        Label c_Label = new Label("Сторона C:");
        TextField c_TextField = new TextField();

        Label dLabel = new Label("Сторона D:");
        TextField d_TextField = new TextField();

        Button checkButton1 = new Button("Проверить умещение");

        Label resultLabel1 = new Label();

        // Создаем обработчик события нажатия на кнопку "Проверить умещение"
        checkButton1.setOnAction(event -> {
            try {
                double a = Double.parseDouble(a_TextField.getText());
                double b = Double.parseDouble(b_TextField.getText());
                double c = Double.parseDouble(c_TextField.getText());
                double d = Double.parseDouble(d_TextField.getText());

                if ((a <= c && b <= d) || (a <= d && b <= c)) {
                    resultLabel1.setText("Прямоугольник AxB умещается внутри CxD.");
                } else {
                    resultLabel1.setText("Прямоугольник AxB не умещается внутри CxD.");
                }
            } catch (NumberFormatException e) {
                resultLabel1.setText("Ошибка ввода сторон.");
            }
        });



        Label Task4 = new Label("Задание №4");
        Task4.setAlignment(Pos.CENTER);

        // Создаем компоненты интерфейса
        Label xLabel4 = new Label("Введите a1:");
        TextField xTextField4 = new TextField();

        Label yLabel4 = new Label("Введите a2:");
        TextField yTextField4 = new TextField();

        Label zLabel4 = new Label("Введите a3:");
        TextField zTextField4 = new TextField();

        Button calculateButton4 = new Button("Вычислить");
        Label resultLabel4 = new Label("Результат:");

        calculateButton4.setOnAction(event -> {
            try{
                double a1 = Double.parseDouble(xTextField4.getText());
                double a2 = Double.parseDouble(yTextField4.getText());
                double a3 = Double.parseDouble(zTextField4.getText());

                double c = a1 + a2;
                double b = a1 + 0.7 * a3;

                if (0 <= c && c <= 5 && 0 <= b && b <= 10)
                    resultLabel4.setText("Точка находится внутри прямоугольника");
                else
                    resultLabel4.setText("Точка не находится внутри прямоугольника");
            }
            catch (NumberFormatException e) {
                resultLabel4.setText("Ошибка ввода");
            }

        });



        Label Task7 = new Label("Задание №7");
        Task7.setAlignment(Pos.CENTER);

        // Создаем компоненты интерфейса
        Label xLabel7 = new Label("Введите x:");
        TextField xTextField7 = new TextField();

        Label yLabel7 = new Label("Введите y:");
        TextField yTextField7 = new TextField();

        Button calculateButton7 = new Button("Вычислить");
        Label resultLabel7 = new Label("Результат:");

        calculateButton7.setOnAction(event -> {
            try {
                double x = Double.parseDouble(xTextField7.getText());
                double y = Double.parseDouble(yTextField7.getText());
                double z = Math.log(x - y) - (x / y);
                resultLabel7.setText("Результат: " + z);
            } catch (NumberFormatException e) {
                resultLabel7.setText("Ошибка ввода чисел.");
            } catch (ArithmeticException e) {
                resultLabel7.setText("Деление на ноль.");
            }
        });

        Label Task10 = new Label("Задание №10");
        Task10.setAlignment(Pos.CENTER);

        Label aLabel10 = new Label("A:");
        TextField aTextField10 = new TextField();

        Label bLabel10 = new Label("B:");
        TextField bTextField10 = new TextField();

        Label cLabel10 = new Label("C:");
        TextField cTextField10 = new TextField();

        Button printButton = new Button("Вывести переменные");

        Label resultLabel10 = new Label("Результат:");


        printButton.setOnAction(event -> {
            try {
                // Получаем значения переменных
                double a = Double.parseDouble(aTextField10.getText());
                double b = Double.parseDouble(bTextField10.getText());
                double c = Double.parseDouble(cTextField10.getText());

                // Сортируем переменные в порядке возрастания
                double[] sortedVariables = {a, b, c};
                java.util.Arrays.sort(sortedVariables);

                // Выводим переменные в порядке возрастания
                resultLabel10.setText("Результат: " + sortedVariables[0] + ", " + sortedVariables[1] + ", " + sortedVariables[2]);
            } catch (NumberFormatException e) {
                resultLabel10.setText("Ошибка ввода чисел.");
            }
        });



        ScrollPane scrollPane = new ScrollPane();
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(
                Task28,xLabel, xTextField, yLabel, yTextField, calculateButton, resultLabel,
                Task1,a_Label, a_TextField,
                        b_Label, b_TextField,
                        c_Label, c_TextField,
                        dLabel, d_TextField,
                        checkButton1, resultLabel1,
                Task4,xLabel4, xTextField4, yLabel4, yTextField4, zLabel4, zTextField4, calculateButton4, resultLabel4,
                Task7,xLabel7, xTextField7, yLabel7, yTextField7, calculateButton7, resultLabel7,
                Task10,aLabel10, aTextField10, bLabel10, bTextField10, cLabel10, cTextField10, printButton, resultLabel10);

        scrollPane.setContent(layout);
        Scene scene = new Scene(scrollPane, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}