package AppLogic;

import java.io.*;
import java.util.Scanner;
import java.util.Set;

public class DictionaryManagement {

    /**
     * Đọc từ từ file. còn nhiều lỗi: các từ chưa đúng format, data còn lỗi và lớn.
     * => cần khắc phục => Đăng
     */
    public void insertFromFile(String path) {
        try (Scanner scanner = new Scanner(new File(path))) {
            String buffer = "";
            while (scanner.hasNext()) {
                String data = scanner.nextLine();
                if (data.equals("") && !buffer.equals("")) {
                    String[] str = buffer.split(/*"(?= /)"*/ " |\n", 2);
                    //str[0] = str[0].replace("@", "");
                    //str[1] = "/" + str[1];
                    //Dictionary.bankWord.put(part1, part2);
                    buffer = "";
                } else {
                    buffer = buffer + "\n" + data;
                }
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    /**
     * chèn từ.
     * có 2 trường hợp? => có nên đổi kiểu trả về không?????
     */
    public void insertWord(String word, String meaning) {
        if (Dictionary.bankWord.containsKey(word)) {
            // In ra chỉ để test.
            //System.out.println("Exist!");
        } else {
            Dictionary.bankWord.put(word, meaning);
        }
    }


    /**
     * Xóa từ
     * có 2 trường hợp? => có nên đổi kiểu trả về không?????
     */
    public void removeWord(String word) {
        if (Dictionary.bankWord.containsKey(word)) {
            Dictionary.bankWord.remove(word);
        } else {
            //báo là không có từ đó trong từ điển. Có thể return để báo ra giao
            //System.out.println("Don't Exist!");
        }
    }


    public void editWord(String word, String meaning) {
        if (Dictionary.bankWord.containsKey(word)) {
            Dictionary.bankWord.replace(word, meaning);
        } else {
            Dictionary.bankWord.put(word, meaning);
        }
    }


    /*************************************************************
     * Cái hàm này rất quan trọng. Client nhập vào ô tìm kiếm thì
     * sẽ hiện ra danh sách các từ. Đợi giao diện rồi xử lý.
     */
    public void dictionarySearcher(String keyWord) {
        Set<String> keySet = Dictionary.bankWord.keySet();
        for (String key : keySet) {
            if (key.indexOf(keyWord) == 0) {
                //Danh sách các từ in ở đây.
                //System.out.printf("%-30s |%-30s \n", key, Dictionary.bankWord.get(key));
            }
        }
    }


    public void dictionaryExportToFile() throws IOException {
        String FILE_URL = "./res/output.txt"; // nen ghi vao source tu dien chu nhi ???
        File file = new File(FILE_URL);
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        Set<String> keySet = Dictionary.bankWord.keySet();
        for (String key : keySet) {
            outputStreamWriter.write(key);
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
        System.out.println("Done!");
    }


}
