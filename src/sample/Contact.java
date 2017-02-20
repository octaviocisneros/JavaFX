package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import static java.awt.SystemColor.text;

/**
 * Created by octavio on 2/20/17.
 */
    public class Contact {

    String name;
    String phone;
    String email;


        public Contact(String text, String text1, String text2) {
        this.name = text;
        this.phone = text1;
        this.email = text2;
    }
//
//        public void addname(String text) {
//            this.text = text;
//        }
//
//        public addphone(String text1) {
//            this.text = text1;
//        }
//
//        public addemail(String text2) {
//            this.text = text2;
//        }



    @Override
    public String toString(){
         return (name + ", " + phone + ", " + email);
    }


// "Alice Smith, 814-867-5309, alice@theironyard.com"

}
