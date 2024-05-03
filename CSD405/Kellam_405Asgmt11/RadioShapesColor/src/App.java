/*
 * Jeremiah Kellam
 * CSD 405 Module 11 Assignment
 * 3/3/2024
 * 
 * Write a program that displays various figures such as:
 *      a Circle, 
 *      a Rectangle, 
 *      or an Ellipse.
 *      added hexagon.
 * Include radio buttons selections for changing the display figure to the one selected.
 * Include a checkbox for filling and clearing the displayed figure with a random color.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.Random;

public class App extends Application {

    private final int WIDTH = 900;
    private final int HEIGHT = 400;

    private Circle circle;
    private Rectangle rectangle;
    private Ellipse ellipse;
    private Polygon hexagon;

    private CheckBox fillCheckBox;

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Create shapes
        circle = new Circle(150);
        rectangle = new Rectangle(400, 200);
        ellipse = new Ellipse(200, 150);
        hexagon = createHexagon(150);

        // Set outline color for shapes
        setOutlineColor(Color.BLACK);

        // Create radio buttons
        ToggleGroup shapeGroup = new ToggleGroup();
        RadioButton circleRadioButton = new RadioButton("Circle");
        RadioButton rectangleRadioButton = new RadioButton("Rectangle");
        RadioButton ellipseRadioButton = new RadioButton("Ellipse");
        RadioButton hexagonRadioButton = new RadioButton("Hexagon");

        circleRadioButton.setToggleGroup(shapeGroup);
        rectangleRadioButton.setToggleGroup(shapeGroup);
        ellipseRadioButton.setToggleGroup(shapeGroup);
        hexagonRadioButton.setToggleGroup(shapeGroup);

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
            } else if (hexagonRadioButton.isSelected()) {
                root.setCenter(hexagon);
            }
        });

        // Create checkbox for fill color
        fillCheckBox = new CheckBox("Check/Uncheck to fill with random colors");

        // Handle checkbox selection
        fillCheckBox.setOnAction(event -> {
            if (fillCheckBox.isSelected()) {
                fillColorRandomly();
            } else {
                clearFillColor();
            }
        });

        VBox controlsBox = new VBox(10, circleRadioButton, rectangleRadioButton, ellipseRadioButton, hexagonRadioButton, fillCheckBox);
        controlsBox.setStyle("-fx-padding: 10px; -fx-alignment: left;");
        root.setLeft(controlsBox);

        root.setCenter(circle); // Set default shape to display

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Radio Buttons with Shapes & Random Colors");
        primaryStage.show();
    }

    private Polygon createHexagon(double size) {
        Polygon hexagon = new Polygon();
        for (int i = 0; i<6; i++) {
            double angle = 2 * Math.PI/6.0 * i;
            hexagon.getPoints().add(size * Math.cos(angle));
            hexagon.getPoints().add(size * Math.sin(angle));
        }
        return hexagon;
    }

    private void setOutlineColor(Color BLACK) {
        circle.setStroke(BLACK);
        rectangle.setStroke(BLACK);
        ellipse.setStroke(BLACK);
        hexagon.setStroke(BLACK);
    }

    private void fillColorRandomly() {
        Random random = new Random();
        Color color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        if (circle != null) circle.setFill(color);
        if (rectangle != null) rectangle.setFill(color);
        if (ellipse != null) ellipse.setFill(color);
        if (hexagon != null) hexagon.setFill(color);
    }

    private void clearFillColor() {
        if (circle != null) circle.setFill(null);
        if (rectangle != null) rectangle.setFill(null);
        if (ellipse != null) ellipse.setFill(null);
        if (hexagon != null) hexagon.setFill(null);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
