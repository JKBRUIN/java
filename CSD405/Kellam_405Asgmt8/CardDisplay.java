package Kellam_405Asgmt8;

/*
 * Jeremiah Kellam
 * CSD405 Module 8 Assignment
 * 2/18/2024
 * Write a program that displays four images randomly selected from a deck of 52 cards. 
 * The attached zip file has card files titled 1.png, 2.png, 3.png, 4.png, …, 52.png. 
 * For this application:
 * Store the images in a “cards” sub directory.
 * Using these cards, randomly select four cards for display.
 */

 import javafx.application.Application;
 import javafx.geometry.Insets;
 import javafx.scene.Scene;
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
 import javafx.scene.layout.GridPane;
 import javafx.stage.Stage;
 
 import java.io.File;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;
 import java.util.Random;
 
 public class CardDisplay extends Application {
 
     private static final int NUM_CARDS = 52;
     private static final int NUM_DISPLAY = 4;
     private static final String CARD_DIRECTORY = "cards/";
 
     private List<Image> cardImages;
 
     @Override
     public void start(Stage primaryStage) {
         primaryStage.setTitle("Random Card Display");
 
         // Load card images
         cardImages = loadCardImages();
 
         // Select random cards
         List<Image> randomCards = selectRandomCards();
 
         // Create ImageViews for the selected cards
         GridPane gridPane = new GridPane();
         gridPane.setPadding(new Insets(10));
         gridPane.setHgap(10);
         gridPane.setVgap(10);
 
         int col = 0;
         for (Image image : randomCards) {
             ImageView imageView = new ImageView(image);
             imageView.setFitWidth(200);
             imageView.setFitHeight(300);
             gridPane.add(imageView, col++, 0);
         }
 
         Scene scene = new Scene(gridPane, 860, 320);
         primaryStage.setScene(scene);
         primaryStage.show();
     }
 
     private List<Image> loadCardImages() {
         List<Image> images = new ArrayList<>();
         for (int i = 1; i <= NUM_CARDS; i++) {
             String imagePath = CARD_DIRECTORY + i + ".png";
             Image image = new Image(new File(imagePath).toURI().toString());
             images.add(image);
         }
         return images;
     }
 
     private List<Image> selectRandomCards() {
         long seed = System.nanoTime();
         List<Integer> indices = new ArrayList<>();
         for (int i = 0; i < NUM_CARDS; i++) {
             indices.add(i);
         }
         Collections.shuffle(indices, new Random(seed));
         indices = indices.subList(0, NUM_DISPLAY);
 
         List<Image> randomCards = new ArrayList<>();
         for (int index : indices) {
             randomCards.add(cardImages.get(index));
         }
         return randomCards;
     }
 
     public static void main(String[] args) {
         launch(args);
     }
 }
 