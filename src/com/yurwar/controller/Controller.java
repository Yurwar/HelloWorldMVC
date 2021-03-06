package com.yurwar.controller;

import com.yurwar.model.Model;
import com.yurwar.view.View;

public class Controller {
    private Model model;
    private View view;
    private ConsoleReader reader;
    private final String FIRST_WORD = "Hello";
    private final String SECOND_WORD = "world!";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.reader = new ConsoleReader();
    }

    public void processUser() {
        view.printMessage(View.USAGE);

        String inputFirstWord = getVerifiedWordFromUser(FIRST_WORD);
        String inputSecondWord = getVerifiedWordFromUser(SECOND_WORD);

        view.printMessage(model.concatWords(inputFirstWord, inputSecondWord));
    }

    private String getVerifiedWordFromUser(String verifyingWord) {
        String inputWord;

        view.printMessage(View.ENTER_WORD + verifyingWord);

        while (true) {
            inputWord = reader.getUserWord();
            view.printMessage(View.USER_INPUT_WORD + inputWord);
            if (inputWord.equals(verifyingWord)) {
                break;
            } else {
                view.printMessage(View.INCORRECT_INPUT);
            }
        }
        return inputWord;
    }
}
