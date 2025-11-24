package fatec.lanchoneteapp.adapters.ui.cliente;

import fatec.lanchoneteapp.application.dto.ClienteDTO;
import fatec.lanchoneteapp.application.facade.CadastroFacade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ClienteController implements Initializable {

    private final CadastroFacade cadastroFacade;

    //Tabela
    @FXML private TableView<ClienteDTO> tvListaClientes;
    @FXML private TableColumn<ClienteDTO, Integer> tcIDCliente;
    @FXML private TableColumn<ClienteDTO, String> tcNomeCliente;
    @FXML private TableColumn<ClienteDTO, String> tcTelefoneCliente;
    @FXML private TableColumn<ClienteDTO, String> tcCPFCliente;
    @FXML private TableColumn<ClienteDTO, String> tcLogradouroCliente;
    @FXML private TableColumn<ClienteDTO, Integer> tcNumeroCliente;
    @FXML private TableColumn<ClienteDTO, String> tcCEPCliente;
    @FXML private TableColumn<ClienteDTO, String> tcComplementoCliente;
    @FXML private ObservableList<ClienteDTO> clientesObservableList;

    public ClienteController(CadastroFacade cadastroFacade) {
        super();
        this.cadastroFacade = cadastroFacade;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clientesObservableList = FXCollections.observableArrayList();
        tvListaClientes.setItems(clientesObservableList);

        carregarClientes();
    }

    @FXML
    public void onInserirClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/fatec/lanchoneteapp/run/cliente/CadastroCliente.fxml"
        ));
        Parent form = loader.load();

        ClienteFormController controller = loader.getController();
        controller.setCadastroFacade(cadastroFacade);

        Stage stage = new Stage();
        stage.setTitle("Novo Cliente");
        stage.setScene(new Scene(form));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        carregarClientes();
    }

    private void carregarClientes() {
        try {
            clientesObservableList.clear();
            clientesObservableList.addAll(cadastroFacade.listarClientes());
        } catch (SQLException e) {
            criarErrorAlert("Ocorreu um erro", e.getMessage() + "\n" + e.getSQLState());
        }
    }

    private void criarErrorAlert(String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText(header);
        alert.setContentText(content);

        alert.showAndWait();
    }
}
