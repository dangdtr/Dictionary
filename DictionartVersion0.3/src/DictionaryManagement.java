import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;

public class DictionaryManagement {

    /**
     * Đăng: mới chuyển cái khai báo của các hàm ra đây đấy.
     * khai báo bên trong nó không đông nhất khi gọi hàm.
     */
    Dictionary dictionary = new Dictionary();

    /**
     * Version 0.1.
     * "format" and insert 2 field to word.
     * in order to input N words from cmd.
     * @return a word (form Word object).
     */
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

    /**
     * Version 0.1 -> 0.3.
     * input N words from cmd.
     * @return dictionary (this is a list of Word objects).
     */
    public Dictionary insertFromCommandline() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of words: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(i + 1);
            dictionary.bankWord.put(inputWord().getTarget(), inputWord().getExplain());
        }
        return dictionary;
    }


    /**
     * Version 0.2.
     * "format" using Regex and insert all fields to Word.
     * @return a word (form Word object).
     */
    private Word inputWordImprove(String data) {
        Word newWord = new Word();
        String[] str = data.split("\\s+", 2);
        newWord.setTarget(str[0]);
        newWord.setExplain(str[1]);
        return newWord;
    }
    /**
     * Version 0.2 -> 0.3.
     * reads data from file.
     * @return dictionary (this is a list of Word objects).
     */
    public Dictionary insertFromFile() {

        try {
            File fileObj = new File("res/dictionaries.txt");
            Scanner myReader = new Scanner(fileObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dictionary.bankWord.put(inputWordImprove(data).getTarget(), inputWordImprove(data).getExplain());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return dictionary;
    }

    /**
     * version 0.2 -> 0.3.
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
     * insert a word.
     * check this word is in dictionary ?
     */
    public void insertWord() {

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

    }

}
