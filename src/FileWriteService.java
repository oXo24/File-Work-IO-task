import java.io.FileOutputStream;
import java.io.IOException;
import static utils.Constants.*;

public class FileWriteService {

    public static void writeFile() {
        Main.getWriteData();
        getOutput(handleData());
    }

    private static String handleData() {
        return handleFile(text, fileName);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }

    public static String handleFile(String myText, String fileName) {
        try {
            FileOutputStream fout =
                    new FileOutputStream(PATH_IN + fileName + fileExtension);
            byte[] byteArr = myText.getBytes();
            fout.write(byteArr, 0, byteArr.length);
            fout.close();
        } catch (IOException ex) {
            return ex.getMessage();
        }
        return "Success!";
    }
}
