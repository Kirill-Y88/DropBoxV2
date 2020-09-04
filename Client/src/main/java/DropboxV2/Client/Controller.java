package DropboxV2.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TextField host;
    @FXML
    TextField port;
    @FXML
    TextField login;
    @FXML
    TextField password;
    @FXML
     TextField pathClient;
    @FXML
     TableView<FileInfo> tableViewClient;
    @FXML
     TextField pathServer;
    @FXML
    TableView<FileInfo> tableViewServer;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

            


    }

    public void connect(ActionEvent actionEvent) {

    }

    public void disconnect(ActionEvent actionEvent) {

    }

    public void upClient(ActionEvent actionEvent) {
    }

    public void upServer(ActionEvent actionEvent) {
    }

    public void copy(ActionEvent actionEvent) {
    }

    public void delete(ActionEvent actionEvent) {
    }

    public void rename(ActionEvent actionEvent) {
    }

    public void create_directory(ActionEvent actionEvent) {
    }
}
