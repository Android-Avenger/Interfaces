package file_handling;

import java.io.FileNotFoundException;

public class EventEmitter implements ParseLine{

    void test(String filepath) throws FileNotFoundException {
        SplitData.getData(filepath,this);
    }
    @Override
    public void onReadFile(String name, String email, String phoneNumber, String cnic) {

        System.out.println(name);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(cnic);
    }
}
