package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pd = in.next();

        Password password = new Password();
        PasswordStrength strength = password.verifyPassword(pd);

        System.out.println(strength.toString());
    }
}
