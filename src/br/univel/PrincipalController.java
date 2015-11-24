package br.univel;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrincipalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txfcodigo;

    @FXML
    private TextField txfnome;

    @FXML
    void salvar(ActionEvent event) {
    	String codigo = txfcodigo.getText();
    	String nome = txfnome.getText();
    	
    	System.out.println(codigo +"\t"+ nome);
    }

    @FXML
    void initialize() {
        assert txfcodigo != null : "fx:id=\"txfcodigo\" was not injected: check your FXML file 'Principal.fxml'.";
        assert txfnome != null : "fx:id=\"txfnome\" was not injected: check your FXML file 'Principal.fxml'.";

    }
}

