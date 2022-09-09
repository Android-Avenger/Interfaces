package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitData {

    public static void getData(String filePath, ParseLine pL) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(filePath);
        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNextLine()) {

            String myLine = scanner.nextLine().trim();

            List<String> s = new ArrayList<>();
            List<String> ss;

            //remove spaces
            ss = List.of(myLine.split(" "));
            System.out.println(ss);
            for (String value : ss) {
                if (value.chars().anyMatch(Character::isAlphabetic) ||
                        value.chars().anyMatch(Character::isDigit)) {
                    s.add(value);
                }
            }
            //get name with double quotes

            String name = " ";
            for (int i = 0; i < s.size(); i++) {
                if (s.get(i).contains("\"")) {
                    name = name + s.get(i);
                }
            }

            String nameWithoutQoutes = "";
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    nameWithoutQoutes = nameWithoutQoutes + c;
                }
            }

            String nName = "";
            for (int i = 0; i < nameWithoutQoutes.length(); i++) {
                char ch = nameWithoutQoutes.charAt(i);
                if (Character.isUpperCase(ch)) {
                    nName = nName + ' ';
                    nName = nName + nameWithoutQoutes.charAt(i);
                } else {
                    nName = nName + ch;
                }
            }

            //remove element with double quotes in list

            for (int i = 0; i < s.size(); i++) {
                if (s.get(i).contains("\"")) {
                    s.remove(i);
                }
            }

            //converting list into array
            String[] str = new String[s.size()];
            for (int i = 0; i < s.size(); i++) {
                str[i] = s.get(i);
            }


            for (int k = 0; k < str.length; k++) {
                if (str[k].contains("\"")) {
                    str[k] = nName.trim();
                }
            }
            System.out.println("\n");

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            pL.onReadFile(
                    "name : " + str[0],
                    "email : " + str[1],
                    "phone : " + str[2],
                    "cnic : " + str[3]);
        }

    }

}

