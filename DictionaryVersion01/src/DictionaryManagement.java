import java.awt.*;
import java.util.Scanner;

public class DictionaryManagement {
    // input 1 new word
    private Word inputWord() {
        Word words = new Word();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input New Word: ");
        words.setTarget(scanner.nextLine());
        System.out.println();

        System.out.print("Input the explain: ");
        words.setExplain(scanner.nextLine());
        return words;
    }

    //input N new words
    public Dictionary insertFromCommandline() {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of words: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(i+1);
            dictionary.bank_word.add(inputWord());
        }
        return dictionary;
    }
}
