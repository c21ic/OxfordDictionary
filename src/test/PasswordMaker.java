package test;

import app.Dictionary;

import java.util.Scanner;

public class PasswordMaker {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String randWord = Dictionary.getRandomWord();
        String randWord2 = Dictionary.getRandomWord();
        String password = randWord + randWord2;
        int passwordlength = password.length();

        password = (randWord + randWord2);
        while (passwordlength <= 8) {
            randWord = Dictionary.getRandomWord();
            randWord2 = Dictionary.getRandomWord();
            password = randWord + randWord2;
            passwordlength = password.length();
        }
        String novowels = randWord;
        String novowels1 = randWord2;

        novowels = novowels.replaceAll("a", "4");
        novowels1 = novowels1.replaceAll("a", "4");
        novowels = novowels.replaceAll("e", "3");
        novowels1 = novowels1.replaceAll("e", "3");
        novowels = novowels.replaceAll("i", "1");
        novowels1 = novowels1.replaceAll("i", "1");
        novowels = novowels.replaceAll("o", "0");
        novowels1 = novowels1.replaceAll("o", "0");
        novowels = novowels.replaceAll("u", "6");
        novowels1 = novowels1.replaceAll("u", "6");
        password = novowels + novowels1;

        String upper = password.toUpperCase();
        System.out.println("Your password is " + password);
        System.out.println("Do you like this password?");
        String response = scan.nextLine();

        if (response.equals("yes")) {
            System.out.println("Great");
        } else {
            System.out.println("Ok, you will be given a new password.");
            String randWord3 = Dictionary.getRandomWord();
            String randWord4 = Dictionary.getRandomWord();

            String password1 = (randWord3 + randWord4);
            int password1length = password1.length();
            while (password1length <= 8) {
                randWord3 = Dictionary.getRandomWord();
                randWord4 = Dictionary.getRandomWord();
                password1 = randWord3 + randWord4;
                password1length = password1.length();
            }

            String novowels2 = randWord3;
            String novowels3 = randWord4;

            novowels2 = novowels2.replaceAll("a", "4");
            novowels3 = novowels3.replaceAll("a", "4");
            novowels2 = novowels2.replaceAll("e", "3");
            novowels3 = novowels3.replaceAll("e", "3");
            novowels2 = novowels2.replaceAll("i", "1");
            novowels3 = novowels3.replaceAll("i", "1");
            novowels2 = novowels2.replaceAll("o", "0");
            novowels3 = novowels3.replaceAll("o", "0");
            novowels2 = novowels2.replaceAll("u", "6");
            novowels3 = novowels3.replaceAll("u", "6");
            password1 = novowels2 + novowels3;

            String upper1 = password1.toUpperCase();
            System.out.println("Your password is " + password1);

        }
    }

}

