package cn.edu.ncu.eureka.atm.controller;

import cn.edu.ncu.eureka.atm.entity.ATM;
import cn.edu.ncu.eureka.atm.entity.Account;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;

import java.net.URL;
import java.util.ResourceBundle;


public class ATMAction implements Initializable {
    @FXML
    public TextArea display;
    private ATM atm;
    private Account account;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.atm = ATM.getInstance();
        this.account = atm.getCurrentAccount();
        showInfo("%s%s，您好！".formatted(account.getName(),account.isGender()?"先生":"女士"));
    }

    @FXML
    public void ATMDeposit() {
        String moneyString = showDialog("存款", "请输入存款金额：");
        double money = Double.parseDouble(moneyString);
        atm.deposit(atm.getCurrentAccount(), money);
        showInfo("存款成功");
    }

    @FXML
    public void ATMWithdraw() {
        String moneyString = showDialog("取款", "请输入取款金额：");
        double money = Double.parseDouble(moneyString);
        atm.withdraw(atm.getCurrentAccount(), money);
        showInfo("取款成功");
    }

    @FXML
    public void ATMTransfer() {
        String idSting = showDialog("转账", "请输入转入的账户：");
        String moneyString = showDialog("转账", "请输入转账金额：");
        double money = Double.parseDouble(moneyString);
        atm.transfer(atm.getCurrentAccount(), atm.getAccount(idSting), money);
        showInfo("转账成功");
    }

    @FXML
    public void exit() {
        System.exit(0);
    }

    @FXML
    public void info() {
        display.setText("ID：%s\n姓名：%s\n性别：%s\n账户金额：%.2f\n".formatted(account.getId(), account.getName(), account.isGender() ? "男" : "女", account.getMoney()));
    }

    @FXML
    public void modify() {
        String idSting = showDialog("修改信息", "请您要修改的ID：");
        account.setId(idSting);
        showInfo("修改成功");
    }

    @FXML
    public String showDialog(String title, String content) {
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle(title);
        inputDialog.setHeaderText("ATM操作");
        inputDialog.setContentText(content);
        return inputDialog.showAndWait().get();
    }

    @FXML
    public void showInfo(String txt) {
        display.setText(txt+"\n余额：%.2f".formatted(account.getMoney()));
    }
}
