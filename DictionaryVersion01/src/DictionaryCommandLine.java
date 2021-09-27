public class DictionaryCommandLine {
    /**
     * show all words in dictionary.
     * @param dictionary is object of Dictionary
     */
    public void showAllWords(Dictionary dictionary) {
        System.out.println("No\t\t\t|Eng\t\t\t|Vie");

        for (int i = 0; i < dictionary.bank_word.size(); i++) {
            System.out.println((i + 1) + "\t\t\t|" + dictionary.bank_word.get(i).getTarget()
                                    + "\t\t\t|" + dictionary.bank_word.get(i).getExplain());
        }
    }

    public void dictionaryBasic() {
        DictionaryManagement newManagement = new DictionaryManagement();
        Dictionary bankWords = newManagement.insertFromCommandline();
        DictionaryCommandLine newCommandLine = new DictionaryCommandLine();
        newCommandLine.showAllWords(bankWords);
    }
}
