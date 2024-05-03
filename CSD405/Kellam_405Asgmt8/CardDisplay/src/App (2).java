import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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

    private static final String CARD_DIRECTORY = "C:\\Users\\jskel\\OneDrive\\Desktop\\Kellam_405Asgmt8\\CardDisplay\\src\\cards";
    private static final int NUM_CARDS = 52;
    private static final int NUM_CARDS_TO_DISPLAY = 4;

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        List<Integer> cardNumbers = new ArrayList<>();
        for (int i = 1; i <= NUM_CARDS; i++) {
            cardNumbers.add(i);
        }
        Collections.shuffle(cardNumbers);

        List<ImageView> cardViews = new ArrayList<>();
        for (int i = 0; i < NUM_CARDS_TO_DISPLAY; i++) {
            int cardNumber = cardNumbers.get(i);
            String imagePath = CARD_DIRECTORY + "/" + cardNumber + ".png";
            Image image = new Image(new File(imagePath).toURI().toString());
            ImageView imageView = new ImageView(image);
            cardViews.add(imageView);
        }

        int col = 0;
        for (ImageView imageView : cardViews) {
            gridPane.add(imageView, col++, 0);
        }

        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Random Cards");
        primaryStage.show();
    }
}
