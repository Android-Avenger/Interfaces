package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitData {

    public static void getData(String filePath , ParseLine pL) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(filePath);
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNextLine()) {

            String myLine = scanner.nextLine();
            String s = myLine.replaceAll("\\s+", " ").trim();
            List<String> ml = new ArrayList<>(List.of(s.split(" ")));
            Pattern p = Pattern.compile("\"([^\"]*)\"");
            Matcher m = p.matcher(s);

            while (m.find()) {
                ml.set(0, m.group(1));
            }

            for (int i = 0 ; i < ml.size() ; i++ ){
                if (ml.get(i).contains("\"")){
                    ml.remove(i);
                }
            }

            pL.onReadFile(
                    "name : " + ml.get(0),
                    "email : " + ml.get(1),
                    "phone # : " + ml.get(2),
                    "CNIC : " + ml.get(3)
            );

            System.out.println("\n \n");

        }
    }
}
