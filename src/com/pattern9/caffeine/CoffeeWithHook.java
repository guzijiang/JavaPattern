package com.pattern9.caffeine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Coffee --- brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee --- addCondiments");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk (y/n) ? ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("IO error ");
        }
        if (answer == null) {
            answer = "n";
        }
        return answer;
    }
}
