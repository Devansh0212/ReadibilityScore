import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stage4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input file specified");
            return;
        }
        String filePath = "file.txt";
        String text = readFile(filePath);



        int characters = countCharacters(text);
        int words = countWords(text);
        int sentences = countSentences(text);

        double score = calculateScore(characters, words, sentences);
        String ageRange = calculateAgeRange(score);

        System.out.println("The text is:\n" + text);
        System.out.println("Words: " + words);
        System.out.println("Sentences: " + sentences);
        System.out.println("Characters: " + characters);
        System.out.println("The score is: " + Math.round(score * 100) / 100.0);
        System.out.println("This text should be understood by " + ageRange + " year-olds.");
    }

    private static String readFile(String filename) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private static int countCharacters(String text) {
        return text.replaceAll("\\s+", "").length();
    }

    private static int countWords(String text) {
        return text.split("\\s+").length;
    }

    private static int countSentences(String text) {
        String[] sentences = text.split("[.!?]+");
        int count = sentences.length;
        // Adjust the count for cases where there are trailing punctuation marks
        if (text.matches(".*[.!?]\\s*$")) {
            count--;
        }
        return count;
    }

    private static double calculateScore(int characters, int words, int sentences) {
        return (4.71 * (characters / (double) words) + 0.5 * (words / (double) sentences) - 21.43);
    }

private static String calculateAgeRange(double score) {
    int roundedScore = (int) Math.ceil(score);
    int lowerAge = (roundedScore >= 2) ? roundedScore + 4 : roundedScore + 5;
    int upperAge = roundedScore + 5;
    return lowerAge + "-" + upperAge;
}
}
