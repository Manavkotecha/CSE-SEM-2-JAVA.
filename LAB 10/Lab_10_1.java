
import java.io.*;

public class Lab_10_1 {

    public static void main(String[] args) {
        try {
            File f1 = new File("xyz.txt");

            if (!f1.exists()) {
                throw new FileNotFoundException("File not found.");
            }

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split(" ");
                wordCount += words.length;
                line = br.readLine();
            }

            br.close();

            System.out.println("characters: " + charCount);
            System.out.println("words: " + wordCount);
            System.out.println("lines: " + lineCount);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
