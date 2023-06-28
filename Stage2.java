// package readability;
import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String text = scanner.nextLine();

        // Split the text into sentences using punctuation marks as delimiters
        String[] sentences = text.split("[.!?]");

        int totalWords = 0;
        for (String sentence : sentences) {
            // Count the number of words in each sentence
            String[] words = sentence.trim().split("\\s+");
            totalWords += words.length;
        }

        // Calculate the average number of words per sentence
        double averageWords = (double) totalWords / sentences.length;

        // Determine if the text is easy or hard to read based on the average number of words per sentence
        if (averageWords > 10) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}


