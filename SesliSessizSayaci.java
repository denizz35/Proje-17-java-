import java.util.Scanner;

public class SesliSessizSayaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz:");
        String word = scanner.nextLine();

        int countVowels = 0;
        int countConsonants = 0;

        for (char letter : word.toCharArray()) {
            if (isVowel(letter)) {
                countVowels++;
            } else if (isConsonant(letter)) {
                countConsonants++;
            }
        }

        System.out.println("Sesli harf sayısı: " + countVowels);
        System.out.println("Sessiz harf sayısı: " + countConsonants);
    }

    private static boolean isVowel(char letter) {
        return "aeiouAEIOU".indexOf(letter) != -1;
    }

    private static boolean isConsonant(char letter) {
        return Character.isLetter(letter) && !isVowel(letter);
    }
}