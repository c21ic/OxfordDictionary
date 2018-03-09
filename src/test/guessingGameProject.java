package test;

import app.Dictionary;

import java.util.Scanner;

public class guessingGameProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        // Show random word and definition
        //System.out.println("The word is " + randWord);
        while (score <5) {
            String randWord = Dictionary.getRandomWord();
            String randWordDef = Dictionary.getDefinition(randWord);
            System.out.println("Do you want to play the easy, medium or hard level?");
            String answer = scan.nextLine();
            if (answer.equals("easy")) {
                System.out.println("The definition is " + randWordDef);
                System.out.println("The word has " + randWord.length() + " letters.");

                System.out.println("The first letter is " + randWord.charAt(0) + ".");
                System.out.println("Can you guess what the word is?");
                String guess = scan.nextLine();
                if (guess.equals(randWord)) {
                    System.out.println("Great job, you got it right.");
                    score = score + 1;
                    System.out.println("Your score now equals " + score + "!");
                } else {
                    System.out.println("You got it wrong, the word was actually " + randWord + " better luck next time.");
                    score = score - 1;
                    System.out.println("Your score now equals " + score + "!");
                }
            } else if (answer.equals("medium")) {
                System.out.println("Would you rather get the word length or the first letter?");
                String answertoquestion = scan.nextLine();
                if(answertoquestion.equals("first letter")){
                    System.out.println("The definition is " + randWordDef);
                    System.out.println("The first letter of the word is " + randWord.charAt(0));
                }
                else if(answertoquestion.equals("word length")){
                    System.out.println("The definition is " + randWordDef);
                    System.out.println("The length of the word is " + randWord.length());
                }
               System.out.println("Can you guess what the word is?");
                String response = scan.nextLine();
                if(response.equals(randWord)){
                    System.out.println("Great job! You got it right.");
                    score = score + 2;
                    System.out.println("Your score now equals " + score);
                }
                else{
                    System.out.println("You got it wrong, the word was actually " + randWord + " better luck next time.");
                    score = score - 2;
                    System.out.println("Your score now equals " + score);
                }

            } else if (answer.equals("hard")) {
                String randWord1 = Dictionary.getRandomWord();
                String randWordDef1 = Dictionary.getDefinition(randWord1);
                System.out.println("The definition is " + randWordDef1);
                System.out.println("Can you guess what the word is?");
                String guess1 = scan.nextLine();
                if (guess1.equals(randWord1)) {
                    System.out.println("Great job! You got it right.");
                    score = score + 3;
                    System.out.println("Your score now equals " + score + " !");
                } else {
                    System.out.println("You got it wrong, the word was actually " + randWord1 + " better luck next time.");
                    score = score - 3;
                    System.out.println("Your score now equals " + score + " !");
                }

            } else {
                System.out.println("sorry that's not an option.");
            }
        }
        if (score >= 5) {
            System.out.println("Great job! You got a score of " + score + "! You won the game :)");
        }
    }
}


//System.out.println("The definition is " + randWordDef);

        /*
        Other information
        System.out.print("Here is the word without vowels: ");
        String noVowels = randWord.replaceAll("[aeiou]", "-");
        System.out.println(noVowels);
        */


