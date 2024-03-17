package com.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Dashboard extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    
    public void start(Stage primaryStage) {
    

        Button b1 = new Button("DashBoard");
        Button b2 = new Button("Contacts");
        Button b3 = new Button("Stock ");
        Button b4 = new Button("Sales");
        Button b5 = new Button("Reports");

        b1.setPrefWidth(120);
        b2.setPrefWidth(120);
        b3.setPrefWidth(120);
        b4.setPrefWidth(120);
        b5.setPrefWidth(120);

        VBox vb1 = new VBox(15);
        vb1.getChildren().addAll(b1,b2,b3,b4,b5);
        vb1.setPadding(new Insets(20));
        vb1.setAlignment(Pos.TOP_LEFT);
        vb1.setStyle("-fx-background-color:grey;");
        BorderPane bp1 = new BorderPane();
        bp1.setLeft(vb1);


        Scene s3 = new Scene(bp1, 1200  , 800);
        primaryStage.setScene(s3);
        primaryStage.show();
    




    }
}

