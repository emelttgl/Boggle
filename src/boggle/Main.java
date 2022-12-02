package boggle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        Boggle bogg=new Boggle(5);
        root.setCenter(new VueLettres(bogg));
        root.setBottom((new VueInfos(bogg)));
        root.setRight(new PanneauControle(bogg));


        stage.setTitle("Boggle.jeu");
        root.setStyle("-fx-background-color: pink;");
        stage.setScene(new Scene(root, 400, 400));
        stage.show();
    }

    public static void main(String[] args) {
            launch(args);

    }
}
