package vowels_interface;

import java.util.ArrayList;
import java.util.List;

public class FindVowels {

    public void findVowels(String word, VowelsListener vc) {

        List<String> v = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {

            char w = word.charAt(i);

            if (w == 'a' || w == 'i' || w == 'o' || w == 'e' || w == 'u') {
                v.add(String.valueOf(w));
            }
        }

        if (v.isEmpty()) {
            vc.onNoVowelsFound();

        } else {
            vc.onVowelsFound(v);
        }
    }

}
