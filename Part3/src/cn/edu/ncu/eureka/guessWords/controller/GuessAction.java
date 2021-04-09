package cn.edu.ncu.eureka.guessWords.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class GuessAction {
    public Button guessBtn;
    @FXML
    private Label wordTxt;
    @FXML
    private TextField inputTxt;

    Random random = new Random();
    String[] words = {"executive", "conduct", "present", "implement", "demonstrate", "issue"};
    int n;
    StringBuilder word;
    StringBuilder guess;
    int cnt;
    int wrong;
    char letter;

    public void initialize() {
        n = random.nextInt(words.length);
        word = new StringBuilder(words[n]);
        guess = new StringBuilder(words[n].length());
        cnt = 0;
        wrong = 0;
        guess.append("*".repeat(words[n].length()));
        wordTxt.setText(guess.toString());
    }

    public void click() {
        if (cnt < words[n].length()) {
            letter = inputTxt.getText().charAt(0);
            int mark = 0;
            int repeat = 0;
            for (int i = 0; i < words[n].length(); i++) {
                if (letter == word.charAt(i) && guess.charAt(i) == '*') {
                    guess.replace(i, i + 1, inputTxt.getText());
                    mark = 1;
                    cnt++;
                } else if (letter == word.charAt(i) && guess.charAt(i) != '*' && repeat == 0) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("猜单词游戏");
                    alert.setHeaderText("游戏提示");
                    alert.setContentText("字母 " + letter + " 已经在单词中");
                    alert.showAndWait();
                    repeat = 1;
                    mark = 1;
                    wrong++;
                }
            }
            if (mark == 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("猜单词游戏");
                alert.setHeaderText("游戏提示");
                alert.setContentText("字母 " + letter + " 不在单词中");
                alert.showAndWait();
                wrong++;
            }
            wordTxt.setText(guess.toString());
            inputTxt.clear();
        }
        if (cnt >= words[n].length()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("猜单词游戏");
            alert.setHeaderText("游戏结束");
            alert.setContentText("单词为 " + words[n] + "\n你总共猜错了 " + wrong + " 次\n" + "点击确定再来一局");
            alert.showAndWait();
            initialize();
        }
    }
}
