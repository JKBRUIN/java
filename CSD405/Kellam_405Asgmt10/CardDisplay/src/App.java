/*
 * Jeremiah Kellam
 * CSD 405
 * Module 10 Assignment
 * 2/25/2024
 * 
 * 
 * References:
 * net0x. (2022, June 13). JavaFX for VSCODE ( UNDER 2 MINUTES !! ) [Video]. YouTube. https://www.youtube.com/watch?v=ombuBCzClzo
 * 
 * https://www.tutorialspoint.com/javafx/layout_gridpane.htm
 * 
 * https://www.geeksforgeeks.org/collections-shuffle-method-in-java-with-examples/
 * 
 * https://www.tutorialspoint.com/javafx/javafx_images.htm
 * 
 * GfG. (2018, September 7). JavaFX HBox Class. GeeksforGeeks. https://www.geeksforgeeks.org/javafx-hbox-class/
 * 
 * Jenkov, J. (n.d.). JavaFX GridPane. https://jenkov.com/tutorials/javafx/gridpane.html
 * 
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class App extends Application {

    private final int WIDTH = 500;
    private final int HEIGHT = 500;

    private Circle circle;
    private Rectangle rectangle;
    private Ellipse ellipse;

    private CheckBox fillCheckBox;

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Create shapes
        circle = new Circle(200);
        rectangle = new Rectangle(200, 300);
        ellipse = new Ellipse(150, 200);

        // Create radio buttons
        ToggleGroup shapeGroup = new ToggleGroup();
        RadioButton circleRadioButton = new RadioButton("Circle");
        RadioButton rectangleRadioButton = new RadioButton("Rectangle");
        RadioButton ellipseRadioButton = new RadioButton("Ellipse");

        circleRadioButton.setToggleGroup(shapeGroup);
        rectangleRadioButton.setToggleGroup(shapeGroup);
        ellipseRadioButton.setToggleGroup(shapeGroup);

        // Set default selection
        circleRadioButton.setSelected(true);

        // Handle radio button selections
        shapeGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (circleRadioButton.isSelected()) {
                root.setCenter(circle);
            } else if (rectangleRadioButton.isSelected()) {
                root.setCenter(rectangle);
            } else if (ellipseRadioButton.isSelected()) {
                root.setCenter(ellipse);
            }
        });

        // Create checkbox for fill color
        fillCheckBox = new CheckBox("Fill with random color");

        // Handle checkbox selection
        fillCheckBox.setOnAction(event -> {
            if (fillCheckBox.isSelected()) {
                fillColorRandomly();
            } else {
                clearFillColor();
            }
        });

        HBox controlsBox = new HBox(10, circleRadioButton, rectangleRadioButton, ellipseRadioButton, fillCheckBox);
        controlsBox.setStyle("-fx-padding: 10px; -fx-alignment: center;");
        root.setTop(controlsBox);

        root.setCenter(circle); // Set default shape to display

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shapes Display");
        primaryStage.show();
    }

    private void fillColorRandomly() {
        Random random = new Random();
        Color color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        if (circle != null) circle.setFill(color);
        if (rectangle != null) rectangle.setFill(color);
        if (ellipse != null) ellipse.setFill(color);
    }

    private void clearFillColor() {
        if (circle != null) circle.setFill(null);
        if (rectangle != null) rectangle.setFill(null);
        if (ellipse != null) ellipse.setFill(null);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
