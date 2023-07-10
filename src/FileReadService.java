import utils.Constants;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadService {

    public static void readFile() {
        getOutput(getFileData(Main.getReadData()));
    }

    private static String getFileData(String file) { return handleReadFile(file);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }

    public static String handleReadFile(String file) {

        try(final BufferedReader br =
                    new BufferedReader(new InputStreamReader(
                            new FileInputStream(Constants.PATH_IN +
                                    file)))) {

            String str;
            StringBuilder stringBuilder = new StringBuilder();
            while ((str = br.readLine()) != null) {
                stringBuilder.append(str).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
