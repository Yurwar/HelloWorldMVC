package com.yurwar.view;

public class View {
    public static final String INCORRECT_INPUT = "Incorrect input, please repeat.";
    public static final String USER_INPUT_WORD = "Your word is: ";
    public static final String ENTER_WORD = "Enter the word ";
    public static final String USAGE = "Usage: Enter given words to get their concatenation";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
