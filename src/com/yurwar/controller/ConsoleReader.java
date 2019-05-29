package com.yurwar.controller;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner sc;

    ConsoleReader() {
        this.sc = new Scanner(System.in);
    }

    public String getUserWord() {
        return sc.nextLine().trim();
    }
}
