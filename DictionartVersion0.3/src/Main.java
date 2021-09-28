import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Version 0.2 of Dictionary by java");
        DictionaryCommandLine ver = new DictionaryCommandLine();

        //optional: bao giờ test hoặc có GUI thì đóng cái này
        int select = -1;
        do {
            System.out.println("-------------Dictionary Command Line--------------\n");
            System.out.println("Các tùy chọn:");
            System.out.println("0: Thoát chương trình");
            System.out.println("1: Phiên bản commnline cơ bản (v0.1)");
            System.out.println("2: Phiên bản commanline nâng cao (v0.2)");
            System.out.println("3: Phiên bản commanline nâng cao (v0.3)");
            System.out.print("Lựa chọn và ấn Enter để tiếp tục: ");
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            select = scanner.nextInt();

            switch (select) {
                case 0:
                    System.out.println("Đang đóng chương chương...");
                    Thread.sleep(500);
                    System.out.println("Bye....:(");
                    break;
                case 1:
                    ver.dictionaryBasic();
                    break;
                case 2:
                    //ver.dictionaryAdvanced();
                    break;
                case 3:
                    ver.dictionaryAdvanced();
                    break;
                default:
                    break;
            }
        } while (select != 0);
    }
}
