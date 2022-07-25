package vowels_interface;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        FindVowels fv = new FindVowels();

        VowelsListener vL = new VowelsListener() {
            @Override
            public void onVowelsFound(List<String> vowels) {
                System.out.println(vowels);
            }

            @Override
            public void onNoVowelsFound() {

                System.out.println("no vowel Found");
            }
        };

     //   fv.findVowels("ioiok",vL);
          fv.findVowels("ttttt",vL);

    }
}
