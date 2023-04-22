import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class MyController {
    @FXML
    private TextField clientTextField;
    @FXML
    private Button serverButton, clientButton, clientSubmitButton;
    @FXML
    private VBox beginningRoot, clientRoot, serverRoot;
    @FXML
    private ListView<String> listItems, listItems2;
    @FXML
    private Server serverConnection;
    private Client clientConnection;

    // this should launch the server
    public void serverLaunch(ActionEvent e) throws IOException {
        // switch the scene to the server scene

        // set up decor display


    }

    // this should launch the client
    public void clientLaunch(ActionEvent e) throws IOException{

    }
}
