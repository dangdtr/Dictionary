import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DictionaryManagement {
    Dictionary dictionary = new Dictionary();

    /**
     * Version 0.1.
     * input N words from cmd.
     * @return dictionary (this is a list of Word objects).
     */
    public Dictionary insertFromCommandline() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of words: ");
        
        /*Fix cái xuống dòng*/
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {
            System.out.println(i + 1);
            System.out.print("Input New Word: ");
            String wordTarget = scanner.nextLine();
            System.out.println();
            System.out.print("Input the explain: ");
            String wordExplain = scanner.nextLine();

            insertWord(wordTarget, wordExplain);
        }
        return dictionary;
    }

    /**
     * version 0.2.
     * lookup word from cmd.
     */
    public void dictionaryLookup() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word to look up: ");
        String wordLookUp = new String(scanner.nextLine());
        int checkSize = 0;
        Set<String> keySet = dictionary.bankWord.keySet();
        for (String val : keySet) {
            if (val.equals(wordLookUp)) {
                System.out.println("\n" + val + " mean: " + dictionary.bankWord.get(val));
                break;
            }
            checkSize++;
        }
        if (checkSize == dictionary.bankWord.size()) {
            System.out.println("Can't translate this word! :(");
        }
    }

    /**
     * insert the word from file.
     * @param path is the link to file dictionaries.txt
     */
    public Dictionary insertFromFile(String path) {
        try {
            Scanner scanner = new Scanner(new File(path));

            while (scanner.hasNext()) {
                String data = scanner.nextLine();
                String[] str = data.split("\\s+", 2);
                insertWord(str[0], str[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return dictionary;
    }
    /**
     * insert a word.
     * check this word is in dictionary ?
     */
    public void insertWord(String wordTarget, String wordExplain) {
        dictionary.bankWord.put(wordTarget, wordExplain);
    }

    /**
     * edit the word_explain/target.
     * check this word is in dictionary ?
     */
    public void editWord() {

    }

    /**
     * remove 1 word in dictionary.
     * check this word is in dictionary ?
     */
    public void removeWord() {
        Set<String> keySet = dictionary.bankWord.keySet();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the word you want to remove: ");
        String wordTarget = scanner.nextLine();
        for (String key : keySet) {
            if (key.equals(wordTarget)) {
                dictionary.bankWord.remove(wordTarget);
                break;
            } else {
                System.out.println("No exist!!!");
                break;
            }
        }
    }

    /**
     * export the new word from cmd to file.
     */
    public void dictionaryExportToFile() {

    }

}