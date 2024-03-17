
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SignupPage extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public static Scene setSignupScene(){
       // stage1.setTitle("Signup Page");
        Label head1 = new Label("Signup Here");
        head1.setLayoutX(150);
        head1.setLayoutY(40);
        head1.setStyle("-fx-font-size: 22px");

        Label head2 = new Label("Please register using your Email Address ");
        head2.setLayoutX(80);
        head2.setLayoutY(110);
        head2.setStyle("-fx-font-size: 15px");

        Label email = new Label("Email address");
        TextField emailtxt = new TextField();
        emailtxt.setPromptText("Enter Your Email ");
        emailtxt.setPrefWidth(200);
        emailtxt.setPrefHeight(30);
        emailtxt.setAlignment(Pos.CENTER);

        Label pass1 = new Label("Password");
        PasswordField pass1txt = new PasswordField();
        pass1txt.setPromptText("Enter Your Password ");
        pass1txt.setPrefWidth(200);
        pass1txt.setPrefHeight(30);
        pass1txt.setAlignment(Pos.CENTER);

        Label c_name = new Label("Username");
        TextField c_nametxt = new TextField();
        c_nametxt.setPromptText("Enter Your Username ");
        c_nametxt.setPrefWidth(200);
        c_nametxt.setPrefHeight(30);
        c_nametxt.setAlignment(Pos.CENTER);

        Label c_num = new Label("Contact Number");
        TextField c_numtxt = new TextField();
        c_numtxt.setPromptText("Enter Your Phone Number ");
        c_numtxt.setPrefWidth(200);
        c_numtxt.setPrefHeight(30);
        c_numtxt.setAlignment(Pos.CENTER);

        VBox v1 = new VBox(5);
        v1.getChildren().addAll(email,emailtxt);

        VBox v2 = new VBox(5);
        v2.getChildren().addAll(pass1,pass1txt);

        VBox v3 = new VBox(5);
        v3.getChildren().addAll(c_name,c_nametxt);

        VBox v4 = new VBox(5);
        v4.getChildren().addAll(c_num, c_numtxt);

        Button b1 = new Button("Create Account");
        b1.setPrefHeight(30);
        b1.setPrefWidth(200);
        VBox v = new VBox(20);
        v.getChildren().addAll(v1,v2,v3,v4,b1);
        v.setLayoutX(100);
        v.setLayoutY(150);
        
        Pane p1 = new Pane(v,head1,head2);

        Scene scene2 = new Scene(p1,400,650);
       // stage1.setScene(scene2);
       // stage1.show();
       return scene2;
    }
    
    public void start(Stage stage1) throws Exception {
        
        Alert a = new Alert(AlertType.CONFIRMATION);
        a.setContentText("Your Account has been created Succesfully");
        a.show();

    }


    
}
