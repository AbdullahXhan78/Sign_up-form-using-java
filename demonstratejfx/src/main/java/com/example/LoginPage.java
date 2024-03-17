package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginPage extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Scene scene2, scene;
    Stage window;
    
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("LoginPage");

        Label head = new Label("Login");
        head.setLayoutX(175);
        head.setLayoutY(40);
        head.setStyle("-fx-font-size: 22px");

        Label username = new Label("Username");
        TextField usertxt = new TextField();
        usertxt.setPromptText("Enter Your Username ");
        usertxt.setPrefWidth(200);
        usertxt.setPrefHeight(30);
        usertxt.setAlignment(Pos.CENTER);

        Label pass  = new Label("Password");
        PasswordField passtxt = new PasswordField();
        passtxt.setPromptText("Enter Your Password ");
        passtxt.setPrefWidth(200);
        passtxt.setPrefHeight(30);
        passtxt.setAlignment(Pos.CENTER);
        
        Button login = new Button();
        login.setText("Login");
        login.setAlignment(Pos.CENTER);
        login.setPrefHeight(30);
        login.setPrefWidth(200);

        Label l1 = new Label();
        l1.setText("Don't Have an Account, Signup Here");
        l1.setLayoutX(105);
        l1.setLayoutY(500);
        l1.setAlignment(Pos.BOTTOM_CENTER);
        l1.setStyle("-fx-underline: true;");

        Button signup = new Button();
        signup.setText("SignUp");
        signup.setLayoutX(180);
        signup.setLayoutY(530);
        signup.prefHeight(30);
        signup.prefWidth(200);
        signup.setOnAction(e -> primaryStage.setScene(SignupPage.setSignupScene()));

        VBox vb1 = new VBox(5);
        vb1.getChildren().addAll(username,usertxt);

        VBox vb2 = new VBox(5);
        vb2.getChildren().addAll(pass,passtxt);

        Label space = new Label(" ");
        VBox vb3 = new VBox();
        vb3.getChildren().addAll(space,login);

        VBox vb_main = new VBox(20);
        vb_main.getChildren().addAll(vb1,vb2,vb3);
        vb_main.setLayoutX(100);
        vb_main.setLayoutY(150);
        vb_main.setAlignment(Pos.BOTTOM_CENTER);

        Pane layout = new Pane(vb_main,head, signup,l1);

        Scene scene = new Scene(layout, 400, 650);
        window.setScene(scene);
        window.show();
        
        
        

    }
}
