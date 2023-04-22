import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


// the MyController is where all the methods for the Javafx elements go
public class MyController {
    @FXML
    private TextField clientTextField;

    @FXML
    private Button serverButton;

    @FXML
    private Button clientButton;


    // this should launch the server
    void serverLaunch(ActionEvent e) throws IOException {

    }

    // this should launch the client
    void clientLaunch(ActionEvent e) throws IOException{

    }
}
