import java.util.*;

public class Lab_5_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a sentence (or type 'quit' to exit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            countVowels(input);
        }

        sc.close();
    }

    public static void countVowels(String sentence) {
        int A = 0, E = 0, I = 0, O = 0, U = 0;

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c == 'a') {
                A++;
            } else if (c == 'e') {
                E++;
            } else if (c == 'i') {
                I++;
            } else if (c == 'o') {
                O++;
            } else if (c == 'u') {
                U++;
            }
        }

        System.out.println("Count of vowels in the sentence:");
        System.out.println("A: " + A);
        System.out.println("E: " + E);
        System.out.println("I: " + I);
        System.out.println("O: " + O);
        System.out.println("U: " + U);
    }
}
