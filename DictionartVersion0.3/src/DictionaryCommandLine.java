import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

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
        Set<String> keySet = dictionary.bankWord.keySet();
        int i = 0;
        for (String val : keySet) {
            System.out.printf("%-10d |%-30s |%-30s \n", (i + 1), val, dictionary.bankWord.get(val));
            i++;
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
        Dictionary bankWords = newManagement.insertFromFile("res/dictionaries.txt");;
        DictionaryCommandLine newCommandLine = new DictionaryCommandLine();

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------Select one:-------------");
        System.out.println("0: Back to main program.");
        System.out.println("1: Dictionary Lookup.");
        System.out.println("2: Show All Words.");
        System.out.println("3: Add word.");
        System.out.println("4: Remove Word.");
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
                case 3:
                    newManagement.insertFromCommandline();
                    break;
                case 4:
                    newManagement.removeWord();
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
