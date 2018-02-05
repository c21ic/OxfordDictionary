package test;

import app.Dictionary;

import java.util.Scanner;

public class guessingGameProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String randWord = Dictionary.getRandomWord();
        String randWordDef = Dictionary.getDefinition(randWord);

        // Show random word and definition
        //System.out.println("The word is " + randWord);
        System.out.println("The definition is " + randWordDef);

        /*
        Other information
        System.out.print("Here is the word without vowels: ");
        String noVowels = randWord.replaceAll("[aeiou]", "-");
        System.out.println(noVowels);
        */

        System.out.println("The word has " + randWord.length() + " letters.");

        System.out.println("The first letter is " + randWord.charAt(0) + ".");
        System.out.println("Can you guess what the word is?");
        String guess = scan.nextLine();
        if (guess.equals(randWord)) {
            System.out.println("Great job! You got it right.");
        }
        else {
            System.out.println("You got it wrong, the word was actually " +randWord + " better luck next time.");
        }


        scan.close();
    }
}