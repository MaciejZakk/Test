import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadingFileExamples {
    public static void main(String[] args) throws IOException {

        /** Read entire file content as single string examples */

        String content = new Scanner(new File("C:/Users/macio/Desktop/Data2.txt")).useDelimiter("\\Z").next();
        String content2 = new String(Files.readAllBytes(Paths.get("C:/Users/macio/Desktop/Data2.txt")));
        String content3 = FileUtils.readFileToString(new File("C:/Users/macio/Desktop/Data2.txt"), "UTF-8");

        System.out.println(content);
        System.out.println(content2);
        System.out.println(content3);

        /** Read file content line by line, put lines into List and sort this list */

        List<String> input = Files.readAllLines(new File("C:/Users/macio/Desktop/Data2.txt").toPath());
        Collections.sort(input);

        for (String line : input) {
            System.out.println(line);
        }
    }
}
