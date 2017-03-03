package sample;

import com.sun.deploy.util.StringUtils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField text;

    @FXML
    TextField text1;

    @FXML
    TextField text2;


    public void addcontact() {
        //System.out.println("addItem");
        if (text.getText().equals("") || text1.getText().equals("") || text2.getText().equals("")) {
            return;
        } else {
            contacts.add(new Contact(text.getText(), text1.getText(), text2.getText()));
            text.setText("");
            text1.setText("");
            text2.setText("");
        }
//        if(Contact.equals(""))
//        {
//            addcontact().disable();
//        }


//        if ((contacts.getText(null) != null && !contacts.getText().isEmpty())) {
//            contacts.setText(text.getText() + " " + text1.getText() + text2.getText());
//        } else {
//            contacts.setText("Error");
//        }
    }


    public void addname() {
    }

    public void addphone() {
    }

    public void addemail() {
    }

//    public void addname() {
//        contacts.add( new Contact(text.getText()));
//        text.setText("");
//    }
//
//    public void addphone() {
//        contacts.add(new Contact(text1.getText()));
//        text1.setText("");
//    }
//    public void addemail() {
//        contacts.add(new Contact(text2.getText()));
//        text2.setText("");
//    }


    public void removecontact() {
        // System.out.println("removeItem");
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }

}
