package org.imie.projetbts;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.imie.projetbts.Model.Book;
import org.imie.projetbts.Model.Categorie;
import org.imie.projetbts.Model.manageBook;

import java.sql.SQLException;

public class CategorieController {
    public TableView<Categorie> tablCategorie;
    public TableColumn<Categorie, String> colNom;
    public TableColumn<Categorie, Integer> colNombreDeLivre;
    public TextField txtCategorie;

    public void initialize() throws SQLException {
        manageBook mngB = new manageBook();
        colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colNombreDeLivre.setCellValueFactory(new PropertyValueFactory<>("nb"));
        tablCategorie.setItems(FXCollections.observableArrayList(mngB.categorieCount()));
    }

    public void onAddCategorie(ActionEvent actionEvent) {
    }

    public void onDeleteCategorie(ActionEvent actionEvent) {
    }
}
