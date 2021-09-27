import java.io.IOException;
import java.util.Scanner;

public class DictionaryCommandLine {
    /**
     * show all words in dictionary.
     *
     * @param dictionary is object of Dictionary
     */
    public void showAllWords(Dictionary dictionary) {
//        System.out.println("No\t\t\t|Eng\t\t\t|Vie");
//        for (int i = 0; i < dictionary.bankWord.size(); i++) {
//            System.out.println((i + 1) + "\t\t\t|" + dictionary.bankWord.get(i).getTarget()
//                                    + "\t\t\t|" + dictionary.bankWord.get(i).getExplain());
//        }

        System.out.printf("%-10s |%-30s |%-30s \n", "No.", "English", "Vietnamese");
        for (int i = 0; i < dictionary.bankWord.size(); i++) {
            System.out.printf("%-10d |%-30s |%-30s \n", (i + 1), dictionary.bankWord.get(i).getTarget()
                    , dictionary.bankWord.get(i).getExplain());
        }
    }

    public void dictionaryBasic() throws IOException {
        DictionaryManagement newManagement = new DictionaryManagement();
        Dictionary bankWords = newManagement.insertFromCommandline();

        DictionaryCommandLine newCommandLine = new DictionaryCommandLine();
        newCommandLine.showAllWords(bankWords);
    }

    public void dictionaryAdvanced() {
        DictionaryManagement newManagement = new DictionaryManagement();
        Dictionary bankWords = newManagement.insertFromFile();
        DictionaryCommandLine newCommandLine = new DictionaryCommandLine();

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------Select one:-------------");
        System.out.println("0: Back to main program.");
        System.out.println("1: Dictionary Lookup.");
        System.out.println("2: Show All Words.");

        int select = 1;
        do {
            System.out.println("\n------------\nEnter your select:");
            select = scanner.nextInt();
            switch (select) {
                case 0:
                    break;
                case 1:
                    newManagement.dictionaryLookup();
                    break;
                case 2:
                    newCommandLine.showAllWords(bankWords);
                    break;
            }
        } while (select != 0);
    }

    /**
     * input a or a little characters, computer will show all words in dictionary start by it.
     */
    public void dictionarySearcher() {
    }
}
