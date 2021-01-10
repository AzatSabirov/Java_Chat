package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    private ListView<String> listView;

    private final ObservableList<String> wordList = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        listView.setItems(wordList);
    }


    @FXML
    void sendMessage() {
        String message = inputField.getText().trim();
        if(message.length() != 0){
            addMessageToList(message);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Empty Message!");
            alert.show();
        }
        inputField.clear();

    }

    private void addMessageToList(String message) {
        listView.getItems().add(message);
    }

    @FXML
    void showAbout() {
        System.out.println("About");
    }

    @FXML
    void exit(ActionEvent event) {

        System.exit(0);
    }
}

