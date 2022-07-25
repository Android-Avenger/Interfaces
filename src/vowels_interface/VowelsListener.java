package vowels_interface;

import java.util.List;

public interface VowelsListener {

    void onVowelsFound(List<String> vowels);
    void onNoVowelsFound();
}
