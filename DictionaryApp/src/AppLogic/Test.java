package AppLogic;

import java.util.Set;

/**
 * class chỉ để test chức năng.
 */
public class Test {

    private static DictionaryManagement dictionaryManagement = new DictionaryManagement();
    public static void main(String[] args){
        dictionaryManagement.insertFromFile("./res/EVPart1.txt");
        Set<String> keySet = Dictionary.bankWord.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
    }
}
