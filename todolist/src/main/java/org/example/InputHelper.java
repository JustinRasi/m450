package org.example;

import java.util.Scanner;

public class InputHelper {
    private Scanner scanner;

    public InputHelper() {
        this.scanner = new Scanner(System.in);
    }

    public int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

}
