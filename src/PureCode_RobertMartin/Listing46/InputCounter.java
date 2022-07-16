package PureCode_RobertMartin.Listing46;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// After refactoring
public class InputCounter {
    private int lineCount = 0;
    private int charCount = 0;
    private int wordCount = 0;
    private final BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String toString() {
        return "lines: " + lineCount + ", chars: " + charCount + ", words: " + wordCount + "\n";
    }

    public void readAndCount() {
        try {
            String line;
            while ((line = buffer.readLine()) != null) {
                count(line);
            }
        } catch (IOException e) {
            printExceptionMessage(e);
        }
    }

    private void count(String line) {
        countLine();
        countChar(line);
        countWord(line);
    }

    private void countLine() {
        lineCount++;
    }

    private void countChar(String line) {
        charCount += line.length();
    }

    private void countWord(String line) {
        String[] words = line.split("\\W");
        wordCount += words.length;
    }

    private void printExceptionMessage(Exception e) {
        System.err.println("Error:" + e.getMessage());
    }
}