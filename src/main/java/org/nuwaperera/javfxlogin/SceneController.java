package org.nuwaperera.javfxlogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private AnchorPane background;

    @FXML
    private Button forgotpwbtn;

    @FXML
    private Button loginbtn;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Button signupbtn;

    @FXML
    private TextField usernamefield;

    @FXML
    void forgotpwbtnclicked(ActionEvent event) {

    }

    @FXML
    void loginbtnclicked(ActionEvent event) {

    }

    @FXML
    private Label greetLable;

    public void switchLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JavaFX - Login");
        stage.show();
    }

    public void switchSignUp(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JavaFX - Sign Up");
        stage.show();
    }
    public void switchContacts(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("contact.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JavaFX - Contact Details");
        stage.show();
    }

    public void switchLoginDetails(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login-details.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JavaFX - Login Details");
        stage.show();
    }

    public void switchDone(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("done.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JavaFX - Login Success!");
        stage.show();
    }
}