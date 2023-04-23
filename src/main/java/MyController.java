import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

// the MyController is where all the methods for the Javafx elements go
public class MyController implements Initializable{
    @FXML
    private TextField clientTextField;
    @FXML
    private Button serverButton, clientButton, clientSubmitButton;
    @FXML
    private BorderPane beginningRoot, clientRoot, serverRoot;
    @FXML
    private ListView<String> listItems, listItems2;
    @FXML
    private Server serverConnection;
    @FXML
    private Client clientConnection;
    @FXML
    private BorderPane root2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
    }

    // this should launch the server
    public void serverLaunch(ActionEvent e) throws IOException {
        System.out.println("serverLaunch");
        // switch the scene to the server scene
//        beginningRoot.getScene().setRoot(serverRoot);

        // set up server connection
//        serverConnection = new Server(data -> {
//            Platform.runLater(()->{ listItems.getItems().add(data.toString()); });
//        });

        // set up "Decorations"

        // set up data displaying (listviews from client input)
    }

    // this should launch the client
    public void clientLaunch(ActionEvent e) throws IOException{
        System.out.println("clientLaunch");
        // switch the scene to the client scene

        // set up client "decorations"

        // set up client connection
//        clientConnection = new Client(data->{
//            Platform.runLater(()->{listItems2.getItems().add(data.toString());});
//        });
//        clientConnection.start();

        // set up data
    }
}
