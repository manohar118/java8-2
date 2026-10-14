import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayTextAndImage extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text and Image Display");

        Label label = new Label("Hello, JavaFX!");
        Image image = new Image(new File("imagePath.jpg").toURI().toString());
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(560);
        imageView.setFitHeight(330);
        imageView.setPreserveRatio(true);

        VBox layout = new VBox(10, label, imageView);
        Scene scene = new Scene(layout, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
