import java.util.Scanner;

import static utils.Constants.*;

public class Main {

    public static void main(String[] args) {
        chooser();
    }

    public static void chooser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                What do you want to do?
                1-Write new file;
                2-Read existing file;
                Enter a action number:""");
        int answer = scanner.nextInt();
        if (answer == 1) {
            FileWriteService.writeFile();
        } else if (answer == 2) {
            FileReadService.readFile();
        } else System.out.println("Error occured");
    }

    //    Введення назви файлу (без розширення) та
//    його текстовий контент реалізуйте через
//    Scanner, у класі Main.
    protected static void getWriteData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you text: ");
        text = scanner.nextLine().trim();
        System.out.println("Enter file name without extension, e.g. ``notes``: ");
        fileName = scanner.nextLine().trim();
        fileExtension = ".txt";
    }

    protected static String getReadData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input file, for example, ``notes``: ");
        fileName = scanner.nextLine().trim();
        fileExtension = ".txt";
        return fileName + fileExtension;
    }
}
