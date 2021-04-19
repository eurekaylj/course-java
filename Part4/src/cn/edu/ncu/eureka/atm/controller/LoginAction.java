package cn.edu.ncu.eureka.atm.controller;

import cn.edu.ncu.eureka.atm.entity.ATM;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LoginAction {
    @FXML
    private TextField idTxt;
    @FXML
    private PasswordField passwordTxt;

    public void login() throws Exception{
        ATM atm = ATM.getInstance();
        String id = idTxt.getText();
        String password = passwordTxt.getText();
        if (atm.checkAccount(id,password)){
            Stage stage = new Stage();
            AnchorPane root = FXMLLoader.load(getClass().getResource("/cn/edu/ncu/eureka/atm/view/main.fxml"));
            Scene scene = new Scene(root,600,400);
            stage.setScene(scene);
            stage.show();

        }
    }
}
