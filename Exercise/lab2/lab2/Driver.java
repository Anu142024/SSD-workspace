package lab2;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");

        String sentence = s.nextLine();

        Counter wp = new WordProcessor();

        System.out.println("Letters: " + wp.countLetters(sentence));
        System.out.println("Length: " + wp.getLength(sentence));
        System.out.println("Words: " + wp.countWords(sentence));

        WordProcessor wp2 = new WordProcessor();

        wp2.setText("This is some default text");

        System.out.println("Letters : " + wp2.countLetters(null));
        System.out.println("Length : " + wp2.getLength(null));
        System.out.println("Words : " + wp2.countWords(null));
    }
}
