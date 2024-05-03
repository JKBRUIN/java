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
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    // Directory of card images
    private static final String CARD_DIRECTORY = "C:\\Kellam_405Asgmt8\\CardDisplay\\src\\cards";
    // Total number of cards
    private static final int TOTAL_CARDS = 52;
    // Number of cards to display
    private static final int CARDS_TO_DISPLAY = 4;

    @Override
    public void start(Stage primaryStage) {
        try {
        GridPane gridPane = new GridPane();

        // Creating a list to store the numbers of the cards
        List<Integer> cardNumbers = new ArrayList<>();
        // Populating the list with card numbers from 1 to TOTAL_CARDS
        for (int i = 1; i <= TOTAL_CARDS; i++) {
            cardNumbers.add(i);
        }
        // Shuffling the card numbers to get a random order
        Collections.shuffle(cardNumbers);

        // Creating a list to store the ImageViews of the cards to be displayed
        List<ImageView> cardViews = new ArrayList<>();
        // Selecting a subset of shuffled card numbers to display
        for (int i = 0; i < CARDS_TO_DISPLAY; i++) {
            int cardNumber = cardNumbers.get(i);
            // Constructing the file path for the image corresponding to the card number
            String imagePath = CARD_DIRECTORY + "/" + cardNumber + ".png";
            // Creating Image object from file path
            Image image = new Image(new File(imagePath).toURI().toString());
            // Creating ImageView to display image
            ImageView imageView = new ImageView(image);
            // Adding the ImageView to the list
            cardViews.add(imageView);
        }

        // Adding the list of ImageViews to the grid pane
        int col = 0;
        for (ImageView imageView : cardViews) {
            gridPane.add(imageView, col++, 0);
        }

        // Creating a scene with the grid pane and setting its dimensions
        Scene scene = new Scene(gridPane, 300, 130);
        // Setting the scene for the primary stage
        primaryStage.setScene(scene);
        // Setting the title of the window
        primaryStage.setTitle("Random Cards");
        // Displaying the primary stage
        primaryStage.show();
    }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
